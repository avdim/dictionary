package mvi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.launch

typealias Reducer<STATE, INTENT> = suspend (STATE, INTENT) -> STATE

interface Store<STATE, INTENT> {
    fun send(intent: INTENT)
    val stateFlow: StateFlow<STATE>
    val state get() = stateFlow.value
}

/**
 * Реализация Store из MVI архитектуры для слоя представления.
 * STATE - immutable состояние
 * INTENT - Действия, которые влияют на состояние
 * reducer - генерирует новое состояние
 */
fun <STATE, INTENT> CoroutineScope.createStore(init: STATE, reducer: Reducer<STATE, INTENT>): Store<STATE, INTENT> {
    val mutableStateFlow = MutableStateFlow(init)
    val channel: Channel<INTENT> = Channel(Channel.UNLIMITED)

    return object : Store<STATE, INTENT> {
        init {
            launch {
                channel.consumeAsFlow().collect { intent ->
                    mutableStateFlow.value = reducer(mutableStateFlow.value, intent)
                }
            }
        }

        override fun send(intent: INTENT) {
            launch {
                channel.send(intent)
            }
        }

        override val stateFlow: StateFlow<STATE> = mutableStateFlow
    }
}

typealias ReducerSE<STATE, INTENT, EFFECT> = suspend (STATE, INTENT) -> ReducerResult<STATE, EFFECT>

data class ReducerResult<STATE, EFFECT>(val state: STATE, val sideEffects: List<EFFECT> = emptyList())

/**
 * MVI по типу ELM с обработкой SideEffect-ов
 */
fun <STATE, INTENT, EFFECT> CoroutineScope.createStoreWithSideEffect(
    init: STATE,
    effectHandler: (store: Store<STATE, INTENT>, sideEffect: EFFECT) -> Unit,
    reducer: ReducerSE<STATE, INTENT, EFFECT>
): Store<STATE, INTENT> {
    lateinit var store: Store<STATE, INTENT>
    store = createStore(init) { state, intent ->
        val result = reducer(state, intent)

        result.sideEffects.forEach {
            effectHandler(store, it)
        }

        result.state
    }
    return store
}

fun <STATE : Any, EFFECT> STATE.noSideEffects() = ReducerResult(this, emptyList<EFFECT>())
fun <STATE : Any, EFFECT> STATE.addSideEffects(sideEffects: List<EFFECT>) = ReducerResult(this, sideEffects)
fun <STATE : Any, EFFECT> STATE.addSideEffect(effect: EFFECT) = addSideEffects(listOf(effect))
fun <S, E> resultState(state:S, vararg sideEffects:E) = ReducerResult<S,E>(state, sideEffects.toList())
fun <S, E> resultSideEffects(state:S, vararg sideEffects:E) = ReducerResult<S, E>(state = state, sideEffects.toList())
fun <S, E> doNothing(state:S) = resultSideEffects<S, E>(state = state)


fun <T, R> StateFlow<T>.mapStateFlow(scope: CoroutineScope, init: R, transform: suspend (T) -> R): StateFlow<R> {
    val result = MutableStateFlow(init)
    scope.launch {
        collect {
            result.value = transform(it)
        }
    }
    return result
}

fun <S1, S2, E1, E2> ReducerResult<S1, E1>.map(mapState: (S1) -> S2, mapEffect: (E1) -> E2): ReducerResult<S2, E2> =
    ReducerResult(
        state = mapState(state),
        sideEffects = sideEffects.map(mapEffect)
    )


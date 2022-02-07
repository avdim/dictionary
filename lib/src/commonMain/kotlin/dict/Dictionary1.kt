package dict

@OptIn(ExperimentalStdlibApi::class)
val dictionary1
    get() = Dictionary(
     name = "Англо-русский",
     useByDefault = true,
     words = buildList {
      word("stretch", "растягивать")
      word("fit", "поместить (уместить)")
      word("distribute", "распространять")
      word("effort", "усилие")
      word("suite", "набор")
      word("approach", "подход")
      word("manifold", "многообразие")
      word("rev", "оборот, сокращенная форма")
      word("torque", "крутящий момент")
      word("damping", "демпфирование (затухание)")
      word("pulley", "шкив (блочное соединение)")
      word("rope", "канат (верёвка)")
      word("polling", "выбор (long polling - длительный опрос)")
      word("pending", "в ожидании")
      word("tweak", "щипать, щупать, нащупыват, настроить")
      word("tweaking", "доводка, подгонка, подстройка")
      word("threshold", "граница, пороговое значение")
      word("interpose", "вклинить, встроить")
      word("seek", "искать, стремиться")
      word("flee", "избегать, бежать")
      word("arrive", "прибыть")
      word("reach", "достич добраться до")
      word("deceleration", "замедление")
      word("pursue", "преследовать")
      word("wander", "странствовать, блуждать, скитаться")
      word("obstacle", "препятствие")
      word("intercept", "перехват")
      word("transient", "переходный процес")
      word("bypass", "резервный путь, шунт")
      word("pass", "проходить, передать пас")
      word("pre", " ... - перед ..., (например pre-order - предзаказ)")
      word("ensure", "обеспечить, гарантировать")
      word("whisper", "шептать")
      word("fixture", "арматура (жёсткая конструкция), зажимное приспособление")
      word("rover", "пиратское судно, или луноход (Lunar rover), марсоход")
      word("subtract", "вычитать")
      word("Bezier curve", "кривая Безье")
      word("remain", "осталось (столько-то)")
      word("stay", "останься (дома)")
      word("preserve", "сохранять (reserve - заповедник, зарезервированно)")
      word("origin", "происхождение, начало, точка старта")
      word("reentrant", "входящий")
      word("persistent", "стойкий (persistence - упорство, выносливость)")
      word("spark", "искра")
      word("ignite", "воспломеняется")
      word("halt", "привал или стой (остановка)")
      word("foundation", "фундамент или фонд")
      word("fund", "фонд")
      word("reconciliation", "согласование, сверка, примерение")
      word("recognize", "осознавать, признавать")
      word("defer", "отложить, отсрочить")
      word("forwarding", "переадресация, проброс (port forwarding)")
      word("redirect", "перенаправление")
      word("backward", "назад")
      word("substitution", "замена")
      word("bundle", "пучок, связка")
      word("relate", "отношение, зависимость")
      word("coroutine", "сопрограмма")
      word("remain", "осталось столько-то")
      word("flyweight", "легковесный (паттерн Приспособленец)")
      word("mediator", "посредник")
      word("compose", "компоновать, составлять, сочинять (композитор)")
      word("composite", "композитный, составной (паттерн компоновщик)")
      word("proxy", "заместитель")
      word("bound", "связывание")
      word("pass", "передать, дать пасс (pass data - передавать данные)")
      word("violet", "фиолетовый")
      word("violate", "нарушать")
      word(
       "Доме́н (фр. domaine)",
       "область; единица структуры (владения короля или владение какого-либо феодала в Средние века)"
      )
      word("route", "маршрут")
      word("pick", "выбирать")
      word("fetch", "получать")
      word("pull", "тянуть")
      word("retain", "сохранить, удержать")
      word("inspire", "воодушевить inspired - вдохновлённый")
      word("spire", "шпиль")
      word("staged", "постановка, установка  (unstaged changes - неустановленные изменения)")
      word("nest", "гнездо nested - вложенный")
      word("explicit", "явный")
      word("implicit", "не явный")
      word("absence", "отсутствие")
      word("notice", "уведомление")
      word("rare", "редко")
      word("infer", "делать вывод, прогноз")
      word("inference", "логический вывод")
      word("consider", "рассматривается как (NaN is considered equal to itself), рассмотреть возможность")
      word(
       "treat",
       "рассматривать или осматривать, лечить (treated - обрабатывать) (treat the wound - обработать рану) (treat the surface - обработать поверхность)"
      )
      word("arbitrary", "произвольно")
      word("either", "либо (это либо то-то)")
      word("disambiguate", "устранять неоднозначность")
      word("clash", "конфликт, столкновение")
      word("tier", "ярус, уровень")
      word("tire", "шина, покрышка")
      word("shelf", "полка")
      word("shelve", "откладывать в долгий ящик")
      word("stash", "копить, заначка")
      word("underneath", "под копотом (под ногами)")
      word("appear", "появиться, отображаться")
      word("appearance", "внешность, внешний вид, появление")
      word("even", "даже (even number - чётное число)")
      word("customer", "клиент")
      word("obtain", "получать (информацию, отчёт)")
      word("propose", "предложить  (proposals - предложения)")
      word("enhancement", "усиление")
      word("shepherds", "пастухи, надзиратели")
      word("fold", "складывать в хранилище (оператор из функционального программирования)")
      word("reduce", "уменьшить")
      word("suspend", "приостановить")
      word("deferred", "отложенный")
      word("yield", "отдавать, уступать")
      word("bootstrap", "начальная загрузка (Bootstrap - популярная UI либа для web, в линуксе тоже есть значение)")
      word("negotiation", "согласование, переговоры (ContentNegotiation в ktor - когда Json автоприводится к классу)")
      word("orphan", "сирота")
      word("The backtick", "возврат  (The backtick (``) is actually called command substitution)")
      word("quote", "цита (single quotation mark - одинарная ковычка)")
      word("expose", "подвергать опасности, раскрывать")
      word("compat (compatibility)", " совместимость")
      word("ambiguous", "двусмысленно, неоднозначно")
      word("bump", "удар, bumper - бампер, bumps - бугорки, (bump kotlin version - поднять версию kotlin)")
      word("consume", "потреблять (consumer - потребитель)")
      word("facility", "объект (произведённый factory)")
      word("hang", "висеть")
      word("hang up", "повесит трубку")
      word("hangout", "болтаться, тусоваться")
      word("submit", "отправить, поместить")
      word("bare", "голый")
      word("convenient", "удобный")
      word("amend", "внести поправки")
      word("squash", "втиснуть, пюре, толкучка, втискиваться")
      word("milestone", "(mile stone - мильный камень, или отметка на дороге)")
      word("confine", "ограничивать")
      word("conflate", "объединять")
      word("propagation", "распространение")
      word("suppress", "подавлять")
      word("coarse", "грубо")
      word("exclude", "исключать")
      word("fair", "справедливый (fairy - фея)")
      word("arbitrary", "произвольный (произвольный индекс массива)")
      word("retrieve", "извлеакать, вернуть, отступить")
      word("peek", "заглянуть")
      word("poll", "опрос")
      word("spatial", "пространственный")
      word("distinct", "отчётливый, особый, уникальный.")
      word("either", "или")
      word("pull", "тащить")
      word("push", "толкать")
      word("nibble", "кусать, клёв (nibbler - зубастик)")
      word("dismiss", "отклонить")
      word("insurance", "страховка")
      word("claim", "заявка, запрос")
      word("preemptible virtual machine", "выгружаемая, прерываемая виртуальная машина (живущая не долгое время)")
      word("harm", "вред")
      word("acquire", "приобретать")
      word("opaque", "непрозрачный")
      word("exhaustive", "исчерпывающий (exhausted - исчерпан, истощен. exhaust - выхлоп)")
      word("advisor", "консультант")
      word("fan", "вентиляор, веер (fan out - разветвлять, fan in - соединять)")
      word("helm", "штурвал, руль. (Шлем - helmet)")
      word("sonic", "звуковой (supersonic - сверхзвуковой)")
      word("inset", "вставка")
      word("gap", "разрыв, зазор")
      word("afinity", "близость (proximity)")
      word("store presence", "страница приложеня в google console")
      word("ties", "связи, tie - галстук")
      word("vital", "жизненно необходимый")
      word("viable", "жизнеспособный")
      word("user acquisition", "привлечение пользователей, источники трафика (acquire - приобретать)")
      word("acquire", "приобретать")
      word(
       "accessibility allow to provide a more inclusive experience",
       "доступность позволяют обеспечить более всеохватывающий опыт"
      )
      word("inclusive", "включительно, всеохватывающе")
      word("crawl; crawler", "ползать; гусенечный (трактор), поисковый паук (web crawler)")
      word("eligible for", "право на (отвечает требованиям)")
      word("constrain", "ограничить")
      word("appeal", "обращение, аппиляция, призыв")
      word("invoice", "выставленный счет")
      word("supply", "поставка")
      word("crowd", "толпа")
      word("dispute", "спор")
      word("ascendant", "господствующий")
      word("survey", "опрос")
      word("competitor", "конкурент")
      word("bother", "беспокоить")
      word("disparate", "несоизмеримый")
      word("inappropriate", "несоответствующий")
      word("appropriate", "подходящий")
      word("proper", "правильный")
      word("frustration", "разочарование")
      word("look forward to", "ждать с нетерпением")
      word("evident", "очевидный")
      word("tedious", "нудный")
      word("aim", "цель")
      word("reliably", "надежно")
      word("consistent", "последовательный")
      word("consist", "состоять")
      word("ache", "боль (headache - головная боль)")
      word("interrupt", "прерывание")
      word("valuable", "ценный (valuable feedback - ценный отзыв)")
      word("identity", "идентичность")
      word("lane", "полоса дороги")
      word("recurring", "повторяющиеся")
      word("verge", "граница, обочина")
      word("diverge", "расходиться")
      word("divergence", "рассходимость")
      word("through", "через")
      word("notice", "уведомление")
      word("noticeable", "заметный")
      word("influence", "влияние")
      word("corresponding", "соответствующий")
      word("resident", "житель, обитель (residence - проживание)")
      word("excite", "возбуждают")
      word("evolve", "развиваться, эволюционировать")
      word("stumble", "спотыкаться")
      word("past", "прошлое, мимо")
      word("stick", "придерживаться, палка")
      word("exclusive", "эксклюзивный, исключающе")
      word("sight", "зрение, взгляд")
      word("appear", "появиться")
      word("assist", "помощь")
      word("sanity", "здравый смысл, вменяемость")
      word("saner", "здаромыслящий")
      word("certain", "определенный")
      word("adjust", "регулировать")
      word("this implies", "из этого следует")
      word("roam, roaming", "странствовать, роуминг")
      word("regardless", "несмотря на")
      word("perform", "выполнять")
      word("does not honor", "не соблюдает")
      word("inflated problem", "раздутая проблема")
      word("pane", "панель")
      word("stump", "пень")
      word("opt", " выбрать (не автоматически)")
      word("prune", "очистить, чернослив")
      word("purge", "чистка")
      word("sealed", "запечатанный")
      word("conclusive", "убедительный")
      word("sniffer", "перехватчик")
      word("disruption", "нарушение")
      word("counterparts", "двойник, коллега")
      word("gutter", "водосточный желоб")
      word("concerning", "относительно")
      word("favor", "одолжение")
      word("narrow", "сужать")
      word("omit", "Опустить")
      word("disruption budget", "срыв бюджета")
      word("voluntary disruption", "добровольное нарушение")
      word("quiet", "тихо")
      word("quite", "довольно")
      word("ad hoc", "для этого случая")
      word("thunk", "преобразователь")
      word("crunch", "хруст (затянуть пояс)")
      word("springboard", "трамплин")
      word("bearer", "предъявитель")
      word("perhaps", "возможно, может быть")
      word("topic", "тема")
      word("indent", "отступ")
      word("crumbs", "крошки (bread crumbs - хлебные крошки)")
      word("lookup", "искать")
      word("sneaky", "подлый")
      word("appreciate patience", "ценю терпение")
      word("appreciate", "ценить")
      word("patience", "терпение")
      word("discrepancy", "несоответствие")
      word("prorated", "пропорциональный")
      word("aware", "знать")
      word("is applicable", "применимо")
      word("deny", "отрицать")
      word("sweeper", "уборщик")
      word("shallow copy", "мелкая копия (не полная)")
      word("", "")
     }
    )

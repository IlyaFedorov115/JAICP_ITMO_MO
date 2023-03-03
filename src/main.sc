require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: /hello
        intent!: /привет
        a: Привет привет

    state: currency
        q!: курс
        a: 1$ это 70 рубл

    state: /weather
        q!: погода
        a: Тепло в спб

    state: /tmpcurr
        q!: currency
        go!: /currency

    state: /tmpweather
        q!: weather
        go!: /weather

    state: Bye
        intent!: /пока
        a: Пока пока
        
    state: /NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}
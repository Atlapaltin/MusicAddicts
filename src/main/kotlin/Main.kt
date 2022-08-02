fun main() {
    val musicAddict = false
    val purchase = 10002

    val result = if (purchase > 1001 && purchase < 10_000) purchase - 100
    else if (purchase > 10_001) (purchase * 0.95).toInt()
    else purchase

    val final = if (musicAddict) (result*0.99) else result
    println ("Стоимость Вашей покупки: $final руб.")
}
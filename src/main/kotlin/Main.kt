fun main(args: Array<String>) {
    val musicAddict = false
    val purchase = 10002

    val result = if (purchase > 1001 && purchase < 10_000) purchase - 100
    else if (purchase > 10_001) (purchase * 0.95).toInt()
    else purchase

    if (musicAddict) println(result*0.99) else println (result)
}
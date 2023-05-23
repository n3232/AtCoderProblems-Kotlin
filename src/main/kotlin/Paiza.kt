private fun readStr() = readln() // string line
private fun readInt() = readStr().toInt() // single int
private fun readStrings() = readStr().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun main(args: Array<String>) {
    val n = readInt()
    val list = readInts()
    ///
    var ans = 0
    var start = 0

    for (i in 0 until  7) {

    }

    

}

fun get1WeekList(i: Int, list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    var index = i
    while (index < list.size) {
        result.add(list[index])
        index++
    }

    return result
}

fun getGoodDayOf1Week(list: List<Int>):Int {
    val sum = list.sum()
    return if (list.size >= 6) {
        if (sum <=5) {
            list.size
        } else {
            0
        }
    } else  {
        list.size
    }
}




private fun b() {
    val n = readInt()
    var list = mutableListOf<Int>()
    for (i in 0 until n) {
        list.add(readInt())
    }

    var ans = 0
    var currentCarNo = 1
    var finished = 0

    while (finished != n) {
        for (i in list.indices) {
            if (currentCarNo == list[i]) {
                currentCarNo++
                finished++
            }
        }
        ans++
    }
    println(--ans)
}

private fun c097() {
    val (n, x, y) = readInts()
    for (i in 1.. n) {
        if (i % x == 0 && i % y == 0) println("AB")
        else if (i % x == 0) println("A")
        else if (i % y == 0) println("B")
        else println("N")
    }
}
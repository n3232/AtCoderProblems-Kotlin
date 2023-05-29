package easy

//https://atcoder.jp/contests/panasonic2020/tasks/panasonic2020_b
fun main(args: Array<String>) {

    val a1 = readLine()!!.split(" ").map { it.toInt() }
    val a2 = readLine()!!.split(" ").map { it.toInt() }
    val a3 = readLine()!!.split(" ").map { it.toInt() }
    val a = listOf<List<Int>>(a1, a2, a3)
    val n = readLine()!!.toInt()
    var b = mutableListOf<Int>()
    repeat(n) {
        b.add(readLine()!!.toInt())
    }

    var appear = mutableListOf<MutableList<Boolean>>()

    repeat(3) {
        appear.add(
            mutableListOf<Boolean>(false, false, false)
        )
    }

    for (i in 0..2) {
        for (j in 0..2) {
            appear[i][j] = a[i][j] in b
        }
    }

    for (i in 0..2) {
        if (appear[i][0] && appear[i][1] && appear[i][2]) {
            println("Yes")
            return
        }
    }
    for (j in 0..2) {
        if (appear[0][j] && appear[1][j] && appear[2][j]) {
            println("Yes")
            return
        }
    }

    if (appear[0][0] && appear[1][1] && appear[2][2]) {
        println("Yes")
        return
    }

    if (appear[0][2] && appear[1][1] && appear[2][0]) {
        println("Yes")
        return
    }

    println("No")

}


private fun readStr() = readLine()!! // string line
private fun readInt() = readLine()!!.toInt() // single int
private fun readStrings() = readLine()!!.split(" ") // list of strings
private fun readInts() = readLine()!!.split(" ").map { it.toInt() } // list of ints

// tips
private fun stringList() = "abc".toList() // ["a", "b", "c"]
//    println(a.joinToString("\n")) // each element of array/list of a separate line
//val a = List(n) {
//    readLine()!!.split(" ").map { it.toInt() }
//}

//for (i in 0 until n) {

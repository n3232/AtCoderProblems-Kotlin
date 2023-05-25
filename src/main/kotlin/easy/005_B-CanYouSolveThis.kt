package easy

fun main(args: Array<String>) {

    val (n, m, c) = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }
    val a = List(n) {
        readLine()!!.split(" ").map { it.toInt() }
    }

    val ans = a.map { row ->
        row.zip(b).map { it.first * it.second }.sum() + c
    }.count { it > 0 }

//    var result = 0
//    for (i in 0 until n) {
//        var ans = 0
//        for (j in 0 until m) {
//            ans += a[i][j] * b[j]
//        }
//        ans += c
//        if (ans > 0) result++
//    }
//    println(result)
}

//https://atcoder.jp/contests/abc121/tasks/abc121_b
//https://atcoder.jp/contests/abc121/submissions/41000698
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

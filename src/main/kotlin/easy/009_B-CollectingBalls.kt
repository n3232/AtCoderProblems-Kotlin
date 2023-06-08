package easy

//https://atcoder.jp/contests/abc074/tasks/abc074_b
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val k = readLine()!!.toInt()
    val X = readLine()!!.split(" ").map { it.toInt() }

    val ans = X.sumOf { minOf(it, k - it) * 2 }
    println(ans)
}


private fun readStr() = readLine()!! // string line
private fun readInt() = readLine()!!.toInt() // single int
private fun readStrings() = readLine()!!.split(" ") // list of strings
private fun readInts() = readLine()!!.split(" ").map { it.toInt() } // list of ints

// tips
private fun stringList() = "abc".toList() // ["a", "b", "c"]

//    println(a.joinToString("\n")) // each element of array/list of a separate line

//val a = List(4) {
//    readLine()!!.split(" ").map { it.toInt() }
//}

//for (i in 0 until n) {

//test case
//https://www.dropbox.com/sh/nx3tnilzqz7df8a/AAAYlTq2tiEHl5hsESw6-yfLa?dl=0
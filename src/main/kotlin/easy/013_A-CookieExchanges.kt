package easy

//https://atcoder.jp/contests/abc160/tasks/abc160_c
fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    val ans = calc(a, b, c)
    println(ans)
}

fun calc(a: Int, b: Int, c: Int, ans: Int = 0): Int {
    if (a == 1 && b == 1 && c == 1) return 0
    if (a == b && b == c) return -1
    if (a % 2 == 1 || b % 2 == 1 || c % 2 == 1) return ans
    return calc(
        b / 2 + c / 2,
        a / 2 + c / 2,
        a / 2 + b / 2,
        ans + 1
    )
}

// tips
//val s = readLine()!! // string line
//val i = readLine()!!.toInt() // single int
//val (a, b) = readLine()!!.split(" ") // list of strings
//val (i, j) = readLine()!!.split(" ").map { it.toInt() } // list of ints

//val list = (1..h).map { readLine()!! }
//private fun stringList() = "abc".toList() // ["a", "b", "c"]

//    println(a.joinToString("\n")) // each element of array/list of a separate line

//val a = List(4) {
//    readLine()!!.split(" ").map { it.toInt() }
//}

//for (i in 0 until n) {

//test case
//https://www.dropbox.com/sh/nx3tnilzqz7df8a/AAAYlTq2tiEHl5hsESw6-yfLa?dl=0
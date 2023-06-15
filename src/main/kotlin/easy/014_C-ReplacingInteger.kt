package easy

//https://atcoder.jp/contests/abc161/tasks/abc161_c
fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(" ").map { it.toLong() }
    val a = n % k
    val b = k - a
    println((minOf(a, b)))
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
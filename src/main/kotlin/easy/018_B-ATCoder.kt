package easy

import kotlin.math.max

fun main(args: Array<String>) {
    val S = readLine()!!
    val set = setOf('A', 'C', 'G', 'T')
    var ans = 0
    var current = 0

    for (c in S) {
        if (c in set) {
            current++
            ans = max(ans, current)
        } else {
            current = 0
        }
    }
    println(ans)

}

// tips
//val stringLine = readLine()!!
//val singleInt = readLine()!!.toInt()
//val (s1, s2) = readLine()!!.split(" ")
//val (i1, i2) = readLine()!!.split(" ").map { it.toInt() }

//val list = (1..h).map { readLine()!! }
//private fun stringList() = "abc".toList() // ["a", "b", "c"]

//    println(a.joinToString("\n")) // each element of array/list of a separate line

//val a = List(4) {
//    readLine()!!.split(" ").map { it.toInt() }
//}

//for (i in 0 until n) {

//test case
//https://www.dropbox.com/sh/nx3tnilzqz7df8a/AAAYlTq2tiEHl5hsESw6-yfLa?dl=0
package easy

fun main(args: Array<String>) {
    val (_, x) = readLine()!!.split(" ").map { n -> n.toInt() }
    val a = readLine()!!.split(" ").map { n -> n.toInt() }.sorted()
    var t = x
    var ans = 0

    for (i in 0 until a.size - 1) {
        if (t < a[i]) break
        t -= a[i]
        ans++

    }
    if (a.last() == t) ans++
    println(ans)
}

//val stringLine = readLine()!!
//val singleInt = readLine()!!.toInt()
//val (s1, s2) = readLine()!!.split(" ")
//val (i1, i2) = readLine()!!.split(" ").map { it.toInt() }

//val list = (1..h).map { readLine()!! }
//private fun stringList() = "abc".toList() // ["a", "b", "c"]

//    println(a.joinToString("\n")) // each element of array/list of a separate line

// n回入力を受け付けてリストに格納

//val inputList = (1..n).map {
//    readLine()?.toIntOrNull() ?: 0
//}
//val a = List(4) {
//    readLine()!!.split(" ").map { it.toInt() }
//}

//for (i in 0 until n) {

//test case
//https://www.dropbox.com/sh/nx3tnilzqz7df8a/AAAYlTq2tiEHl5hsESw6-yfLa?dl=0

// oledesm、mellotron 
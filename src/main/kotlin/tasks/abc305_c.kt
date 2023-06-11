package tasks

fun main(args: Array<String>) {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val list = (1..h).map { readLine()!! }
    val filterSorted = list.filter { it.contains("#") }.sortedBy { it.count { char -> char == '#' } }
    val picker = filterSorted[0]
    val noPicker = filterSorted[1]
    val ansI = list.indexOf(picker) + 1
    val ansJ = picker.zip(noPicker).indexOfFirst { it.first != it.second } + 1
    println("$ansI $ansJ")
}

//val map = (1..h).map { readLine()!! }

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
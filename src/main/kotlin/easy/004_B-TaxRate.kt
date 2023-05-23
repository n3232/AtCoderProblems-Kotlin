package easy

fun main(args: Array<String>) {
    val x = readLine()!!.toInt()
    repeat(x + 1) {
        if ((it * 1.08).toInt() == x) {
            println(it)
            return
        }
    }
    println(":(")
}
// https://atcoder.jp/contests/sumitrust2019/tasks/sumitb2019_b


//1079
//999.074074074074
//999

//1001
//926.8518518518518
//926

private fun readStr() = readLine()!! // string line
private fun readInt() = readLine()!!.toInt() // single int
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readln().split(" ").map { it.toInt() } // list of ints

// tips
private fun stringList() = "abc".toList() // ["a", "b", "c"]
//    println(a.joinToString("\n")) // each element of array/list of a separate line

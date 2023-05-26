package easy

//https://atcoder.jp/contests/panasonic2020/tasks/panasonic2020_b
fun main(args: Array<String>) {

    val (h, w) = readLine()!!.split(" ").map { it.toLong() }
    val ans =
        if (h == 1L || w == 1L) {
            1
        } else {
            (h * w + 1) / 2
        }
    println(ans)
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

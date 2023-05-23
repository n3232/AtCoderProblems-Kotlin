package easy

//https://atcoder.jp/contests/code-festival-2016-qualb/tasks/codefestival_2016_qualB_b
fun main(args: Array<String>) {

    val (n, a, b) = readLine()!!.split(" ").map { it.toInt() }
    val s = readLine()!!

    val sArray = s.toList()

    var aCount = 0
    var bCount = 0

    for (si in sArray) {

        if (aCount + bCount >= a + b) {
            println("No")
        } else if (si == 'a') {
            aCount++
            println("Yes")
        } else if (si == 'b' && bCount < b) {
            bCount++
            println("Yes")
        } else {
            println("No")
        }
    }
}

private fun readStr() = readLine()!! // string line
private fun readInt() = readln().toInt() // single int
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readln().split(" ").map { it.toInt() } // list of ints

// tips
private fun stringList() = "abc".toList() // ["a", "b", "c"]
//    println(a.joinToString("\n")) // each element of array/list of a separate line

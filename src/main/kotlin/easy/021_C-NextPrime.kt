package easy

fun main(args: Array<String>) {
    var x = readLine()!!.toInt()
    while (true) {
        if (isPrime(x)) {
            println(x)
            return
        } else {
            x++
        }
    }
}

fun isPrime(x: Int): Boolean {
    for (i in 2 until x) {
        if (x % i == 0) {
            return false
        }
    }
    return true
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
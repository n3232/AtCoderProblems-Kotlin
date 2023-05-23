
//mellotron
//nemosy11111

//https://qiita.com/drken/items/fd4e5e3630d0f5859067#4-practice-の次は
//まずは問題の傾向がハッキリと固まって来た 2016 年以降の問題を解いていくのがよいと思います。具体的には、ABC 042 ～最新です。

//Boot camp for Beginners
//https://kenkoooo.com/atcoder/#/training/Boot%20camp%20for%20Beginners

fun main(args
         : Array<String>) {
    abc042_b()

}


fun abc042_c() {
//    https://atcoder.jp/contests/abc042/submissions/3593877
//    https://atcoder.jp/contests/abc042/submissions/11732890

    val (n,k)= readLine()!!.split(" ").map { it.toInt() }
    val d = readLine()!!.replace(" ", "")
    val ans = (n..10000).first { it -> it.toString().all { it !in d } }



}



fun abc042_b() {
    val (N, L) = readLine()!!.split(" ").map { it.toInt() }
    val a = (0 until N).map { readLine()!!.toString() }.toMutableList().sorted().joinToString("")
    println(a)



//    val (a,b) = readLine()!!.split(" ").map{it.toInt()}
//    println((0 until a).map{readLine()!!.toString()}.toMutableList().sorted().joinToString(""))
}

fun abc042_a() {
//    https://atcoder.jp/contests/abc042/submissions/36522399
    val v = nextInts().sorted().joinToString("");
    if (v == "557") println("YES")
    else println("NO")
}

fun abc087_b() {
    val a = readInt()
    val b = readInt()
    val c = readInt()
    val x = readInt()
    var ans = 0
    for (i in 0..a) {
        for (j in 0..b) {
            for (k in 0..c) {
                if (x == i * 500 + j * 100 + k * 50) ++ans
            }
        }
    }
    println(ans)
}

fun abc081_b() {
    readInt()
    val A = nextInts()
    var ans = Int.MAX_VALUE

    for (i in A.indices) {
        var a = A[i]
        var count = 0
        while (a % 2 == 0) {
            a /= 2
            count++
        }
        //ansを少なくともcount以下になるよう強制する
        ans = ans.coerceAtMost(count)
    }
    println(ans)
}

fun abc081_a() {
    val S = readLine()!!
    println(S.count { it == '1' })
}

fun abc086_a() {
    val (n, k) = readInts()
    if (n * k % 2 == 0) println("Even")
    else println("Odd")
}

private fun readStr() = readln() // string line
private fun readInt() = readStr().toInt() // single int
private fun readStrings() = readStr().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun nextInt() = readLine()!!.toInt()
fun nextLong() = readLine()!!.toLong()
fun nextDouble() = readLine()!!.toDouble()
fun nextValues() = readLine()!!.split(" ")
fun nextInts() = readLine()!!.split(" ").map { it.toInt() }
fun nextLongs() = readLine()!!.split(" ").map { it.toLong() }
fun nextDoubles() = readLine()!!.split(" ").map { it.toDouble() }
////    println(a.joinToString("\n")) // each element of array/list of a separate line

package easy

//https://atcoder.jp/contests/abc156/tasks/abc156_c
fun main() {
    val n = readLine()!!.toInt()
    val X = readLine()!!.split(" ").map { it.toInt() }

    var ans = Int.MAX_VALUE
    for (p in 1.rangeTo(X.sortedDescending()[0])) {
        var temp = 0
        for (x in X) {
            temp += (x - p) * (x - p)
        }
        if (temp < ans) ans = temp
    }
    println(ans)
}

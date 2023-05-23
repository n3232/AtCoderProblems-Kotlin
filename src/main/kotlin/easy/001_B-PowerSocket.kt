package easy

//https://atcoder.jp/contests/abc139/tasks/abc139_b

//高橋くんの家には電源プラグの差込口が1 口しかありません。
//そこで、高橋くんはA 個口の電源タップをいくつか使って未使用の差込口を B 口以上に拡張したいと考えています。
//A 個口の電源タップ 1 つと未使用の差込口 1 口を使って、新たに差込口を A 口増やすことができます。
//最小でいくつの電源タップが必要でしょうか。
fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    println((a - 1).let { (b - 1) / it + 1.coerceAtMost((b - 1) % it) })
}

package one.dev.projeto

fun main() {
    val valores = intArrayOf(10,2,4,12,31)
    valores.forEach {
        println(it)
    }
    println("-----------------------------")
    valores.sort()
    valores.forEach {
        println(it)
    }
}
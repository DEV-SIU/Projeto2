package one.dev.projeto

fun main() {
    val pair:Pair<String,Double> = Pair("Lucas",1500.0)
    val map = mapOf(pair)
    map.forEach{ (c, v) -> println("Chave $c valor: $v")}

    val map2 = mapOf(
        "João" to  1000.0,
        "Rodrigo" to 1500.0
    )
    println("------------------")
    map2.forEach{ (c, v) -> println("Chave $c valor: $v")}
}
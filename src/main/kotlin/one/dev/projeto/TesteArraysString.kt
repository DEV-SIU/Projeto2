package one.dev.projeto

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "a"
    nomes[1] = "b"
    nomes[2] = "c"

    for (nome in nomes){
        println(nome)
    }


    println("-----------------------------")
    nomes.sort()
    nomes.forEach {
        println(it)
    }
    println("-----------------------------")
    val nomes2 = arrayOf("lala","juju","mimi")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }

}
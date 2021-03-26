package one.dev.projeto

fun main() {
    val valores = IntArray(5)

    valores[0] = 1
    valores[1] = 2
    valores[2] = 3
    valores[3] = 4
    valores[4] = 5

    for (valor in valores){
        println(valor)
    }
println("--------------------------------------")
    valores.forEach { valor ->
        println(valor);("\n")
    }
println("--------------------------------------")
    for (index in valores.indices){
        println(valores[index])
    }
println("--------------------------------------")

    valores.sort()
    for (valor in valores){
        println(valor)
    }

}
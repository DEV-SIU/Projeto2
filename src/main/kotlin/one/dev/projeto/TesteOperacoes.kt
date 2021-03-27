package one.dev.projeto

fun main() {
    val salarios = doubleArrayOf(100.0,200.0,300.0)
    for (salario in salarios){
        println(salario)
    }
    println("-------------------------")

    println("Maior salario é " + "${salarios.maxOrNull()}")
    println("Menor salario é " + "${salarios.minOrNull()}")
    println("Media salario é " + "${salarios.average()}")

    val salarioMaiorque200 = salarios.filter { it > 200.0 }
    println("-------------------------")
    salarioMaiorque200.forEach{println(it)}
    println("-------------------------")
    println(salarios.count{it in 100.0..300.0})
    println("-------------------------")
    println(salarios.find{it == 200.0})
    println(salarios.find{it == 210.0})
    println("-------------------------")
    println(salarios.any{it == 100.0})
    println(salarios.any{it == 101.0})
}
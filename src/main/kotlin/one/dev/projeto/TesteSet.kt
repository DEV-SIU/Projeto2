package one.dev.projeto

fun main() {
    val  lucas = Funcionario("lucas",1500.0,"CLT")
    val  Katia = Funcionario("Katia",4500.0,"PJ")
    val  Raphael = Funcionario("Raphael",3500.0,"CLT")

    val funcionarios1 = setOf(lucas,Katia)
    val funcionarios2 = setOf(Raphael)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println(it)}

    println("-----------------------------")
    val funcionarios3 = setOf(lucas,Katia,Raphael)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{ println(it)}
    println("-----------------------------")
    val funcionarios4 = setOf(lucas,Katia,Raphael)
    val resultIntersect = funcionarios4.intersect(funcionarios2)
    resultIntersect.forEach{ println(it)}

}
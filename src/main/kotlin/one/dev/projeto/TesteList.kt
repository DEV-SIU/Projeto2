package one.dev.projeto

fun main() {
    val  lucas = Funcionario("lucas",1500.0,"CLT")
    val  Katia = Funcionario("Katia",4500.0,"PJ")
    val  Raphael = Funcionario("Raphael",3500.0,"CLT")
    val funcionarios = listOf(lucas,Katia,Raphael)

    funcionarios.forEach{println(it)}
    println("--------------------------------------")
    println(funcionarios.find { it.nome == "lucas" })
    println("--------------------------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach{ println(it)}
    println("--------------------------------------")
    funcionarios
        .groupBy {it.tipoContratao}
        .forEach{ println(it)}
}
data class Funcionario(
    val nome : String,
    val salario : Double,
    val tipoContratao : String

)
{
    override fun toString(): String =
        """
         Nome: $nome
         Salario: $salario
         Contratação: $tipoContratao
        """.trimIndent()


}




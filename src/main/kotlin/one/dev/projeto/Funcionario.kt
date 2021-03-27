package one.dev.projeto

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
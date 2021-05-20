package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao",3000.0)
    val claudio = Funcionario("Claudio",2500.0)
    val pedro = Funcionario("Pedro",30000.0)
    val funcionarios = listOf(joao,pedro,claudio)

    funcionarios.forEach {println(it)}

    //Usando uma função para buscar dados de um funcionario na array
    println("----------------")
    println(funcionarios.find { it.nome=="joao" })
}

data class Funcionario(val nome: String, val salario: Double
)
    //Override de metodos, ainda preciso estudar mais
    /* override fun toString(): String {
        return super.toString()
    }*/



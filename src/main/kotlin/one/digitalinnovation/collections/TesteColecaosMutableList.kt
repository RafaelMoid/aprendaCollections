package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao",3000.0)
    val claudio = Funcionario("Claudio",2500.0)
    val pedro = Funcionario("Pedro",30000.0)

    val funcionarios = mutableListOf(joao,pedro)
    //The command bellow should print all funcionarios, but its not working, the problem is the
    //IT - I'm not able to use it, and i dunno why, if you know please show me
// funcionarios.forEach( println(it) )
}
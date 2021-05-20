package one.digitalinnovation.collections

fun main() {
    val salario = DoubleArray(3)
    salario[0] = 800.0
    salario[1] = 2500.0
    salario[2] = 1500.0

    val resultado = salario[0] + salario[1] + salario [2]
    println("Suas fontes de renda atual são:")
    salario.forEach { println("R$ " + it) }
    println("Sua renda é de R$ " + resultado)
}
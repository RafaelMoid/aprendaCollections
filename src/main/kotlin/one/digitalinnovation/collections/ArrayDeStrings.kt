package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Biu"
    nomes[1] = "Cleitu"
    nomes[2] = "Cauton"

    for (nome in nomes){
        println(nome)
    }

    nomes.sort()
    nomes.forEach { println(it) }
}
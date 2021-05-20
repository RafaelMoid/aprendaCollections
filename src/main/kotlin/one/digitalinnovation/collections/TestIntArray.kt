package one.digitalinnovation.collections

fun main() {
    //Inicializando uma Array
    val values = IntArray(5)

    values[0] = 1
    values[1] = 2
    values[2] = 3
    values[3] = 4
    values[4] = 5


    //Iterando uma Array (Diversas formas)
    for (valor in values){
        println(valor)
    }

    values.forEach {
        println(it)
    }

    for (index in values.indices){
        println(values[index])
    }

    values.sort()
    for (valor in values){
        println(valor)
    }

    println("oi")


    //Testando IntArrayOf, forma de declarar um array sem necessariamente declarar o size
    val values2 = intArrayOf(2, 4, 5, 12, 25)

    values2.forEach {
        println(it)
    }
}
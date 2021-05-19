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

}
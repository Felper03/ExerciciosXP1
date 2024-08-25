package Exercicio5

fun dados(){

    println("Quantas vezes deseja jpgar os dados?")
    val jogadas = readln().toInt()
    for (i in 1..jogadas){

        var dado1 = (1..6).random()
        var dado2 = (1..6).random()
        println("..........................................")
        println("$i° Jogada")
        println("Numero que caiu o dado 1: $dado1")
        println("Numero que caiu o dado 2: $dado2")
        var soma = dado1 + dado2
        println("O valor da soma dos dados é igual a $soma")
    }
}

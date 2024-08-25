package Exercicio6

fun previsaoDoTempo(){
    val temperaturas = DoubleArray(30)

    for(i in temperaturas.indices){
        var temp = (5..35).random().toDouble()
        temperaturas[i] = temp
    }

    var dia: Int = 0
    for (temperatura in temperaturas) {
        dia ++
        print("dia: $dia temperatura: $temperatura° | ")
        if(dia == 8 || dia == 16 || dia == 24){
            println()
        }
    }
    val temperaturaMedia = temperaturas.average()
    val temperaturaMaxima = temperaturas.maxOrNull()
    val temperaturaMinima = temperaturas.minOrNull()

    val diasMaxima = temperaturas.indices.filter { temperaturas[it] == temperaturaMaxima }.map { it + 1 }
    val diasMinima = temperaturas.indices.filter { temperaturas[it] == temperaturaMinima }.map { it + 1 }

    println("\nTemperatura média: %.2f°".format(temperaturaMedia))
    println("Temperatura máxima: %.2f°".format(temperaturaMaxima))
    println("Temperatura mínima: %.2f°".format(temperaturaMinima))
    println("Dia(s) com temperatura máxima: $diasMaxima")
    println("Dia(s) com temperatura mínima: $diasMinima")
}
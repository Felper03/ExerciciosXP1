package Exercicio3
fun exercicio3(){

    val alunos = mutableListOf<Aluno>()

    for (i in 1..5) {
        println("Digite no nome do aluno $i")
        var nome = readln()

        println("Iforme a quantidade de notas do $nome: ")
        var qtNotas = readln().toInt()

        var notas = DoubleArray(qtNotas)
        for(j in notas.indices){
            println("${j+1}° nota: ")
            notas[j] = readln().toDoubleOrNull() ?: 0.0
        }

        val aluno = Aluno(nome, notas)
        alunos.add(aluno)
    }
    println("ALUNOS E SUAS NOTAS:")
    for(aluno in alunos) {
        var media = aluno.calcularMedia()
        val status = aluno.aprovadOuNao()

        println("|||||||||||||||||||||||||||||||||||||||||||")
        if (status) {
            println("O aluno ${aluno.nome} foi apovado :O")
            println("Media: %.2f".format(media))
        } else {
            println("O aluno ${aluno.nome} nao foi aprovado :(")
            println("Media: %.2f".format(media))
        }

    }
}

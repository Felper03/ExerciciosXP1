package Exercicio4

fun ordenarNomes(){
    val alunos = Array(10){ "" }
    for( i in alunos.indices){
        println("Digitre o ${i + 1}° nome: ")
        alunos[i] = readln()?: ""
    }
    alunos.sort()

    println("Nome dos alunos em ordem alfabetica")
    for (aluno in alunos){
        println(aluno)
    }
}
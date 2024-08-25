package Exercicio2

class Exercicio2 {
    fun contagemDePalavras(){
        println("Digite um texto para que suas palavras sejam contadas: ")
        val texto = readln()
        //Expreção "\\s+" usada para verficar, alem de espaços em branco, quebras de linha no texto digitado
        val palavras = texto.split(" ")
        val numeroPalavras = palavras.size

        println("O texto digitado:\n $texto \n tem $numeroPalavras palavras")
    }
}
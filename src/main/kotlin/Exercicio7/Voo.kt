package Exercicio7;

public class Voo (var numeroDoVoo: String, val assentosDisponiveis: IntArray) {


    fun reservarAssento(assento: Int): Boolean {
        if (assento < 0 || assento >= assentosDisponiveis.size) {
            println("Número de assento inválido.")
            return false
        }

        return if (assentosDisponiveis[assento] == 1) {
            println("O assento $assento já está reservado.")
            false
        } else {

            assentosDisponiveis[assento] = 1
            println("Assento $assento reservado com sucesso.")
            true
        }
    }

    fun verificarDisponibilidade(assento: Int): Boolean {
        if (assento < 0 || assento >= assentosDisponiveis.size) {
            println("Número de assento inválido.")
            return false
        }
        return assentosDisponiveis[assento] == 0
    }
}
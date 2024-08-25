package Exercicio3

class Aluno(var nome: String, val notas: DoubleArray) {

    fun calcularMedia():Double{
        return notas.average()
    }
    fun aprovadOuNao(): Boolean{

        return calcularMedia() >=7.0
    }


}
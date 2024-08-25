package Exercicio1

class Exercicio1 {

    fun numeroPrimo(){
        val (num, ePrimo) = verificarPrimo()
        if (ePrimo == true){
            println("O numero $num digitado e primo :D")
        }else{
            println("O numero $num digitado nao e primo :(")
        }
    }

    fun verificarPrimo(): Pair<Int, Boolean> {
        var numPrimo: Boolean = true
        println("Digite um numero para ver se ele e primo ou nao: ")
        var num = readln().toInt()

        if (num < 1){
            numPrimo = false
        }else {
            for (i in 2 until num) {
                if (num % i == 0) {
                    numPrimo = false
                    break
                }
            }
        }
        return Pair(num, numPrimo)
    }


}

package Exercicio7

fun reservarVoo(){
    val voo = Voo("ABC123", IntArray(20) { 0 }) // 0 indica assento disponível

    while (true) {
        println("Digite o número do assento para verificar e reservar (ou -1 para sair):")
        val entrada = readLine()?.toIntOrNull() ?: continue

        if (entrada == -1) break

        if (voo.verificarDisponibilidade(entrada)) {
            println("O assento $entrada está disponível.")
            println("Deseja reservar o assento $entrada? (s/n)")
            val resposta = readLine()?.trim()?.toLowerCase()
            if (resposta == "s") {
                voo.reservarAssento(entrada)
            } else {
                println("Reserva cancelada.")
            }
        } else {
            println("O assento $entrada não está disponível.")
        }
    }
}

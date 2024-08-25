package Exercicio8

fun cadastrarProdutos(){
    val produtos = mutableListOf<Produto>()

    // Cadastra 5 produtos
    for (i in 1..5) {
        println("Cadastro do Produto $i:")
        print("Nome: ")
        val nome = readLine() ?: continue
        print("Quantidade atual: ")
        val quantidade = readLine()?.toIntOrNull() ?: continue
        print("Nível mínimo: ")
        val nivelMinimo = readLine()?.toIntOrNull() ?: continue
        print("Nível máximo: ")
        val nivelMaximo = readLine()?.toIntOrNull() ?: continue

        produtos.add(Produto(nome, quantidade, nivelMinimo, nivelMaximo))
    }

    // Verifica a quantidade e repõe o estoque se necessário
    produtos.forEach { produto ->
        produto.verificarEstoque()
        println("Produto: ${produto.nome}, Quantidade: ${produto.quantidade}")
    }
}
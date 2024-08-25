package Exercicio8
class Produto(
    val nome: String,
    var quantidade: Int,
    val nivelMinimo: Int,
    private val nivelMaximo: Int
) {

    fun reporEstoque() {
        if (quantidade < nivelMinimo) {
            println("Reposição de estoque para o produto $nome.")
            quantidade = nivelMaximo
        }
    }

    fun verificarEstoque() {
        if (quantidade < nivelMinimo) {
            println("Quantidade do produto $nome está abaixo do nível mínimo.")
            reporEstoque()
        } else {
            println("Quantidade do produto $nome está adequada.")
        }
    }
}

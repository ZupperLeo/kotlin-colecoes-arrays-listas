package br.com.alura.list

data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
) : Comparable<Livro> {

    /**
     * metodo responsavel por comparar um objeto(Livros) com outro para a ordenacao
     * @param other reccebe como parametro um objeto do tipo Livros
     * @return a forma como o metodo sorted() serah ordenado
     * */
    override fun compareTo(other: Livro): Int {
        return this.titulo.compareTo(other.titulo)
    }

}
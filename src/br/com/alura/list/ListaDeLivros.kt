package br.com.alura.list

fun main() {

    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val meusLivros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    val livro5 = Livro(
        titulo = "Sagrana",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1946
    )

    meusLivros.add(livro5)

    meusLivros.imprimeListaComMarcadores()
    meusLivros.sorted()

    meusLivros.remove(livro3)
    meusLivros.imprimeListaComMarcadores()

    meusLivros.sortedBy { it.anoPublicacao }.imprimeListaComMarcadores()

    val titulos: List<String> = meusLivros.titulosPorAnoPublicacaoDoAutor("J")
    println(titulos)

}

fun List<Livro>.imprimeListaComMarcadores() {
    val listaComMarcadores = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }

    println("\n ### Lista de Livros ### \n${listaComMarcadores}")
}

fun MutableList<Livro>.titulosPorAnoPublicacaoDoAutor(prefixoAutor: String)
        : List<String> {
            return this
                .filter { it.autor.startsWith(prefixoAutor) }
                .sortedBy { it.anoPublicacao }
                .map { it.titulo }
}



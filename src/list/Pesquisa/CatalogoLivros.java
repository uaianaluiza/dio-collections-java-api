package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> catalogoLivros;

    public CatalogoLivros() {
        this.catalogoLivros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {

        Livro novoLivro = new Livro(livro.getTitulo(), livro.getAutor(), livro.getAno());

        catalogoLivros.add(novoLivro);
    }

    public List<Livro> pesquisarLivroProAutor(String autor) {
        List<Livro> livrosAutor = new ArrayList<>();
        if (!catalogoLivros.isEmpty()) {
            for (Livro l : catalogoLivros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosAutor.add(l);
                }
            }
        }
        return livrosAutor;
    }


    public Livro pesquisarPorTitulo(String titulo) {
        for (Livro l : catalogoLivros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosIntervaloAnos = new ArrayList<>();
        if (!catalogoLivros.isEmpty()) {
            for (Livro l : catalogoLivros) {
                if (l.getAno() >= anoInicial && l.getAno() <= anoFinal) {
                    Livro novoLivro = new Livro(l.getAutor(), l.getTitulo(), l.getAno());
                    livrosIntervaloAnos.add(novoLivro);
                }
            }
        }
        return livrosIntervaloAnos;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro(new Livro("Arquitetura Limpa", "Robert C. Martin", 2019));
        catalogoLivros.adicionarLivro(new Livro("Código Limpo", "Robert C. Martin", 2009));
        catalogoLivros.adicionarLivro(new Livro("O Codificador Limpo", "Robert C. Martin", 2012));

        System.out.println("No catálogo temos esses livros do autor" + catalogoLivros.pesquisarLivroProAutor("Robert C. Martin"));
        System.out.println("No catálogo temos o livro com o título: " + catalogoLivros.pesquisarPorTitulo("Código Limpo"));
        System.out.println("No catálogo temos esses livros entre este intervalo de anos:" + catalogoLivros.pesquisarPorIntervaloAnos(2007, 2013));


    }
}

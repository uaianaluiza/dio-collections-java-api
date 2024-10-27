package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, int cod, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;

    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("Morango",123,5.36,2);
        cadastroProdutos.adicionarProduto("Banana",951,2.99,20);
        cadastroProdutos.adicionarProduto("Manga",369,1.85,19);
        cadastroProdutos.adicionarProduto("Uva",147,8.99,16);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}

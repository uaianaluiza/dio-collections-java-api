package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco) {
        estoqueProdutos.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutos);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueProdutos.isEmpty()) {
            for (Produto p : estoqueProdutos.values()) {
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutos.isEmpty()) {
            for (Produto p : estoqueProdutos.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }


    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1L, "Panela", 3, 62.0);
        estoque.adicionarProduto(2L, "Fogao", 10, 450.0);
        estoque.adicionarProduto(4L, "Bicicleta", 1, 900.0);
        estoque.adicionarProduto(8L, "Geladeira", 1, 3500.0);

        estoque.exibirProdutos();
        System.out.println("Valor total do estoque é: " + estoque.calcularValorTotalEstoque());
        System.out.println("Valor produto mais caro do estoque é: " + estoque.obterProdutoMaisCaro());
    }
}

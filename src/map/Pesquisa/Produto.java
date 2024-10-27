package map.Pesquisa;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {


    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, Integer quantidade, Double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome= " + nome +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }

    @Override
    public int compareTo(Produto p) {
        return Double.compare(preco, p.getPreco());
    }
}

class CompararPorQuantidade implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getQuantidade(), p2.getQuantidade());
    }
}

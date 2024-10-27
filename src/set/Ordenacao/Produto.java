package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {

    private String nome;
    private int cod;
    private double preco;
    private int quantidade;

    public Produto(String nome, int cod, double preco, int quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public String getNome() {
        return nome;
    }

    public int getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return cod == produto.cod;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cod);
    }

    @Override
    public String toString() {
        return "Produto{" + nome + ',' + cod +  ',' + preco + ',' + quantidade + '}';
    }
}
class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(),p2.getPreco());
    }
}
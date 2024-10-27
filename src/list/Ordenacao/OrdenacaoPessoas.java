package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {

        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }


    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura,new CompararPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas catalogoPessoas = new OrdenacaoPessoas();

        catalogoPessoas.adicionarPessoa("Pedro", 15, 1.70);
        catalogoPessoas.adicionarPessoa("Tay", 26, 1.67);
        catalogoPessoas.adicionarPessoa("Ana", 30, 1.57);

        System.out.println("Pessoas por idade: " + catalogoPessoas.ordenarPorIdade());
        System.out.println("Pessoas por altura: " + catalogoPessoas.ordenarPorAltura());

    }

}

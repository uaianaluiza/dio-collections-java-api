package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoRemover = c;
                convidadoSet.remove(convidadoRemover);
                break;
            }
        }
    }

    public int contarConvidados() {
       return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet.toString());
    }

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Temos " + conjuntoConvidados.contarConvidados() + " convidados");

        conjuntoConvidados.adicionarConvidado("Tay",12345);
        conjuntoConvidados.adicionarConvidado("Ana",12342);
        conjuntoConvidados.adicionarConvidado("Lu",12340);
        conjuntoConvidados.adicionarConvidado("Mari",12343);

        System.out.println("Temos " + conjuntoConvidados.contarConvidados() + " convidados");

        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.removerConvidadoPorCodigoConvite(12343);

        System.out.println("Temos " + conjuntoConvidados.contarConvidados() + " convidados");
    }
}


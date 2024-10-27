package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Tay",12345);
        agendaContatos.adicionarContato("Tay",12349);
        agendaContatos.adicionarContato("Lu",12340);
        agendaContatos.adicionarContato("Mari",12343);
        agendaContatos.adicionarContato("Tay escola",12347);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.atualizarNumeroContato("Mari",589746));
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Tay"));

    }
}

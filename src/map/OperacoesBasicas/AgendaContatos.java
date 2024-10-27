package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    Map<String, Integer> contatoMap;

    public AgendaContatos() {
        this.contatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero) {

        contatoMap.put(nome, numero);
    }

    public void removerContato(String nome) {
        if (!contatoMap.isEmpty()) {
            contatoMap.remove(nome);
        }
    }

        public void exibirContatos() {
            System.out.println(contatoMap);
   }


    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!contatoMap.isEmpty()) {
            numeroPorNome = contatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Tay", 12345);
        agendaContatos.adicionarContato("Tay", 12349);
        agendaContatos.adicionarContato("Lu", 12340);
        agendaContatos.adicionarContato("Mari", 12343);
        agendaContatos.adicionarContato("Tay escola", 12347);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Mari"));
        agendaContatos.removerContato("Tay");
        agendaContatos.exibirContatos();

    }
}

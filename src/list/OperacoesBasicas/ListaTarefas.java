package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {

        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList.toString());
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar java");
        listaTarefas.adicionarTarefa("Estudar inglês");
        listaTarefas.adicionarTarefa("Fazer exercício fisico");
        listaTarefas.adicionarTarefa("Jogar video game");
        listaTarefas.adicionarTarefa("Cuidar das plantas");
        listaTarefas.adicionarTarefa("Jogar video game");

        System.out.println("Existem " + listaTarefas.obterNumeroTotalTarefas() + " tarefas na lista");

        System.out.println("Com as seguintes descrições: ");
        listaTarefas.obterDescricoesTarefas();
        listaTarefas.removerTarefa("Jogar video game");
        System.out.println("Existem " + listaTarefas.obterNumeroTotalTarefas() + " tarefas na lista");
        System.out.println("Com as seguintes descrições: ");
        listaTarefas.obterDescricoesTarefas();

    }
}

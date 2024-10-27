package map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        for (Map.Entry<LocalDate,Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento " + entry.getValue() + "acontecerá na data " + entry.getKey());
                break;
            }

        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 28), "Samba", "Jorge Aragão");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 11, 10), "Pagode", "Thiaguinho");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 3, 31), "In concert", "Belo");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 12, 15), "Numanice", "Lud");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();

    }
}

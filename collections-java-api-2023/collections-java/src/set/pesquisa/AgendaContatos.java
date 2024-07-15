package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    // atributos

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesqueisaPorNome(String nome) {
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

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("João", 123456739);
        agendaContatos.adicionarContato("João Ribeiro", 123456749);
        agendaContatos.adicionarContato("João DEV", 123456759);
        agendaContatos.adicionarContato("João RP", 123456769);

        agendaContatos.exibirContato();


        System.out.println(agendaContatos.pesqueisaPorNome(("João")));

        System.out.println("Contato Atualizado: " + agendaContatos.atualizarNumeroContato("Maria", 55555555));

        agendaContatos.exibirContato();
    }
}
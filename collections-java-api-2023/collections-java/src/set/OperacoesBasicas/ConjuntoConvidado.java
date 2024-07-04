package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<Convidado>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;

            }

        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
       System.out.println(convidadoSet); 
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidado.adicionarConvidado("Convidado 1" , 1234);
        conjuntoConvidado.adicionarConvidado("Convidado 2" , 1235);
        conjuntoConvidado.adicionarConvidado("Convidado 3" , 1236);
        conjuntoConvidado.adicionarConvidado("Convidado 4" , 1237);
        conjuntoConvidado.adicionarConvidado("Convidado 5" , 1238);
        conjuntoConvidado.adicionarConvidado("Convidado 6" , 1235);

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidado.removerConvidadoPorCodigoConvite(3);
        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidado.exibirConvidados();
    }
}

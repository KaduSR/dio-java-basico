public class ContaCorrente extends Conta {

    @Override
    public void imprmirExtrato() {
        System.out.println("*** Extrato Conta Corrente ***");
        super.imprimirInformacoesComuns();

    }



}

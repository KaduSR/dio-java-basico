public class ContaPoupanca extends Conta {

    @Override
    public void imprmirExtrato() {
        System.out.println("*** Extrato Conta Poupaça ***");
        super.imprimirInformacoesComuns();

    }


}

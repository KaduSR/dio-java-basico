public class App {
    public static void main(String[] args) throws Exception {
       Conta cc = new ContaCorrente();
       cc.depositar(100);
       
       Conta poupanca = new ContaPoupanca();

       cc.transferir(poupanca, 100);

       cc.imprmirExtrato();
       poupanca.imprmirExtrato();
    }
}

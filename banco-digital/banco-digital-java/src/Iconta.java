public interface Iconta {

   
    void sacar(double valor);

    void depositar(double valor);

    void transferir(Conta ContaDestino, double valor);

    void imprmirExtrato();
}

package com.bancoDigital.demo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Carlos");

        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.depositar(100);
        cc.transferir(poupanca, 50);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
package org.example;

import org.example.models.Cliente;
import org.example.models.Conta;
import org.example.models.ContaCorrente;
import org.example.models.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente bruno = new Cliente();
        bruno.setNome("Bruno");

        Conta cc = new ContaCorrente(bruno);
        Conta poupanca = new ContaPoupanca(bruno);

        cc.depositar(6000);
        cc.transferir(200, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.getEmprestimoDisponivel();


    }
}
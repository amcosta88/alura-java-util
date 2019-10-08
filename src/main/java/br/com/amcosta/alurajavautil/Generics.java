package br.com.amcosta.alurajavautil;


import java.util.ArrayList;

public class Generics {

    public static void main(String[] args) {

        ArrayList<Conta> contas = new ArrayList<Conta>();

        Conta conta1 = new ContaCorrente(1, 1);
        Conta conta2 = new ContaCorrente(2, 2);
        Conta conta3 = new ContaCorrente(3, 3);
        Conta conta4 = new ContaCorrente(4, 4);
        Conta conta5 = new ContaCorrente(5, 5);
        Conta conta6 = new ContaCorrente(6, 6);

        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);
        contas.add(conta6);

        System.out.println("Tamanho: " + contas.size());

    }
}

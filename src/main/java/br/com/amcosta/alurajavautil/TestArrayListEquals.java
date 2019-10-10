package br.com.amcosta.alurajavautil;

import br.com.amcosta.alurajavautil.conta.Conta;
import br.com.amcosta.alurajavautil.conta.ContaCorrente;
import br.com.amcosta.alurajavautil.conta.ContaPoupanca;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayListEquals {
    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente(1, 1);
        Conta conta2 = new ContaCorrente(2, 2);
        Conta conta3 = new ContaPoupanca(9, 9);
        Conta conta4 = new ContaCorrente(3, 3);

        List<Conta> contasAL = new ArrayList<>();

        contasAL.add(conta1);
        contasAL.add(conta2);
        contasAL.add(conta3);
        contasAL.add(conta4);

        for (Conta conta : contasAL) {
            System.out.println(conta);
        }

        System.out.println("---------------------");

        List<Conta> contasLL = new LinkedList<>();

        contasLL.add(conta1);
        contasLL.add(conta2);
        contasLL.add(conta3);
        contasLL.add(conta4);

        for (Conta conta : contasLL) {
            System.out.println(conta);
        }

        System.out.println("---------------------");

        Conta contaIgual = new ContaCorrente(1, 1);
        System.out.println("Verificar contas iguais: " + contasAL.contains(contaIgual));
    }
}

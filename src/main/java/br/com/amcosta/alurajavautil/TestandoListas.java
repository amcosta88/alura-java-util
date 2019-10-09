package br.com.amcosta.alurajavautil;

import java.util.*;

public class TestandoListas {

    public static void main(String[] args) {

        List<Conta> lista1 = new ArrayList<>();
        List<Conta> lista2 = new Vector<>();
        List<Conta> lista3 = new LinkedList<>();

        for (Integer numero : Arrays.asList(1, 2, 3)) {
            lista1.add(new ContaCorrente(numero, numero));
        }

        for (Integer numero : Arrays.asList(1, 2, 3)) {
            lista2.add(new ContaCorrente(numero, numero));
        }

        for (Integer numero : Arrays.asList(1, 2, 3)) {
            lista3.add(new ContaCorrente(numero, numero));
        }

        for (Conta conta : lista1) {
            System.out.println(conta);
        }

        System.out.println("-----------------");

        for (Conta conta : lista2) {
            System.out.println(conta);
        }

        System.out.println("-----------------");

        for (Conta conta : lista3) {
            System.out.println(conta);
        }
    }
}

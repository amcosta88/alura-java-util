package br.com.amcosta.alurajavautil;

import br.com.amcosta.alurajavautil.Comparator.CompararPelaContaComparator;
import br.com.amcosta.alurajavautil.conta.Conta;
import br.com.amcosta.alurajavautil.conta.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class OrdenandoListas {

    public static void main(String[] args) {


        List<Conta> contas = new ArrayList<>();

        contas.add(new ContaCorrente(111, 1111));
        contas.add(new ContaCorrente(985, 5645));
        contas.add(new ContaCorrente(951, 1684));
        contas.add(new ContaCorrente(269, 8945));
        contas.add(new ContaCorrente(636, 7336));

        contas.sort(new CompararPelaContaComparator());

        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }
}

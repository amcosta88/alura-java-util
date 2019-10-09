package br.com.amcosta.alurajavautil.Comparator;

import br.com.amcosta.alurajavautil.Conta;

import java.util.Comparator;

public class CompararPelaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta conta1, Conta conta2) {
        if (conta1.getConta() < conta2.getConta()) {
            return -1;
        }

        if (conta1.getConta() > conta2.getConta()) {
            return 1;
        }

        return 0;
    }
}

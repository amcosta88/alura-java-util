package br.com.amcosta.alurajavautil;

public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int conta) {
        super(agencia, conta);
    }

    @Override
    void sacar(double valor) throws Exception {
        valor += valor * 0.2;
        super.sacar(valor);
    }
}

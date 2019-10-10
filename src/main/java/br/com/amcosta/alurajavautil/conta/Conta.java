package br.com.amcosta.alurajavautil.conta;

public abstract class Conta {
    private int agencia;
    private int conta;

    private double saldo;

    public Conta(int agencia, int conta) {
        this.agencia = agencia;
        this.conta = conta;
    }

    void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor informado deve ser maior que zero");
        }

        this.saldo += valor;
    }

    void sacar(double valor) throws Exception {
        double total = this.saldo - valor;
        if (total < 0) {
            throw new Exception("Você não tem limite para realizar o saque");
        }

        this.saldo = total;
    }

    void transferir(double valor, Conta conta) throws Exception {
        this.sacar(valor);
        conta.depositar(valor);
    }

    double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getConta() {
        return this.conta;
    }

    @Override
    public String toString() {
        return String.format("Agência: %d, Conta: %d", this.agencia, this.conta);
    }

    @Override
    public boolean equals(Object o) {
        Conta conta = (Conta) o;
        return conta.agencia == this.agencia && conta.conta == this.conta;
    }
}

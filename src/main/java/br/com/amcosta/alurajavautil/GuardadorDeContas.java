package br.com.amcosta.alurajavautil;

public class GuardadorDeContas {

    private int posicaoAtual;
    private Object[] referencias;

    public GuardadorDeContas() {
        this.referencias = new Object[50];
    }

    public void adicionar(Object object) {
        System.out.println("Guardando o bojecto: " + object);
        this.referencias[this.posicaoAtual] = object;
        this.posicaoAtual++;
    }

    public Object getReferencia(int posicao) {
        return this.referencias[posicao];
    }

    public int getQuantidade() {
        return this.posicaoAtual;
    }
}

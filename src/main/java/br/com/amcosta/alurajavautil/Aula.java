package br.com.amcosta.alurajavautil;

public class Aula implements Comparable {

    private final String nome;
    private final int minutos;

    public Aula(String nome, int minutos) {
        this.nome = nome;
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return String.format("Aula: %s, tempo: %d", this.nome, this.minutos);
    }

    @Override
    public int compareTo(Object o) {
        Aula aula = (Aula) o;
        return this.nome.compareTo(aula.nome);
    }
}

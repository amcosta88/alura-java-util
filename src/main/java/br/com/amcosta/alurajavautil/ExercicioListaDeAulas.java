package br.com.amcosta.alurajavautil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExercicioListaDeAulas {

    public static void main(String[] args) {

        Aula aulaIntro = new Aula("Introdução às Coleções", 20);
        Aula aulaModelando = new Aula("Modelando a Classe Aula", 18);
        Aula aulaSets = new Aula("Trabalhando com Conjuntos", 16);

        List<Aula> aulas = new ArrayList<>(Arrays.asList(aulaIntro, aulaModelando, aulaSets));

        Collections.sort(aulas);
        imprimirLista(aulas, "Lista ordenada pelo nome");

        Collections.reverse(aulas);
        imprimirLista(aulas, "Lista invertida pelo nome");

        Collections.shuffle(aulas);
        imprimirLista(aulas, "Lista desordenada");

        Collections.rotate(aulas, 1);
        imprimirLista(aulas, "Lista rotacionada");
    }

    public static void imprimirLista(List<Aula> lista, String msg) {
        System.out.println("");
        System.out.println(msg);
        System.out.println("");

        for (Aula aula : lista) {
            System.out.println(aula);
        }
    }
}

package br.com.amcosta.alurajavautil.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExercicioLambdas {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(Arrays.asList("Super Mario", "Yoshi", "Donkey Kong"));
//        Collections.sort(nomes, new Comparator<String>() {
//
//            @Override
//            public int compare(String s, String t1) {
//                return s.compareTo(t1);
//            }
//        });

        nomes.sort((n1, n2) -> n1.compareTo(n2));
        nomes.forEach(nome -> System.out.println(String.format("Nintendo hero: %s", nome)));
    }
}

package br.com.amcosta.alurajavautil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestandoListasCollections {

    public static void main(String[] args) {

        List<String> cursos = new ArrayList<>(Arrays.asList("Python", "Docker", "Java", "PHP"));
        cursos.sort(null);
        cursos.forEach(curso -> System.out.println(curso));

        cursos.remove(1);
        System.out.println(String.format("O primeiro curso é: %s", cursos.get(0)));
        cursos.forEach(curso -> System.out.println(curso));

    }
}

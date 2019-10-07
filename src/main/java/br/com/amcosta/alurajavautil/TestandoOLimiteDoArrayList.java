package br.com.amcosta.alurajavautil;

import java.util.ArrayList;

public class TestandoOLimiteDoArrayList {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        for (int i = 0; i < 9000000; i++) {
            list.add(i);
        }

        System.out.println("Size: " + list.size());
    }
}

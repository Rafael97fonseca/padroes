package org.example;

import java.util.Calendar;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        DefaultDAO<Pessoa> dao = new DefaultDAO<>();
        dao.add(new Pessoa("Renato Simões Moreira", 41));
        dao.add(new Pessoa("Gelásio", 30));
        dao.add(new Pessoa("Osmar", 32));

        System.out.println("Ordem de Entrada:");
        dao.show("entrada");

        System.out.println("\nOrdem Alfabética:");
        dao.show("nome");

        System.out.println("\nOrdenado por Idade:");
        dao.show("idade");
    }
}









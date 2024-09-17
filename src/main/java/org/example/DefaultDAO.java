package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DefaultDAO<E extends Entidade> {
    private List<E> db = new ArrayList<>();

    public void add(E e) {
        db.add(e);
    }

    public List<E> getAll() {
        return new ArrayList<>(db);
    }

    public void show(String criterio) {
        List<E> listToShow = new ArrayList<>(db);


        System.out.println("Nome                            Idade");
        System.out.println("========================================");

        switch (criterio) {
            case "nome":
                listToShow.sort(Comparator.comparing(e -> ((Pessoa) e).getNome()));
                break;
            case "idade":
                listToShow.sort(Comparator.comparingInt(e -> ((Pessoa) e).getIdade()));
                break;
            case "entrada":
            default:

                break;
        }

        for (E e : listToShow) {
            System.out.println(e.toString());
        }

        System.out.println("========================================");
    }
}

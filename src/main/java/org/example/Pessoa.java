package org.example;

public class Pessoa implements Comparable<Pessoa>, Entidade {
    private String nome;
    private Integer idade;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public Integer getId() {
        return getIdade();
    }

    @Override
    public int compareTo(Pessoa o) {

        if (nome.compareTo(o.nome) == 0) {
            return idade.compareTo(o.idade);
        } else {
            return nome.compareTo(o.nome);
        }
    }

    @Override
    public String toString() {

        return String.format("%-30s %10d", nome, idade);
    }
}

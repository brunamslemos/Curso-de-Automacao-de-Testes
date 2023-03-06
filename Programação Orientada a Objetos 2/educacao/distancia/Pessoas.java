package Aula02.educacao.distancia;

import Aula02.Pessoa;

public class Pessoas implements Comparable<Pessoas> {

    private String nome;

    public Pessoas(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int compareTo(Pessoas other) {
        return nome.toLowerCase().compareTo(other.getNome().toLowerCase());
    }
}

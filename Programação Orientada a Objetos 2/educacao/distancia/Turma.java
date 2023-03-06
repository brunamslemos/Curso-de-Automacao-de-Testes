package Aula02.educacao.distancia;

import Aula02.educacao.distancia.Professor;

import java.util.ArrayList;
import java.util.List;

public class Turma<T extends Aluno>{

    Professor professor;

    List<T> listaDeAlunos;

    public Turma(){
        this.listaDeAlunos = new ArrayList<>();

    }

    public void adicionarAluno(T aluno){
        this.listaDeAlunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor){
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<T> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<T> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    @Override
    public String toString() {
        return "Turma de " +
                this.getListaDeAlunos().get(0).getClass().getSimpleName()
                +
                " {Nome do professor:" + professor +
                ", Lista de alunos:" + listaDeAlunos +
                '}';
    }
}

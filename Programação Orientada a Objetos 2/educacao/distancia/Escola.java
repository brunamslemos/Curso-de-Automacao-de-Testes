package Aula02.educacao.distancia;

import java.util.Collections;

public class Escola {

    public static void main(String[] args) {
        Turma<AlunoJava> turmaAlunosJava = new Turma<>();
        Professor professorJava = new Professor("Prof Java");
        AlunoJava joao = new AlunoJava("Bruna");
        AlunoJava victor = new AlunoJava("Rafaella");
        AlunoJava luana = new AlunoJava("Natalia");
        turmaAlunosJava.adicionarProfessor(professorJava);
        turmaAlunosJava.adicionarAluno(joao);
        turmaAlunosJava.adicionarAluno(victor);
        turmaAlunosJava.adicionarAluno(luana);
        System.out.println(turmaAlunosJava);
        Collections.sort(turmaAlunosJava.listaDeAlunos);
        System.out.println("Após a ordenação:");
        System.out.println(turmaAlunosJava);
        System.out.println();


        Turma<Aluno> turmaAlunosJS = new Turma<>();
        Professor professorJS = new Professor("Prof JS");
        AlunoJS gabriel = new AlunoJS("Jhennyfer");
        AlunoJS pedro = new AlunoJS("Carolina");
        AlunoJS eduardo = new AlunoJS("Christabel");
        turmaAlunosJS.adicionarProfessor(professorJS);
        turmaAlunosJS.adicionarAluno(Jhennyfer);
        turmaAlunosJS.adicionarAluno(Carolina);
        turmaAlunosJS.adicionarAluno(Christabel);
        System.out.println(turmaAlunosJS);
        Collections.sort(turmaAlunosJS.listaDeAlunos);
        System.out.println("Após a ordenação:");
        System.out.println(turmaAlunosJS);
    }
}

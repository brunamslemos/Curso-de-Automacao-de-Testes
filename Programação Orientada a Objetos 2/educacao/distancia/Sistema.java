package Aula02.educacao.distancia;

import java.util.Collections;

public class Sistema {

    public static void main(String[] args) {
        Turma<AlunoJava> turmaJava = new Turma<>();
        Turma<AlunoJS> turmaJS = new Turma<>();

        AlunoJava alunoJava1 = new AlunoJava("Bruna");
        AlunoJava alunoJava2 = new AlunoJava("Rafaella");
        AlunoJava alunoJava3 = new AlunoJava("Natalia");
        cadastrarProfessor(new Professor("Kadu"),turmaJava);
        cadastrarAluno(alunoJava1,turmaJava);
        cadastrarAluno(alunoJava2,turmaJava);
        cadastrarAluno(alunoJava3,turmaJava);

        AlunoJS alunoJS1 = new AlunoJS("Christabel");
        AlunoJS alunoJS2 = new AlunoJS("Jhennyfer");
        AlunoJS alunoJS3 = new AlunoJS("Rosiane");
        cadastrarProfessor(new Professor("Gabriela"),turmaJS);
        cadastrarAluno(alunoJS1,turmaJS);
        cadastrarAluno(alunoJS2,turmaJS);
        cadastrarAluno(alunoJS3,turmaJS);



        System.out.println("Turma Java");
        System.out.printf("Professor: %s\n",turmaJava.getProfessor().getNome());
        for (Aluno aluno : turmaJava.getListaDeAlunos()()) {
            System.out.println("Aluno: " + aluno.getNome());
        }

        System.out.println("Turma JS");
        System.out.printf("Professor: %s\n",turmaJS.getProfessor().getNome());
        for (Aluno aluno : turmaJS.getListaDeAlunos()) {
            System.out.println("Aluno: " + aluno.getNome());
        }

        Collections.sort(turmaJava.getListaDeAlunos());
        Collections.sort(turmaJS.getListaDeAlunos());
        System.out.println(turmaJava.getListaDeAlunos());
        System.out.println(turmaJS.getListaDeAlunos());
    }

    public static <T extends Aluno> void cadastrarAluno(T aluno, Turma<T> turma){
        turma.getListaDeAlunos().add(aluno);
    }

    public static void cadastrarProfessor(Professor professor, Turma turma) {
        turma.setProfessor(professor);
    }
    }
}

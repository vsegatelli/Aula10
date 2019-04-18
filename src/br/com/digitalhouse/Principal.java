package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        //Cursos criados
        Curso fullStack = new Curso("Web Full Stack");
        Curso android = new Curso("Mobile Android");

        //Alunos criados
        Aluno vini = new Aluno(123, "Vinicius", "Oliveira", android);
        Aluno vinicius = new Aluno(123456, "Vinicius", "Oliveira", android);
        Aluno jessica = new Aluno(321, "Jessica", "Milena", fullStack);
        Aluno hendy = new Aluno(456, "Hendy", "Almeida", fullStack);
        Aluno ana = new Aluno(654, "Ana", "Pereira", android);

        //Criando Arrays - lista de alunos
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(vini);
        alunos.add(jessica);
        alunos.add(hendy);
        alunos.add(ana);

        System.out.println(
                //(vini.equals(vinicius));

                //alunos.contains(vinicius));

                alunos);
    }
}

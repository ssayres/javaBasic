package edu.sidnei;

import java.util.Scanner;

public class CalculaMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Aluno1", "Aluno2","Aluno3",};

        int media = calculaMediaTurma(alunos, scan);

        System.out.printf("Media da turma %d ",media);


    }
    public static int calculaMediaTurma(String[] alunos, Scanner scanner){
        int soma = 0;

        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", alunos);
            int nota = scanner.nextInt();
            soma = soma + nota;
        }

        return soma/ alunos.length;

    }
}

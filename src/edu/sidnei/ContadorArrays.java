package edu.sidnei;

public class ContadorArrays {

     public static void main(String[] args) {
        String alunos[] = {"Felipe", "Jonathan", "Diego"};

        for (int x=0; x<alunos.length; x++){
            System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
        }

        //forma abreviada sem os indices
        for( String aluno : alunos){
            System.out.println("O aluno é " + aluno);
        }
    }
}

package edu.sidnei;

public class ResultadoEscolar {
    public static void main(String[] args) {
    int nota = 6;

       // if (nota >= 7 ){
         //   System.out.println("Aprovado");
       // }else {
       //     System.out.println("Reprovado");
       // }

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";//operador ternario em java
        System.out.println(resultado);
    }
}
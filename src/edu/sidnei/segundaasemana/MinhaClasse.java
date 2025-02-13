package edu.sidnei.segundaasemana;

public class MinhaClasse {

    public static void main (String [] args) {
        //System.out.println("Olá mundo!");

        // final String BR = "Brasil"; constante por convenção vem como UPPERCASE
        // jamais iniciar variavel com numero
        // variavel camel case - minhaVariavel
        // padrao de arquivos e classes- edu.sidnei.segundaasemana.MinhaClasse
        // $ é permitido - variavel$um

        // Tipo NomeBemDefinido = Atribuição (opcional)

        String nome = "Glauber";
        String sobreNome = "Carvalho";

        String nomeCompleto = nomeCompleto(nome, sobreNome);
        System.out.println(nomeCompleto);

        //Operador Ternário

        int a = 6;
        int b = 6;

        //String resultado = "";
        //if( a == b){
        //   resultado = "verdadeiro";
        // }else{
        //   resultado = "falso";
        // } tudo isso é a mesma coisa que :

        String resultado = a== b ? "verdadeiro" : "falso"; // a condição SEMPRE deve ser booleana - O Tipo String - refere-se ao formato do resultado esperado, nesse caso "verdadeiro" ou "falso"

        System.out.println(resultado);

        // comparações

        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;

        System.out.println("Numero 1 é igual a dois ?" + simNao);


        //comparando objetos :

        String nomeum = "gleyson";
        String nomedois = new String("gleyson");

        System.out.println(nomeum.equals(nomedois));
    }

    public static String nomeCompleto(String nome, String sobreNome){
        return "Resultado do método : " + nome.concat(" ").concat(sobreNome);
    }





}
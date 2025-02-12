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
    }

    public static String nomeCompleto(String nome, String sobreNome){
        return "Resultado do método : " + nome.concat(" ").concat(sobreNome);
    }

}
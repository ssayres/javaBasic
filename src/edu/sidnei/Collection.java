package edu.sidnei;

import java.util.*;

public class Collection {
    public static void main(String[] args) {

        // Uma estrutura de dados que serve para agrupar muitos elementos dentro de uma unica unidade

        // Collection pode ser heterogenea ou homogenea

        //Tipos de coleções :

        //List / Set(Conjunto) / Queue(fila) / Map(mapa)

        // COllection só aceita objetos e não tipo primitivos -- collections de Integers e nao de int

        // É mais comum usar Collection de forma homogênea de um tipo específico

        // O símbolo <> é usado para tipo genéricos

        //<T> Tipo do valor a ser armazenado
        // Com <> Voce faz uma lista generica e na hora de imprimir nao precisa definir se é String, Integer etc

        Set<String> conjuntoGenerics = new HashSet<>();
        conjuntoGenerics.add("Elemento 1");
        conjuntoGenerics.add("Elemento 2");

        for(String elemento : conjuntoGenerics){
            System.out.println(elemento);
        }

        //SEM GENERICS

        Set conjuntoGenerics2 = new HashSet<>();
        conjuntoGenerics2.add("Elemento 3");
        conjuntoGenerics2.add("Elemento 4");

        for(Object elemento2 :  conjuntoGenerics2){
            System.out.println( (String) elemento2);
        }

        //Coleções com vários Tipos

        //SEM GENERICS

        Map mapSemGenerics = new HashMap();
        mapSemGenerics.put("Chave 1", 10);
        mapSemGenerics.put("Chave 2", "valor");

        for(Object obj : mapSemGenerics.entrySet()){
            Map.Entry entry = (Map.Entry) obj;
            String chave = (String) entry.getKey();
            Object valor = entry.getValue();
            System.out.println("Chave" + chave + ", valor :" + valor);

        }

        //COM GENERICS

        Map<String, Integer> mapaGenerics = new HashMap<>();
        mapaGenerics.put("Chave 1", 10);
        mapaGenerics.put("Chave 2", 20);

        for(Map.Entry<String, Integer> entry : mapaGenerics.entrySet()){
            String chave = entry.getKey();
            int valor = entry.getValue();

            System.out.println("chave " + chave + "valor " + valor);
        }

    }

}

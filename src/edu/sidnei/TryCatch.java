package edu.sidnei;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class TryCatch{

    public static void main(String[] args) {
        // Exceção não necessariamente é um erro, é um fluxo inesperado, como um erro de input pelo usuário
        // ou uma informação inesperada
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            //bloco de execução normal


            System.out.println("Digite seu nome");
            String nome = scanner.next();
            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Olá " + nome + " !");
            System.out.println("Você tem " + idade + " anos !");

        }catch(InputMismatchException e){ // precisamos saber qual é a exceção esperada - sql - null - etc
            // caso de fluxo não previsto
            System.err.println("O campo idade precisa ser numérico");
        }
        scanner.close();
    }
}


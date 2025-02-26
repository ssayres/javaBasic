import java.util.Scanner;

public class AboutMe {

    // executar no terminal

    public static void main (String[] args) {

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá me chamo" + nome + " " + sobrenome);
        System.out.println("Olá me chamo" + idade + " " + "anos");
        System.out.println("Minha altura é" + altura + " " + "cm");

    }

    // método para receber input do usuário
    public static void mainScanner (String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sobrenome = scanner.nextLine();
        int idade = scanner.nextInt();
        double altura = scanner.nextDouble();

        System.out.println("Olá me chamo" + sobrenome + " " + sobrenome);
        System.out.println("Olá me chamo" + idade + " " + "anos");
        System.out.println("Minha altura é" + altura + " " + "cm");

        scanner.close();

    }
}





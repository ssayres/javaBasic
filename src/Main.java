public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        int numero = 5;
        //numero = numero + 1;

        //numero += 1;

        //numero++;

        System.out.println(++ numero); // autoincrementa direto no print
        System.out.println(numero ++ ); // também autoincrementa porém após a impressão

        boolean variavel = true;

        System.out.println(!variavel); // imprime o oposto do valor booleano de variavel

        variavel = !variavel; // o único jeito de mudar pra false de fato pra além da ultima operação é reatribuindo


    }
}
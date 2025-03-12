package edu.sidnei;

public class DebugAula {

    public static void main(String[] args) {
        //Pilha de execução

        System.out.println("iniciou o programa main");
        a();
        Thread.dumpStack();
        System.out.println("Finalizou o programa main");


    }

        static void a(){
        System.out.println("Inicializou o método a");
        b();
        System.out.println("Finalizou o método a");
        }

        static void b(){
        System.out.println("Iniciou o método b");
        for(int i = 0; i<=4; i++){
            System.out.println(i);
        }
        c();
            System.out.println("Finalizou o método b");
        }

        static void c(){
            System.out.println("Inicializou o método c");
            Thread.dumpStack();
            System.out.println("Finalizou o método c");
        }


}

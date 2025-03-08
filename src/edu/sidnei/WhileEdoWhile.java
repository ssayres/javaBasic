package edu.sidnei;
import java.util.concurrent.ThreadLocalRandom;

public class WhileEdoWhile {
    public static void main(String[] args) {
        double saldo = 50;


        while (saldo>0){
            Double valorDoce = valorAleatorio();
            if(valorDoce>saldo)
                valorDoce = saldo;
            System.out.println("Doce valor " + valorDoce + " Adicionado ao carrinho"  );
            saldo = saldo - valorDoce;
        }
        System.out.println("Saldo: " + saldo);


    }

    private  static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}

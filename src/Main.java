public class Main {
    public static void main(String[] args) {

       // System.out.println("Hello, World!");

     //   int numero = 5;
        //numero = numero + 1;

        //numero += 1;

        //numero++;

       // System.out.println(++ numero); // autoincrementa direto no print
       // System.out.println(numero ++ ); // também autoincrementa porém após a impressão

       // boolean variavel = true;

       // System.out.println(!variavel); // imprime o oposto do valor booleano de variavel

       // variavel = !variavel; // o único jeito de mudar pra false de fato pra além da ultima operação é reatribuindo

       // System.out.println(variavel);

       // Employee employee = new Employee();
        Manager manager = new Manager();

        manager.setAge(28);

        manager.setName("Claudio");

        manager.setPassword("password");

        System.out.println(manager.getName());
        System.out.println(manager.getAge());
        System.out.println(manager.getPassword());


        //POLIMORFISMO - UM OBJETO SE COMPORTANDO COMO UM OBJETO DE OUTRA CLASSE
        // classe abstrata nao pode ser estanciada
        // mas voce pode ter uma variavel do tipo dela - no caso manager 2 do tipo Employee
        // isso só é possível pois foi definida uma hierarquia

        Employee manager2 = new Manager();
        manager2.setCode("23adGu");
    }
}
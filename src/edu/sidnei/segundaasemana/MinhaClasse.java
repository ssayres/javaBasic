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

        // Tabela verdade
        //&& Operador "E"
        //|| Operador "OU"

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 || condicao2 && (7 >4)){
            System.out.println("Ta verdadeiro");
        }

        MinhaClasse minhaClasse = new MinhaClasse();
        System.out.println(minhaClasse.somaTotal());


    }

    public static String nomeCompleto(String nome, String sobreNome){
        return "Resultado do método : " + nome.concat(" ").concat(sobreNome);
    }


    // métodos usam camelCase e devem ser verbo

    public int soma(int soma1, int soma2){
            int soma3 = soma1 + soma2;
            return soma3;
    }

    public int somaTotal() {
       int soma = soma(200,3);

        return soma;
    }



    //public void calcularImprimir() - ERRADO o método deve ter uma única responsabilidade

    // Em Java não tem métodos globais - os métodos sempre devem ser definidos dentro de uma classe

    // QUAL A PROPOSTA PRINCIPAL DO MÉTODO ? QUAL O TIPO DE RETORNO ESPERADO ?

    // VOID NÃO RETORNA NADA

    // QUAIS OS PARAMETROS NECESSARIOS ? O MÉTODO POSSUI RISCO DE APRESENTAR ALGUMA EXCEÇÃO? QUAL A VISIBILIDADE DO MÉTODO?

   // public double somar(int num1, int num2){ - MÉTODO COM O FORMATO QUE DEVE RETORNAR E COM OS PARAMETROS ESPERADOS
     //   return ... ;
   // }

    private void metodoPrivado(){ // não fica visivel para outras classes

    }


}
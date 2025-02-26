public class ContaTerminal {

    public static void main (String[] args) {

        System.out.print("Por favor, Digite sua conta bancária: ");
        int numero = Integer.valueOf(args[0]);
        System.out.print("Por favor, Digite sua agência: ");
        String agencia = args[1];
        System.out.print("Por favor ,Digite seu nome: ");
        String nome = args[2];
        System.out.print("Por favor ,Digite o saldo conta bancária: ");
        double saldo = Double.valueOf(args[3]);

        System.out.println("Olá" + nome +
                "obrigado por criar uma conta em nosso banco, sua agência é"
                + agencia + "conta " + numero + " e seu saldo" + saldo +
                "já está disponível para saque");
    }
}

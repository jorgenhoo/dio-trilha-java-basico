import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, digite o seu Nome !");
        nomeCliente = input.nextLine();
        System.out.println("Por favor, digite o número da Agência !");
        agencia = input.nextLine();
        System.out.println("Por favor, digite o número da sua Conta !");
        numero = input.nextInt();
        System.out.println("Por favor, digite o seu Saldo !");
        saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque");
    }
}
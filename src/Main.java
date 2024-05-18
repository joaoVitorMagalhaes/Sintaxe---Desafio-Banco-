import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaTerminal conta = new ContaTerminal();

        System.out.println("Por favor, digite o número da sua Conta: ");
        conta.numero = sc.nextInt();

        System.out.println("Agora, digite o número da Agência: ");
        conta.agencia = sc.next();

        System.out.println("Digite seu Nome: ");
        conta.nomeCliente = sc.next();

        System.out.println("Digite seu Saldo: ");
        conta.saldo = sc.nextFloat();

        System.out.println("Olá" + " " + conta.nomeCliente + "," + " " + "obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia + conta.numero + " " + "e seu saldo " + conta.saldo + " " + "já está disponível para saque");

    }
}

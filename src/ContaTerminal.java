import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Conta conta = new Conta();

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("########## Bem-vindo ao nosso sistema de cadastro do Banco ABC ##########\n");

        System.out.print("Digite seu nome: ");
        conta.nome = scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        conta.agencia = scanner.next();

        System.out.print("Por favor, digite o número da conta: ");
        conta.conta = scanner.next();

        System.out.print("Qual valor deseja depositar/transferir? ");
        conta.saldo = scanner.nextDouble();

        System.out.println("\n======================================================================");
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco.\n" +
                        "Sua agência é %s, conta %s e o saldo R$ %.2f já disponível.\n",
conta.nome, conta.agencia, conta.conta, conta.saldo); 
        System.out.println("=======================================================================");
        scanner.close();
    }
}

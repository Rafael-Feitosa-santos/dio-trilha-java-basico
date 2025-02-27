import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("########## Bem-vindo ao nosso sistema de cadastro do Banco ABC ##########\n");

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.print("Por favor, digite o número da conta: ");
        String conta = scanner.next();

        System.out.print("Qual valor deseja depositar/transferir? ");
        double saldo = scanner.nextDouble();

        System.out.println("\n===============================================");
        System.out.println(String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco.\n" +
                        "Sua agência é %s, conta %s e o saldo R$ %.2f já disponível.",
                nome, agencia, conta, saldo));
        System.out.println("===============================================");
    }
}

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
            //TODO: Conhecer e importar a classe Scanner
            // Exibir as mensagens para o nosso usuário 
            // Obter pelo scanner os valores digitados no terminal
            // Exibir a mensagem conta criada

        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
      
        // exibindo a mensagem para o nosso usuário
        System.out.println("Digite seu nome: ");
        // obtendo pelo scanner o nome do usuário digitado pelo terminal
        String nomeCliente = scanner.next();

        // exibindo a mensagem para o nosso usuário
        System.out.println("Digite seu sobrenome: ");
        // obtendo pelo scanner o sobrenome do usuário digitado pelo terminal
        String sobrenomeCliente = scanner.next();
    
        // exibindo a mensagem para o nosso usuário
        System.out.println("Digite sua escolha de Agência: ");
        // obtendo pelo scanner a escolha de agencia do usuário digitado pelo terminal
        String agencia = scanner.next();

        // exibindo a mensagem para o nosso usuário
        System.out.println("Digite o número que deseja para sua conta: ");
        // obtendo pelo scanner o número da conta do usuário digitado pelo terminal
        int numero = scanner.nextInt();
    
        // exibindo a mensagem para o nosso usuário
        System.out.println("Digite o seu saldo: ");
        // obtendo pelo scanner o saldo do usuário digitado pelo terminal
        double saldo = scanner.nextDouble();
    
        // exibindo a mensagem conta criada
        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + "!!!");
        System.out.println("Obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua Agência é  " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque!");

    }
}
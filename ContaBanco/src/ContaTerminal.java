import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
    //criando o objeto scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
    System.out.println("Digite seu nome: ");
    String nomeCliente = scanner.next();

    System.out.println("Digite seu sobrenome: ");
    String sobrenomeCliente = scanner.next();
    
    System.out.println("Digite sua escolha de Agência: ");
    String agencia = scanner.next();

    System.out.println("Digite o número que deseja para sua conta: ");
    int numero = scanner.nextInt();
    
    System.out.println("Digite o seu saldo: ");
    double saldo = scanner.nextDouble();

    }
}
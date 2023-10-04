import java.util.Locale;
import java.util.Scanner;
// Este é apenas um projeto simples, para fixar o conteúdo aprendido pela DIO.

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Declarando varíaveis
        String nome;
        int agencia;
        int conta;
        double saldo;
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, insira seu nome: ");
            nome = scanner.next();
        
        System.out.println("Informe sua agência: ");
            agencia = scanner.nextInt();

        System.out.println("Agora, informe o número da conta: ");
            conta = scanner.nextInt();
        
        System.out.println("Informe o saldo: ");
            saldo = scanner.nextDouble();

        
        // Imprimindo dados:

        System.out.println("Olá! "+ nome + 
        ", obrigado por criar uma conta em nosso banco, sua Agência é: "+ agencia + 
        ", conta: "+ conta +" e o seu saldo: R$ "+ saldo + " já está disponível para saque!");


    }
}

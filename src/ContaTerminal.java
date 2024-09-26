
import java.util.Scanner;

public class ContaTerminal {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        String nomeCliente = NomeCliente();
        String agencia = Agencia();
        String conta = Conta();
        String saldo = saldo();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }

    public static String NomeCliente() {
        System.out.print("Digite seu nome: ");
        return scanner.nextLine();  
    }

    public static String Agencia() {
        System.out.print("Digite sua agencia: ");
        return scanner.nextLine();  
    }

    public static String Conta() {
        System.out.print("Digite sua conta: ");
        return scanner.nextLine();  
    }

    public static String saldo() {
        System.out.print("Digite seu saldo: ");
        return scanner.nextLine(); 
    }

    public static Scanner getScanner() {
        return scanner;
    }
}

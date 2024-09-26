import java.util.Scanner;

class Conta {
    private String nomeCliente;
    private String agencia;
    private String conta;
    private String saldo;

    public Conta(String nomeCliente, String agencia, String conta, String saldo) {
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getConta() {
        return conta;
    }

    public String getSaldo() {
        return saldo;
    }
}

public class ContaTerminal {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Conta conta = criarConta();
        exibirMensagem(conta);
    }

    private static Conta criarConta() {
        String nomeCliente = obterEntrada("Digite seu nome: ");
        String agencia = obterEntrada("Digite sua agência: ");
        String contaNumero = obterEntrada("Digite sua conta: ");
        String saldo = obterEntrada("Digite seu saldo: ");

        return new Conta(nomeCliente, agencia, contaNumero, saldo);
    }

    private static String obterEntrada(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    private static void exibirMensagem(Conta conta) {
        System.out.println("\nOlá " + conta.getNomeCliente() +
                "obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() +
                ", sua conta é " + conta.getConta() +
                " e seu saldo é " + conta.getSaldo() + " já está disponível para saque.");
    }
}

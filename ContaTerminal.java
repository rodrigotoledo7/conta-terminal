import java.util.Scanner;
// import lombok.Getter;
// import lombok.Setter;

public class ContaTerminal {

    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;


    // Construtor da conta
    public ContaTerminal(String nomeCliente, String agencia, int numeroConta, double saldo){
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void exibirDadosConta(){
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Informe a Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Informe o número da Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Informe o saldo: ");
        double saldo = scanner.nextDouble();

        // Criando a conta terminal
        ContaTerminal conta = new ContaTerminal(nomeCliente, agencia, numeroConta, saldo);

        // Exibindo detalhes da conta criada
        conta.exibirDadosConta();

        scanner.close();


    }


}
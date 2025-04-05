public class ContaTerminal (String[] args throws Exception) {
    // Crie uma classe chamada ContaTerminal, que tenha os atributos nome, agencia, numeroConta e saldo.
    import java.util.Scanner;

    public class BancoSimulacao {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Solicitar os dados da conta
            System.out.println("Digite o número da conta bancária:");
            String contaBancaria = scanner.nextLine();
    
            System.out.println("Digite o número da agência:");
            String agencia = scanner.nextLine();
    
            System.out.println("Digite o saldo inicial:");
            double saldo = scanner.nextDouble();
    
            // Exibir os dados da conta
            System.out.println("\nInformações da Conta Bancária:");
            System.out.println("Conta Bancária: " + contaBancaria);
            System.out.println("Agência: " + agencia);
            System.out.println("Saldo: R$ " + saldo);
    
            scanner.close();
        }
    }
  }
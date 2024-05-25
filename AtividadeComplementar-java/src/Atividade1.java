import java.util.*;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    // System.out.println("Deposite o novo saldo");
                    double novoSaldo = scanner.nextDouble();
                    saldo += novoSaldo;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    // System.out.println("Digite a quantia que deseja sacar:");
                    double sacarSaldo = scanner.nextDouble();
                    if (sacarSaldo < saldo) {
                        saldo -= sacarSaldo;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo Insuficiente.");
                    }
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("Seu atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false; // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}

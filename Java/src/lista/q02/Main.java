package lista01.q02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria("001", "Cliente");
        ContaBancaria contaDestino = new ContaBancaria("002", "Destinatário");

        int opcao;

        do {
            System.out.println("\n=== BANCO ===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Valor para depositar: ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Valor para sacar: ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 4:
                    System.out.print("Valor para transferir: ");
                    double transferencia = scanner.nextDouble();
                    conta.transferir(contaDestino, transferencia);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
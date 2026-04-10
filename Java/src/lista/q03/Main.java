package lista01.q03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = null;
        int opcao;

        do {
            System.out.println("\n=== MERCEARIA ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Exibir detalhes");
            System.out.println("3 - Calcular valor total do estoque");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();
                    produto = new Produto(nome, preco, quantidade);
                    System.out.println("Produto cadastrado!");
                    break;
                case 2:
                    if (produto == null) {
                        System.out.println("Nenhum produto cadastrado!");
                    } else {
                        produto.exibirDetalhes();
                    }
                    break;
                case 3:
                    if (produto == null) {
                        System.out.println("Nenhum produto cadastrado!");
                    } else {
                        System.out.println("Valor total: R$ " + produto.calcularValorTotal());
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
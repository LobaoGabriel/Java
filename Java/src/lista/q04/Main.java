package lista01.q04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Filme filme = null;
        int opcao;

        do {
            System.out.println("\n=== STREAMING ===");
            System.out.println("1 - Cadastrar título");
            System.out.println("2 - Exibir detalhes");
            System.out.println("3 - Avaliar título");
            System.out.println("4 - Mostrar média de avaliações");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Gênero: ");
                    String genero = scanner.nextLine();
                    System.out.print("Ano de lançamento: ");
                    int ano = scanner.nextInt();
                    System.out.print("Duração (minutos): ");
                    int duracao = scanner.nextInt();
                    scanner.nextLine();
                    filme = new Filme(nome, genero, ano, duracao);
                    System.out.println("Título cadastrado!");
                    break;
                case 2:
                    if (filme == null) {
                        System.out.println("Nenhum título cadastrado!");
                    } else {
                        filme.exibirDetalhes();
                    }
                    break;
                case 3:
                    if (filme == null) {
                        System.out.println("Nenhum título cadastrado!");
                    } else {
                        System.out.print("Digite sua nota (0 a 10): ");
                        int nota = scanner.nextInt();
                        scanner.nextLine();
                        filme.avaliar(nota);
                    }
                    break;
                case 4:
                    if (filme == null) {
                        System.out.println("Nenhum título cadastrado!");
                    } else {
                        System.out.printf("Média de avaliações: %.2f%n", filme.calcularMediaAvaliacoes());
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
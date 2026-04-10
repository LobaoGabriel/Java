package aula03.q03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao != 0) {
                System.out.print("Digite o primeiro número: ");
                double a = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double b = scanner.nextDouble();

                double resultado = 0;

                switch (opcao) {
                    case 1:
                        resultado = a + b;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        resultado = a - b;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        if (b == 0) {
                            System.out.println("Erro: divisão por zero!");
                        } else {
                            resultado = a / b;
                            System.out.println("Resultado: " + resultado);
                        }
                        break;
                    case 4:
                        resultado = a * b;
                        System.out.println("Resultado: " + resultado);
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }

        } while (opcao != 0);

        System.out.println("Encerrando a calculadora!");
        scanner.close();
    }
}
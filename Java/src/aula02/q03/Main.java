package aula02.q03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int quantidade = 0;
        String continuar;

        System.out.println("Bem-vindo ao calculador de média do aluno!");

        do {
            System.out.print("Insira uma nota do aluno: ");
            double nota = scanner.nextDouble();
            scanner.nextLine();

            soma += nota;
            quantidade++;

            System.out.print("Deseja inserir outra nota? (Digite 'S' para Sim ou 'N' para Não): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("S"));

        double media = soma / quantidade;
        System.out.printf("\nMédia das notas: %.2f%n", media);
        System.out.println("Obrigado por usar o programa!");

        scanner.close();
    }
}
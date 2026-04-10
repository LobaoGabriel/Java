package aula03.q02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("\nAluno: " + nome);
        System.out.printf("Média: %.2f%n", media);

        if (media >= 70) {
            System.out.println("Situação: Aprovado");
        } else if (media < 40) {
            System.out.println("Situação: Reprovado");
        } else {
            System.out.println("Situação: Final");
        }

        scanner.close();
    }
}
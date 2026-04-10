package aula02.q01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repetir;

        do {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);

            System.out.print("Deseja fazer um novo cadastro? (S/N): ");
            repetir = scanner.nextLine();

        } while (repetir.equalsIgnoreCase("S"));

        System.out.println("Programa encerrado!");
        scanner.close();
    }
}
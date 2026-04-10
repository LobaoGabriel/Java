package lista01.q01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Salário Bruto: ");
        double salarioBruto = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(matricula, nome, salarioBruto);
        funcionario.exibirContracheque();

        scanner.close();
    }
}
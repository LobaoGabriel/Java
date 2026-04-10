package aula02.q02;

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

        double deducaoINSS = salarioBruto * 0.15;
        double salarioLiquido = salarioBruto - deducaoINSS;

        System.out.println("\n=== CONTRACHEQUE ===");
        System.out.println("Matrícula:       " + matricula);
        System.out.println("Nome completo:   " + nome);
        System.out.println("Salário Bruto:   R$ " + salarioBruto);
        System.out.println("Dedução INSS:    R$ " + deducaoINSS);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}
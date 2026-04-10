package aula01.q03;

public class Main {
    public static void main(String[] args) {
        double nota1 = 6.0;
        double nota2 = 7.5;
        double nota3 = 8.0;

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Média do aluno: " + media);

        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else if (media >= 5) {
            System.out.println("Situação: Final");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}
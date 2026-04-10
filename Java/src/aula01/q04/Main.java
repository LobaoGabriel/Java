package aula01.q04;

public class Main {
    public static void main(String[] args) {
        double salario = 1800.00;

        double percentualDesconto = 0;
        String descricaoIR;

        if (salario <= 900) {
            descricaoIR = "Isento";
            percentualDesconto = 0;
        } else if (salario <= 1500) {
            descricaoIR = "Desconto de 5%";
            percentualDesconto = 0.05;
        } else if (salario <= 2500) {
            descricaoIR = "Desconto de 10%";
            percentualDesconto = 0.10;
        } else {
            descricaoIR = "Desconto de 20%";
            percentualDesconto = 0.20;
        }

        double valorDesconto = salario * percentualDesconto;
        double salarioLiquido = salario - valorDesconto;

        System.out.println("=== FOLHA DE PAGAMENTO ===");
        System.out.println("Salário Bruto:   R$ " + salario);
        System.out.println("IR:              " + descricaoIR);
        System.out.println("Valor Desconto:  R$ " + valorDesconto);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
    }
}
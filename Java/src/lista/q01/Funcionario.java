package lista01.q01;

public class Funcionario {
    private String matricula;
    private String nome;
    private double salarioBruto;

    public Funcionario(String matricula, String nome, double salarioBruto) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    public double calcularInss() {
        return salarioBruto * 0.15;
    }

    public double calcularSalarioLiquido() {
        return salarioBruto - calcularInss();
    }

    public void exibirContracheque() {
        System.out.println("\n=== CONTRACHEQUE ===");
        System.out.println("Matrícula:       " + matricula);
        System.out.println("Nome completo:   " + nome);
        System.out.println("Salário Bruto:   R$ " + salarioBruto);
        System.out.println("Dedução INSS:    R$ " + calcularInss());
        System.out.println("Salário Líquido: R$ " + calcularSalarioLiquido());
    }
}
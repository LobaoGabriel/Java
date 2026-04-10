package aula04.q01;

public class Produto {
    private int codigo;
    private String nome;
    private String tamanhoPeso;
    private String cor;
    private double valor;
    private int quantidade;

    public Produto(int codigo, String nome, String tamanhoPeso, String cor, double valor, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanhoPeso = tamanhoPeso;
        this.cor = cor;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public void exibirDetalhes() {
        System.out.println("\n=== PRODUTO ===");
        System.out.println("Código:          " + codigo);
        System.out.println("Nome:            " + nome);
        System.out.println("Tamanho/Peso:    " + tamanhoPeso);
        System.out.println("Cor:             " + cor);
        System.out.println("Valor:           R$ " + valor);
        System.out.println("Estoque:         " + quantidade + " unidades");
    }

    public void realizarVenda(int qtdVenda, int formaPagamento, double valorPago) {
        if (qtdVenda > quantidade) {
            System.out.println("Estoque insuficiente! Disponível: " + quantidade + " unidades.");
            return;
        }

        double valorTotal = valor * qtdVenda;

        System.out.println("\n=== VENDA ===");
        System.out.println("Quantidade:      " + qtdVenda);
        System.out.printf("Valor total:     R$ %.2f%n", valorTotal);

        switch (formaPagamento) {
            case 1:
                double desconto = valorTotal * 0.05;
                double valorComDesconto = valorTotal - desconto;
                System.out.printf("Desconto (5%%):   R$ %.2f%n", desconto);
                System.out.printf("Valor com desc.: R$ %.2f%n", valorComDesconto);
                break;
            case 2:
                System.out.printf("Valor a pagar:   R$ %.2f%n", valorTotal);
                if (valorPago > valorTotal) {
                    System.out.printf("Troco:           R$ %.2f%n", valorPago - valorTotal);
                } else if (valorPago < valorTotal) {
                    System.out.println("Valor insuficiente!");
                    return;
                }
                break;
            case 3:
                double parcela = valorTotal / 3;
                System.out.printf("3x de:           R$ %.2f sem juros%n", parcela);
                break;
            default:
                System.out.println("Forma de pagamento inválida!");
                return;
        }

        quantidade -= qtdVenda;
        System.out.println("Venda realizada! Estoque restante: " + quantidade + " unidades.");
    }

    public int getQuantidade() {
        return quantidade;
    }
}
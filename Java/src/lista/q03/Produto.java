package lista01.q03;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirDetalhes() {
        System.out.println("\n=== PRODUTO ===");
        System.out.println("Nome:       " + nome);
        System.out.println("Preço:      R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    public double calcularValorTotal() {
        return preco * quantidade;
    }
}
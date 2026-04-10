package lista01.q04;

public class Filme {
    private String nome;
    private String genero;
    private int ano;
    private int duracao;
    private double somaNotas;
    private int qtdAvaliacoes;

    public Filme(String nome, String genero, int ano, int duracao) {
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
        this.duracao = duracao;
        this.somaNotas = 0;
        this.qtdAvaliacoes = 0;
    }

    public void exibirDetalhes() {
        System.out.println("\n=== DETALHES DO TÍTULO ===");
        System.out.println("Nome:     " + nome);
        System.out.println("Gênero:   " + genero);
        System.out.println("Ano:      " + ano);
        System.out.println("Duração:  " + duracao + " minutos");
    }

    public void avaliar(int nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite entre 0 e 10.");
        } else {
            somaNotas += nota;
            qtdAvaliacoes++;
            System.out.println("Avaliação registrada!");
        }
    }

    public double calcularMediaAvaliacoes() {
        if (qtdAvaliacoes == 0) return 0;
        return somaNotas / qtdAvaliacoes;
    }
}
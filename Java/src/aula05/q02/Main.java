package aula05.q02;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João Silva");
        Vendedor vendedor = new Vendedor("Maria Souza");
        Pedido pedido = new Pedido(1, cliente, vendedor);
        pedido.exibirPedido();
    }
}
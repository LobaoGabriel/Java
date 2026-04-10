package lista01.q02;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado!");
    }

    public void sacar(double valor) {
        if (saldo == 0) {
            System.out.println("Saldo zerado. Operação não permitida!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado!");
        }
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (saldo == 0) {
            System.out.println("Saldo zerado. Operação não permitida!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " realizada!");
        }
    }

    public String getTitular() {
        return titular;
    }
}
package aplicacao;

public class ContaBancaria {
	private String nome;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String nome, String numeroConta, double saldoInicial) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        System.out.println("Conta bancária criada com sucesso.");
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 5000) {
            System.out.println("Valor do saque acima do permitido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar a operação.");
        } else if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        }
    }

    public void consultarSaldo() {
        System.out.printf("Saldo disponível: R$ %.2f%n", saldo);
    }

}

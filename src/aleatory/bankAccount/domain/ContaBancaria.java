package aleatory.bankAccount.domain;

public class ContaBancaria {
    private String numeroConta;
    private String nomeTitular;
    private double saldo = 0;
    private static int totalContas;


    public ContaBancaria(String numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
        totalContas++;
    }

    public ContaBancaria(String numeroConta, String nomeTitular, double saldo) {
        this(numeroConta, nomeTitular);
        this.saldo = saldo;
        totalContas++;
    }

    public void depositar(double valor) {
        this.saldo = saldo + valor;
        System.out.printf("Valor depositado: R$ %.2f", valor);
    }

    public void depositar(double valor, String descricao) {
        this.saldo = saldo + valor;
        System.out.printf("Valor depositado: R$ %.2f com a seguinte descrição: %s", valor, descricao);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            this.saldo = saldo - valor;
            System.out.println("Valor sacado: R$" + valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void sacar(double valor, String descricao) {
        if (saldo >= valor) {
            this.saldo = saldo - valor;
            System.out.println("Valor sacado: R$" + valor + ". Descrição: " + descricao);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public static int getTotalContas() {
        return totalContas;
    }


}


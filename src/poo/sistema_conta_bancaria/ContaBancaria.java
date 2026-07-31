package poo.sistema_conta_bancaria;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo");
        }
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double sacar(double valor){
        if (valor <= 0 || this.saldo < valor) {
            throw new IllegalArgumentException();
        }
        this.saldo = this.saldo - valor;
        return valor;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException();
        }
        this.saldo = this.saldo + valor;
    }
}

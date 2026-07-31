package poo.sistema_conta_bancaria;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double sacar(double valor){
        if (this.saldo <= 0 && this.saldo < valor) {
            System.out.println("Saldo insuficiente");
        }
        this.saldo = this.saldo - valor;
        return valor;
    }


}

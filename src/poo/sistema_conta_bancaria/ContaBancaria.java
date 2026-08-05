package poo.sistema_conta_bancaria;

import poo.sistema_conta_bancaria.exceptions.SaldoInsuficienteException;
import poo.sistema_conta_bancaria.exceptions.ValorInvalidoException;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        if (saldo < 0) {
            throw new ValorInvalidoException("Saldo inicial não pode ser negativo");
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
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor inválido");
        }
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        this.saldo = this.saldo - valor;
        return valor;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor Inválido");
        }
        this.saldo = this.saldo + valor;
    }
}

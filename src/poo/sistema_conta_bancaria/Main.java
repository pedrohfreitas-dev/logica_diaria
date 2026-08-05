package poo.sistema_conta_bancaria;


import poo.sistema_conta_bancaria.exceptions.SaldoInsuficienteException;
import poo.sistema_conta_bancaria.exceptions.ValorInvalidoException;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Pedro Henrique",1000);

        try {
            conta.depositar(0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Não foi possível sacar:" + e.getMessage());
        } catch (ValorInvalidoException e) {
            System.out.println("Valor informado é inválido:" + e.getMessage());
        }


    }

}
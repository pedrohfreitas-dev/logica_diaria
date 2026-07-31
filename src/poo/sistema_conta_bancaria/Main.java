package poo.sistema_conta_bancaria;



public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Pedro Henrique",2000);
        System.out.println(conta.sacar(500));

    }

}
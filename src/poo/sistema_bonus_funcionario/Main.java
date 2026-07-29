package poo.sistema_bonus_funcionario;

public class Main {

    public static void main(String[] args) {
       Funcionario funcionario = new Funcionario("Pedro Henrique", 2000, new BonusPorPercentual());
        System.out.println(funcionario.calcularSalarioFinal());

    }

}
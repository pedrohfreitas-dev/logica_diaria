package poo.sistema_bonus_funcionario;

public class SemBonus implements CalculadoraBonus {


    @Override
    public double calcular(double salarioBase) {
       return salarioBase;
    }
}

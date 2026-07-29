package poo.sistema_bonus_funcionario;

public class BonusFixo implements CalculadoraBonus {

   @Override
    public double calcular(double salarioBase) {
        return salarioBase + 200;
    }
}

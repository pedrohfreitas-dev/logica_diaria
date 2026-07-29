package poo.sistema_bonus_funcionario;

public class BonusPorPercentual implements CalculadoraBonus {

    @Override
    public double calcular(double salarioBase) {
        double bonus = salarioBase * 0.15;
        return salarioBase + bonus;
    }
}

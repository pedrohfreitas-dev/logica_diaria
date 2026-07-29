package poo.sistema_bonus_funcionario;

public class Funcionario {

    private String nome;
    private double salarioBase;
    private CalculadoraBonus calculadoraBonus;

    public Funcionario(String nome, double salarioBase, CalculadoraBonus calculadoraBonus) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.calculadoraBonus = calculadoraBonus;
    }


    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularSalarioFinal() {
        return this.calculadoraBonus.calcular(this.salarioBase);
    }


}

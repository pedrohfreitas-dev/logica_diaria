

package poo.sistema_cobranca_veiculos;

public class VeiculoEletrico extends Veiculo {
    public VeiculoEletrico(String placa, double distanciaKm) {
        super(placa, distanciaKm);
    }

    @Override
    public double calcularValor() {
        double valorCalculado = this.getDistanciaKm() * 1.50F;
        if (this.getDistanciaKm() > 20.0) {
            double desconto = valorCalculado / 100 * 10;
            double valorComDesconto = valorCalculado - desconto;

            return valorComDesconto;
        }
        return valorCalculado;
    }
}


package veiculos;

public class Carro extends Veiculo {

    public Carro(String placa, double distanciaKm) {
        super(placa, distanciaKm);
    }

    @Override
    public double calcularValor() {
     double valorCalculado = this.getDistanciaKm() * 2.00F;
     return valorCalculado;
    }
}

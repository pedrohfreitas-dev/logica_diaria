package poo.sistema_cobranca_veiculos;

public class Moto extends Veiculo {

    public Moto(String placa, double distanciaKm) {
        super(placa, distanciaKm);
    }

    @Override
    public double calcularValor() {
        double valorCalculado = this.getDistanciaKm() * 1.20F;
        return valorCalculado;
    }
}
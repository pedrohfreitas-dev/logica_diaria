package poo.sistema_cobranca_veiculos;

public abstract class Veiculo {

    private String placa;
    private double distanciaKm;

    public Veiculo(String placa, double distanciaKm) {
        this.placa = placa;
        this.distanciaKm = distanciaKm;
    }


    public abstract double calcularValor();

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}

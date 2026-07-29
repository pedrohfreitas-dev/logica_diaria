package poo.sistema_cobranca_veiculos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Veiculo> veiculos = new ArrayList<>();

        Moto moto = new Moto("xxx-xxx", 10.7);
        veiculos.add(moto);
        Carro carro = new Carro("xxx-xxx", 20.4);
        veiculos.add(carro);
        VeiculoEletrico eletrico1 = new VeiculoEletrico("xxx-xxx", 21.3);
        veiculos.add(eletrico1);
        VeiculoEletrico eletrico2 = new VeiculoEletrico("xxx-xxx", 15.8);
        veiculos.add(eletrico2);

        Corrida corrida = new Corrida();
        corrida.executar(veiculos);
    }
}
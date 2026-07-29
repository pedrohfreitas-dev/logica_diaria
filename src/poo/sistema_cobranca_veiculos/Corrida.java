package poo.sistema_cobranca_veiculos;

import java.util.List;

public class Corrida  {

   public void executar(List<Veiculo> veiculos) {
       for (Veiculo veiculo : veiculos) {
          double valor = veiculo.calcularValor();
           System.out.println("Veiculo placa " + veiculo.getPlaca() + " valor da corrida: RS$ " + valor);
       }
   }


}
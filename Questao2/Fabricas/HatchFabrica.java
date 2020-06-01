package Questao2.Fabricas;
import Questao2.Carros.Carro;
import Questao2.Carros.Hatch.FordKa;
import Questao2.Carros.Hatch.RenaultSandeiro;

public class HatchFabrica extends CarroFabrica {

    @Override
    protected Carro criarCarro(String tipo) {
        Carro carro = null;
        switch (tipo){
            case "FordKa":
                carro = new FordKa();
                break;
            case "Saveiro":
                carro = new RenaultSandeiro();
                break;
            default:
                System.out.println("Entrada não encontrada!");
                break;
        }
        return carro;
    }
    
}
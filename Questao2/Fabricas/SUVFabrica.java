package Questao2.Fabricas;
import Questao2.Carros.Carro;
import Questao2.Carros.SUV.ChevroletTracker;
import Questao2.Carros.SUV.FordEcosport;

public class SUVFabrica extends CarroFabrica {

    @Override
    protected Carro criarCarro(String tipo) {
        Carro carro = null;
        switch (tipo){
            case "ChevroletTracker":
                carro = new ChevroletTracker();
                break;
            case "FordEcosport":
                carro = new FordEcosport();
                break;
            default:
                System.out.println("Entrada não encontrada!");
                break;
        }
        return carro;
    }
    
}
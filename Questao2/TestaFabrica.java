package Questao2;

import Questao2.Carros.Carro;
import Questao2.Fabricas.CarroFabrica;
import Questao2.Fabricas.HatchFabrica;
import Questao2.Fabricas.SUVFabrica;
import Questao2.Fabricas.SedanFabrica;

public class TestaFabrica {
    //Attributes
    private CarroFabrica fabrica;
    //Constructor
    TestaFabrica (String tipo) {
        this.fabrica = null;
        switch (tipo ){
            case "SUV":
                this.fabrica = new SUVFabrica();
                break;
            case "HATCH":
                this.fabrica = new HatchFabrica();
                break;
            case "SEDAN":
                this.fabrica = new SedanFabrica();
                break;
            default:
                System.out.println("Entrada não encontrada!");
                break;
        }
    }
    //Methods
    public Carro usaCarro(String tipo) {
        Carro carro = null;
        if (fabrica != null) {
            carro = fabrica.usarCarro(tipo);
        } else {
            System.out.println("Sem Fabrica!");
        }
        return carro;
    }
}
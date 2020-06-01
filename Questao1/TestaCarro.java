package Questao1;

import Questao1.Carros.Carro;
import Questao1.Fabrica.FabricaVolkswagen;

public class TestaCarro {
    //Attributes
    private FabricaVolkswagen fabrica;
    //Constructor
    TestaCarro (FabricaVolkswagen fabrica){
        this.fabrica = fabrica;
    }
    //Methods
    public void usaCarro(String tipo){
        Carro carro;
        carro = fabrica.CriarCarro(tipo);
        carro.ligar();
    }

}
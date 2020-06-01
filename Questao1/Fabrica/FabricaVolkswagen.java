package Questao1.Fabrica;

import Questao1.Carros.Carro;
import Questao1.Carros.Gol;
import Questao1.Carros.Saveiro;
import Questao1.Carros.Voyage;

public class FabricaVolkswagen {
    //Methods
    public Carro CriarCarro (String tipo){
        Carro carro = null;
        switch (tipo){
            case "Gol":
                carro = new Gol();
                break;
            case "Saveiro":
                carro = new Saveiro();
                break;
            case "Voyage":
                carro = new Voyage();
                break;
            default:
                System.out.println("Entrada incorreta");
                break;
        }
        return carro;
    }
}
package Questao2.Fabricas;
import Questao2.Carros.Carro;
import Questao2.Carros.Sedan.Hyunda;
import Questao2.Carros.Sedan.RenaultLogan;

public class SedanFabrica extends CarroFabrica {

    @Override
    protected Carro criarCarro(String tipo) {
        Carro carro = null;
        switch (tipo){
            case "Hyunda":
                carro = new Hyunda();
                break;
            case "RenaultLogan":
                carro = new RenaultLogan();
                break;
            default:
                System.out.println("Entrada não encontrada!");
                break;
        }
        return carro;
    }
    
}
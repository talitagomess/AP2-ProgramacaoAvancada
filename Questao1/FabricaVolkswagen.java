package Questao1;

public class FabricaVolkswagen {
    
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
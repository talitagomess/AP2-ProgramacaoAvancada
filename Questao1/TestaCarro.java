package Questao1;

public class TestaCarro{

 FabricaVolkswagen fabrica;

 TestaCarro (FabricaVolkswagen fabrica){
     this.fabrica = fabrica;
 }

 public void usaCarro(String tipo){
    Carro carro;
    carro = fabrica.CriarCarro(tipo);
    carro.ligar();
 }

}
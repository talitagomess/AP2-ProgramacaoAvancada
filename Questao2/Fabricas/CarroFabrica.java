package Questao2.Fabricas;
import Questao2.Carros.Carro;

public abstract class CarroFabrica {
    //Methods
    public Carro usarCarro (String tipo) {
       Carro carro;
       carro = criarCarro(tipo);
       carro.ligar();
       return carro;
    }
    //Abstract Method
    protected abstract Carro criarCarro(String tipo);
}
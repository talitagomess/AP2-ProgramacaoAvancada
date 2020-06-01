package Questao1;

import java.util.Scanner;
import Questao1.Fabrica.FabricaVolkswagen;

public class Main {
    public static void main(String[] args) {
        String tipoCarro; 
        FabricaVolkswagen fabrica = new FabricaVolkswagen();
        TestaCarro carro = new TestaCarro(fabrica);

        Scanner entrada = new Scanner(System.in);
        tipoCarro = entrada.next();
        entrada.close();
        carro.usaCarro(tipoCarro);   
    }
}
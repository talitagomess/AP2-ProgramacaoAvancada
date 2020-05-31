package Questao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String tipoCarro;
        FabricaVolkswagen fabrica = new FabricaVolkswagen();
        TestaCarro carro = new TestaCarro(fabrica);

        Scanner entrada = new Scanner(System.in);
        tipoCarro = entrada.next();


        carro.usaCarro(tipoCarro);

        
    }
}
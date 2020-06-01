package Questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String tipoCarro;
        String tipoFabrica;

        Scanner entradaFabrica = new Scanner(System.in);
        tipoFabrica = entradaFabrica.next();
        TestaFabrica testeFabrica = new TestaFabrica(tipoFabrica);
        Scanner entradaCarro = new Scanner(System.in);
        tipoCarro = entradaCarro.next();
        testeFabrica.usaCarro(tipoCarro);
        entradaFabrica.close();
        entradaCarro.close();
    }
}
package Exercicio6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConverterTemperatura {

    public static void main(String[] args) {
        double c;
        double f;
        Scanner input = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0,0");
        System.out.println("Conversão de temperatura");
        System.out.print("Digite a temperatura em Fahrenheit: ");
        f = input.nextDouble();
        c = (5 * (f - 32)) / 9;
        System.out.println("Temperatura em Celsius: " + formatador.format(c) + "°C");

    }

}


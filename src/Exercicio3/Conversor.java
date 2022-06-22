package Exercicio3;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Metros ");
        int metros = input.nextInt();
        input.close();



        int centimetros = metros * 100;

        System.out.println("Sua conversão é " + centimetros);

        }
}



package Exercicio2;

import java.util.Scanner;

public class CalculadoraMediaEscolarmain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double media = 0;
        System.out.println("Digite a nota1 ");
        double nota1 = input.nextDouble();
        System.out.println("Digite a nota2 ");
        double nota2 = input.nextDouble();
        System.out.println("Digite a nota3 ");
        double nota3 = input.nextDouble();
        System.out.println("Digite a nota4 ");
        double nota4 = input.nextDouble();
        input.close();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("sua média é = " + media);

        }


    }


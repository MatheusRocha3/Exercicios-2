package Exercicio4;

import java.util.Scanner;

public class CalculadorasHorasMensais {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario = 0;
        System.out.print("Digite o valor da sua hora trabalhada: ");
        double horas = input.nextDouble();
        System.out.println("Digite quantas horas você trabalha por mês: ");
        double mês = input.nextDouble();
        input.close();

        salario = (horas * mês);

        System.out.println("Seu salário é = " + salario);


    }
}


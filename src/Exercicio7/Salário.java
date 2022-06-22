package Exercicio7;

import java.util.Scanner;

public class Salário {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bruto = 0;
        double ImpostoDerenda = 0;
        double sindicato = 0;
        double inss = 0;
        double salario = 0;
        System.out.print("Digite o valor da sua hora trabalhada: ");
        double horas = input.nextDouble();
        System.out.println("Digite quantas horas você trabalha por mês: ");
        double mês = input.nextDouble();
        input.close();

        salario = (horas * mês);


        inss = (salario * 8) / 100;
        sindicato = (salario * 5) / 100;
        ImpostoDerenda = (salario * 11) / 100;
        bruto = (salario - inss - sindicato - ImpostoDerenda);

        System.out.println("Seu salário bruto é: " + bruto + "R$");
        System.out.println("Você pagou para o inss: " + inss + "R$");
        System.out.println("Você pagou para o sindicato: " + sindicato + "R$");
        System.out.println("Seu salário liquido é: " + salario + "R$");








    }
}



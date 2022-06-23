package Exercicio7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salário {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bruto;
        double ImpostoDerenda;
        double sindicato;
        double inss;
        double salario;
        System.out.print("Digite o valor da sua hora trabalhada: ");
        double horas = input.nextDouble();
        System.out.println("Digite quantas horas você trabalha por mês: ");
        double mês = input.nextDouble();
        input.close();

        var formatter = new DecimalFormat("###.##");

        salario = (horas * mês);

        inss = (salario * 8) / 100;
        sindicato = (salario * 5) / 100;
        ImpostoDerenda = (salario * 11) / 100;
        bruto = (salario - inss - sindicato - ImpostoDerenda);

        System.out.println("Seu salário bruto é: " + formatter.format(bruto) + "R$");
        System.out.println("Você pagou para o inss: " + inss + "R$");
        System.out.println("Você pagou para o sindicato: " + sindicato + "R$");
        System.out.println("Seu salário liquido é: " + salario + "R$");
    }
}



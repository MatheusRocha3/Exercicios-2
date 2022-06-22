package Exercicio7;

import java.util.Scanner;

public class Salário {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bruto = 0;
        int ImpostoDerenda = 0;
        int sindicato = 0;
        int inss = 0;
        int salario = 0;
        System.out.print("Digite o valor da sua hora trabalhada: ");
        int horas = input.nextInt();
        System.out.println("Digite quantas horas você trabalha por mês: ");
        int mês = input.nextInt();
        input.close();

        salario = (horas * mês);


        inss = (salario * 8) / 100;
        sindicato = (salario * 5) / 100;
        ImpostoDerenda = (salario * 11) / 100;
        bruto = (salario + inss + sindicato + ImpostoDerenda);

        System.out.println("Seu salário bruto é: " + bruto + "R$");
        System.out.println("Você pagou para o inss: " + inss + "R$");
        System.out.println("Você pagou para o sindicato: " + sindicato + "R$");
        System.out.println("Seu salário liquido é: " + salario + "R$");








    }
}



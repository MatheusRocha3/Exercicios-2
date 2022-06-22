package Exercicio5;

import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int antecessor,sucessor,um;
        System.out.println("Digite um valor: ");
        um = Integer.parseInt(input.nextLine());
        antecessor = um - 1;
        sucessor = um + 1;
        System.out.println("O valor do antecessor é: " + antecessor);
        System.out.println("O valor do sucessor é: " + sucessor);


    }
}

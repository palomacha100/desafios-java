
// Peça ao usuário para inserir um número e imprima os quadrados dos números de 1 até o número inserido

import java.util.Scanner;

public class Quadrados {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");

        int number = leitor.nextInt();
        int i = 1;

        while (i < number) {
            System.out.println(i + "^2" + " = " + (i*i));
            i++;
        }
    }



}

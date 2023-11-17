// Crie um programa em Java que solicite ao usuário que insira 5 números inteiros e, em seguida,
// encontre e imprima o maior elemento presente no array.

import java.util.Scanner;

public class MaiorElemntoArray {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int tamanho = 5;
        int[] numeros = new int[tamanho];

        System.out.println("Digite " + tamanho + " números inteiros:");

        for (int i = 0; i < tamanho; i++) {
            numeros[i] = leitor.nextInt();
        }
        int maior = numeros[0];

        for (int i = 1; i < tamanho; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior elemento do array é: " + maior);
    }
}

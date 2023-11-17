// Peça ao usuário para inserir dois números e calcule a soma de todos os números no
// intervalo fechado entre esses dois números (incluindo os números inseridos).

import java.util.Scanner;

public class SomaIntervalo {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = leitor.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = leitor.nextInt();
        int soma = 0;
        for(int i = numero1; i <= numero2; i++) {
            soma += i;
        }
        System.out.println("A soma dos números no intervalo de " + numero1 + " a " + numero2 + " é " + soma);
        leitor.close();
    }
}

// Crie um jogo de adivinhação onde o computador escolhe aleatoriamente um número entre 1 e 100,
// e o jogador precisa adivinhar qual é. O jogo continua até que o jogador acerte, e ao final,
// exiba quantas tentativas foram necessárias.


import java.util.Scanner;
import java.util.Random;

public class AdvinhaNumero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativa;
        int tentativasRealizadas = 0;

        System.out.println("Bem vindo ao jogo de advinhação\nTente advinhar um número entre 1 e 100");

        do {
            System.out.print("Sua tentativa: ");
            tentativa = leitor.nextInt();
            tentativasRealizadas++;

            if (tentativa < numeroAleatorio) {
                System.out.println("O número é maior. Tente novamente!");
            } else if (tentativa > numeroAleatorio) {
                System.out.println("O número é menor. Tente novamente!");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativasRealizadas + " tentativas.");
            }
        } while (tentativa != numeroAleatorio);
        leitor.close();
    }
}
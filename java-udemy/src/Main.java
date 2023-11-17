import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1;
        numero1 = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Digite o segundo número:");
        int numero2;
        numero2 = leitor.nextInt();
        leitor.hasNextLine();

        System.out.println("Digite o terceiro número");
        int numero3;
        numero3 = leitor.nextInt();
        leitor.nextLine();

        System.out.println(numero1 + numero2 + numero3);


    }
}
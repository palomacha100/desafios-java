import java.util.Scanner;

public class Soma {
    public static void main (String[] args) {

        Scanner leitor = new Scanner(System.in);


        if (args.length == 2) {
            int numero1 = Integer.parseInt(args[0]);
            int numero2 = Integer.parseInt(args[1]);
            int soma = numero1 + numero2;
            System.out.println("A soma de " + numero1 + " + " + numero2 + " é " + soma);
        } else if (args.length == 1) {
            int numero1 = Integer.parseInt(args[0]);
            System.out.println("Forneça o segundo argumento:");
            int numero2 = leitor.nextInt();
            int soma = numero1 + numero2;
            System.out.println("A soma de " + numero1 + " + " + numero2 + " é " + soma);
        } else if (args.length == 0) {
            System.out.println("Forneça o primeiro argumento");
            int numero1 = leitor.nextInt();
            System.out.println("Forneça o segundo argumento:");
            int numero2 = leitor.nextInt();
            int soma = numero1 + numero2;
            System.out.println("A soma de " + numero1 + " + " + numero2 + " é " + soma);
        } else if (args.length > 2) {
            System.out.println("Número de argumentos inválidos");

    }
    }
}

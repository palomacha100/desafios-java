import java.util.Scanner;

public class Math {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quais operação deseja fazer? (opções: + - / *)");
        String opcao = leitor.nextLine();

        System.out.println("Informe o primeiro número");
        int numero1 = leitor.nextInt();

        System.out.println("Informe o segundo número");
        int numero2 = leitor.nextInt();

        switch (opcao) {
            case "+":
                System.out.println("O resultado da soma é: " + (numero1 + numero2));
                break;
            case "-":
                System.out.println("O resultado da subtração é: " + (numero1 - numero2));
                break;
            case "/":
                System.out.println("O resultado da divisão é: " + (numero1 / numero2));
                break;
            case "*":
                System.out.println("O resultado da multiplicação é: " + (numero1 * numero2));
            default:
                System.out.println("Operação desconhecida");
        }
    }
}

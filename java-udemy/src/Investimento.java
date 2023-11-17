import java.util.Scanner;

public class Investimento {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor inicial investido em R$:");
        double valorInvestido = leitor.nextDouble();

        System.out.println("Informe a taxa de juros em %:");
        double taxa = leitor.nextDouble();
        double juros = taxa / 100;

        System.out.println("Informe o tempo em meses que o dinheiro ficará investido:");
        int tempo = leitor.nextInt();

        System.out.println(valorInvestido + " reais, " + taxa + "% de juros ao mês por " + tempo + " meses.");
        System.out.println();

        for (int i = 0; i < tempo; i++) {
            double jurosMensais = valorInvestido * juros;
            valorInvestido += jurosMensais;
            System.out.println("Mês " + (i + 1) +
                    ": Juros: R$" + jurosMensais +
                    ", Saldo: R$" + valorInvestido);
        }
    }
}





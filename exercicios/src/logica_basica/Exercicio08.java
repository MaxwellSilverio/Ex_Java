package logica_basica;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner Enter = new Scanner(System.in);

        System.out.println("Digite o valor em Reais (R$): ");
        float valorReal = Enter.nextFloat();

        float dolar = valorReal / 5.00f;
        float euro = valorReal / 5.50f;
        float libra = valorReal / 6.20f;

        System.out.printf("Dolar: %.2f %n", dolar);
        System.out.printf("Euro: %.2f %n", euro);
        System.out.printf("Libra: %.2f %n", libra);

        Enter.close();
    }
}

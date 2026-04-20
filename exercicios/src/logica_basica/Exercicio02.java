package logica_basica;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner Enter = new Scanner(System.in);

        System.out.println("Vamos somar dois números!");

        System.out.print("Digite o primeiro número: ");
        double num1 = Enter.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = Enter.nextDouble();

        double soma = num1 + num2;

        System.out.println("A soma de " + num1 + " + " + num2 + " é igual a: " + soma);

        Enter.close();
    }
}
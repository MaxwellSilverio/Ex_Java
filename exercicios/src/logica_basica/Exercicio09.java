//Leia o valor de uma compra e o valor pago, e calcule o troco mostrando:
//notas de 100, 50, 20, 10, 5, 2
// moedas de 1

//Trabalhando com o operador de módulo(%)

package logica_basica;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner Enter = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        float valorCompra = Enter.nextFloat();

        System.out.println("Digite o valor pago: ");
        float valorPago = Enter.nextFloat();

        Enter.close();

        int troco = (int) (valorPago - valorCompra); //Convertendo pra inteiro

        System.out.println("Troco total: R$ " + troco);

        int notas100 = troco / 100;
        troco = troco % 100;

        int notas50 = troco / 50;
        troco = troco % 50;

        int notas20 = troco / 20;
        troco = troco % 20;

        int notas10 = troco / 10;
        troco = troco % 10;

        int notas5 = troco / 5;
        troco = troco % 5;

        int notas2 = troco / 2;
        int moedas1 = troco % 2;

        System.out.println("Notas de 100: " + notas100);
        System.out.println("Notas de 50: " + notas50);
        System.out.println("Notas de 20: " + notas20);
        System.out.println("Notas de 10: " + notas10);
        System.out.println("Notas de 5: " + notas5);
        System.out.println("Notas de 2: " + notas2);
        System.out.println("Moedas de 1: " + moedas1);


    }
}

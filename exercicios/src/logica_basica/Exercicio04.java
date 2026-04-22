// Leia o valor de um produto e aplique:
//15% de desconto
//depois 8% de imposto sobre o valor com desconto
//Exiba o valor final.

package logica_basica;

import java.util.Scanner;

public class Exercicio04{
    public static void main(String[] args){
        Scanner Enter = new Scanner(System.in);

        System.out.println("Digite o valor do produto ");
        float produto = Enter.nextFloat();

        Enter.close();

        float desconto = 0.15f;
        float imposto = 0.08f;

        float Valor_Desconto = produto - (produto * desconto);
        float Valor_Final = Valor_Desconto + (Valor_Desconto * imposto);

        System.out.printf("O valor final: %.2f ", Valor_Final);
    }
}
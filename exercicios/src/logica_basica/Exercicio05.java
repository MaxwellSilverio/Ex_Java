//Leia um valor em segundos e converta para horas, minutos e segundos.


package logica_basica;

import java.util.Scanner;

public class Exercicio05{
    public static void main(String[] args){

        Scanner Enter = new Scanner(System.in);

        System.out.println("Digite os segundos: ");
        int segundos = Enter.nextInt();

        Enter.close();

        float minutos = segundos / 60;
        float Hora = minutos / 60;

        System.out.printf(" Segundo: %d\n minutos: %.2f\n Hora: %.2f ", segundos, minutos, Hora);

    }
}
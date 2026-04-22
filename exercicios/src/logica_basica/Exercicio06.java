//Leia a distância percorrida (km) e o tempo gasto (horas) e calcule a velocidade média.

package logica_basica;

import java.util.Scanner;

public class Exercicio06{
    public static void main(String[] args){
        Scanner Enter = new Scanner(System.in);

        System.out.println("Digite a distancia percorrida (km) ");
        float DistanciaPercorrida_Km = Enter.nextFloat();

        System.out.println("Digite o tempo gasto (Horas) ");
        float TempoGasto_HOra = Enter.nextFloat();

        Enter.close();

        float DistanciaPercorrida_m = DistanciaPercorrida_Km * 1000;
        float Tempogasto_Segundos = TempoGasto_HOra * 3600;

        float VelocidadeMedia = DistanciaPercorrida_m / Tempogasto_Segundos;

        System.out.printf("Velocidade média: %.2f  m/s ", VelocidadeMedia);


    }
}
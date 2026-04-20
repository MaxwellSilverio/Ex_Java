package logica_basica;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner Enter = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = Enter.nextLine();

        System.out.println("Olá, " + nome + "! Bem-vindo à minha jornada de estudos em Java.");

        Enter.close();
    }
}
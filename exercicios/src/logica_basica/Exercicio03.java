//Leia nome, idade e salário de uma pessoa e exiba uma frase completa
// com tudo formatado (salário com 2 casas decimais).


package logica_basica;

import java.util.Scanner;

public class Exercicio03{
    public static void main(String[] args){
        Scanner Enter = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = Enter.nextLine();

        System.out.println("Digite a idade: ");
        int idade = Enter.nextInt();

        System.out.println("Digite o salário ");
        float salario = Enter.nextFloat();

        Enter.close();

        System.out.printf("O nome é: %s\nIdade: %d\nSalário: %.2f", nome, idade, salario);

    }
}


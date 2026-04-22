//Leia a quantidade de alunos e a quantidade de provas aplicadas,
// depois leia a soma total das notas e calcule a média geral.

package logica_basica;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner Enter = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int qtdAlunos = Enter.nextInt();

        System.out.print("Digite a quantidade de provas aplicadas por aluno: ");
        int qtdProvasPorAluno = Enter.nextInt();

        System.out.print("Digite a soma total de todas as notas: ");
        float somaNotas = Enter.nextFloat();

        Enter.close();

        int totalAvaliacoes = qtdAlunos * qtdProvasPorAluno;
        float mediaGeral = somaNotas / totalAvaliacoes;

        System.out.printf("A média geral da turma é: %.2f%n", mediaGeral);
    }
}

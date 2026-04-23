//Digite o nome
//Mostre o tamalho do nome
//mostre o nome com todas as letras maiusculas e minusculas
// pegue a primeira letra, a segunda, as duas primeiras e as duas últimas
// nome invertido

package logica_basica;

import java.util.Scanner;

public class Exercicio10{
    public static void main(String[] args){
        Scanner Enter = new Scanner(System.in);

       System.out.println("Digite o nome: ");
       String nome = Enter.nextLine();

       Enter.close();

       int tamanho = nome.length();

       String LetrasMaiusculas = nome.toUpperCase();
       String Letrasminusculas = nome.toLowerCase();

       char primeira = nome.charAt(0);
       char segunda = nome.charAt(1);
       char Ultima = nome.charAt(tamanho - 1);
       char penultima = nome.charAt(tamanho -2);

       String DuasPrimeiras = nome.substring(0,2);
       String DuasUltimas = nome.substring(tamanho -2);

       String invertido = new StringBuilder(nome).reverse().toString();


        System.out.println("Letras maiusculas " + LetrasMaiusculas + "\n" +
                            "Letras minúsculas " + Letrasminusculas + "\n" +
                            " Tamanho: " + tamanho + "\n" +
                            "priemira letra " + primeira + "\n" +
                            "Segunda letra " + segunda + "\n" +
                            "A ultima letra: " + Ultima + "\n" +
                            "A penultima letra " + penultima + "\n" +
                            "As duas primeiras " + DuasPrimeiras + "\n" +
                            "As duas ultimas " + DuasUltimas + "\n" +
                            "O nome invertido " + invertido );
    }
}
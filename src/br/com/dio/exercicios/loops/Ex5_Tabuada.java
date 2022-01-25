package br.com.dio.exercicios.loops;

/*
Desenvolva um gerador de tabuada
capaz de gerar a tabuada de qualquer número inteiro.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
 */
import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual número você quer ver a tabuada?");
        int tabuada = scan.nextInt();
        System.out.println("Segue a tabuada de " + tabuada + "\n");

        for (int i = 0; i <= 10; i++){

            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }

    }
}

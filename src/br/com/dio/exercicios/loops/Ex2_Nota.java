package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 * Faça um programa que peça uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido e
 * continue pedindo até que o usuário informe um valor válido.
 *  */
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma nota entre 0 e 10: ");

        int nota;

        while (true) {
            System.out.println("Nota: ");
            nota = scan.nextInt();
            if (nota <= 10) {
                break;
            } else {
                System.out.println("Nota inválida, digite novamente");
            }
        }
    }
}

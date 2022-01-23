package br.com.dio.exercicios.loops;

/*
Faça um programa que peça N números inteiros.
Calcule e mostre a quantidade de números pares
e a quantidade de números impares.
 */

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int contador = 0;
        int numero;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

        } while (contador < quantNumeros);

    }
}

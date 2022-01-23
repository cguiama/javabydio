package br.com.dio.exercicios.loops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
 */

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int contador = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            soma = soma + numero;

            if (numero > maior) maior = numero;

            contador++;
        } while (contador < 5);

        System.out.println("O maior número é: " + maior);
        System.out.println("A média dos números digitados é: " + (soma / 5));

    }
}

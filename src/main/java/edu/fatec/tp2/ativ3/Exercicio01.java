/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package edu.fatec.tp2.ativ3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int[] vetor50 = new int[50];

        int valorReferencia;
        int countMenor = 0;
        int countIgual = 0;
        int countVetor50 = 0;

        System.out.println("Digite 10 números inteiros: ");
        for (int i = 0; i < 10; i++) {
            System.err.printf("%dº número: ", i + 1);
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite o valor de referência: ");
        valorReferencia = scanner.nextInt();

        for (int num : vetor) {
            if (num > valorReferencia) {
                System.out.println(num);
            }
            if (num < valorReferencia) {
                countMenor++;
            }
            if (num == valorReferencia) {
                countIgual++;
            }
        }

        Random rand = new Random();
        for (int i = 0; i < 50; i++) {
            vetor50[i] = rand.nextInt(100);
            for (int num : vetor) {
                if (vetor50[i] == num) {
                    countVetor50++;
                    break;
                }
            }
        }

        System.out.println("Quantidade de números menores que o valor de referência: " + countMenor);
        System.out.println("Quantidade de vezes que o valor de referência aparece: " + countIgual);
        System.out.println("Quantidade de vezes que cada número informado consta no segundo vetor: " + countVetor50);
        System.out.println("Porcentagem de números do vetor de 50 posições que constam no primeiro: " + ((double) countVetor50 / 50) * 100 + "%");
    }
}

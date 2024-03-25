/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] w = new int[10];
        int[] k = new int[10];

        System.out.print("Inserir os elementos dos vetores w e k manualmente? (s/n): ");
        String escolha = scanner.nextLine().trim().toLowerCase();

        if (escolha.equals("s")) {
            System.out.print("Insira 10 elementos para o vetor w: ");
            for (int i = 0; i < 10; i++) {
                w[i] = scanner.nextInt();
            }

            System.out.print("Insira 10 elementos para o vetor k: ");
            for (int i = 0; i < 10; i++) {
                k[i] = scanner.nextInt();
            }
        } else {
            for (int i = 0; i < 10; i++) {
                w[i] = random.nextInt(100);
                k[i] = random.nextInt(100);
            }
        }

        double soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += w[i] + k[9 - i];
        }

        System.out.println("A soma calculada é: " + soma);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ3;

import java.util.Random;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio06 {

    public static void main(String[] args) {
        int[] w = new int[100];
        int[] j = new int[100];
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            w[i] = rand.nextInt(101);
            j[i] = rand.nextInt(101);
        }

        double t = calcularT(w, j);

        System.out.println("O valor de t é: " + t);
    }

    private static double calcularT(int[] w, int[] j) {
        double maxW = Integer.MIN_VALUE;
        double minJ = Integer.MAX_VALUE;

        double somaW = 0;
        double somaJ = 0;

        for (int i = 0; i < w.length; i++) {

            if (w[i] > maxW) {
                maxW = w[i];
            }

            if (j[i] < minJ) {
                minJ = j[i];
            }

            somaW += w[i];
            somaJ += j[i];
        }

        double mediaW = somaW / w.length;
        double mediaJ = somaJ / j.length;

        return ((maxW * (minJ + 1)) / (mediaW + mediaJ));
    }
}

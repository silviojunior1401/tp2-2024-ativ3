/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ3;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[20];
        int[] b = new int[20];
        Set<Integer> conjuntoC = new TreeSet<>();

        for (int i = 0; i < 20; i++) {
            a[i] = random.nextInt(51);
            b[i] = random.nextInt(51);
            conjuntoC.add(a[i]);
            conjuntoC.add(b[i]);
        }

        int[] c = conjuntoC.stream().mapToInt(i -> i).toArray();

        System.out.println("Vetor A: " + Arrays.toString(a));
        System.out.println("Vetor B: " + Arrays.toString(b));
        System.out.println("Vetor C: " + Arrays.toString(c));
    }
}

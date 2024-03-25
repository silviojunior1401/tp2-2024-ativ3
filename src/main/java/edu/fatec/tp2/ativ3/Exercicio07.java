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
public class Exercicio07 {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] j = new double[100];
        double soma = 0;

        for (int i = 0; i < j.length; i++) {
            j[i] = rand.nextInt(101);
            soma += j[i];
        }
        
        double media = soma / j.length;

        double somatorio = 0;
        for (int i = 0; i < j.length; i++) {
            somatorio += Math.pow(j[i] - media, 2);
        }
        
        double desvioPadrao = Math.sqrt(somatorio / (j.length - 1));
        
        System.out.println("Desvio Padrão: " + desvioPadrao);
    }
}

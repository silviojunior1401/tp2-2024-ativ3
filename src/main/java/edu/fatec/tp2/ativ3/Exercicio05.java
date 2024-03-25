/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ3;

import java.util.Scanner;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para geração da tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("\nTabuada do " + numero + ":");

        System.out.println("\nSoma:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " + " + i + " = " + (numero + i));
        }

        System.out.println("\nMultiplicação:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

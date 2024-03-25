/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ3;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio08 {

    public static void main(String[] args) {
        int[] acertos = {8, 4, 6, 10, 9, 7, 8, 12, 5, 8, 3};
        double media = calcularMedia(acertos);
        double[] discrepancias = calcularDiscrepancias(acertos, media);
        double variancia = calcularVariancia(discrepancias);

        System.out.println("Jogador\t Acertos (Xi)\txi\t(xi)^2");
        for (int i = 0; i < acertos.length; i++) {
            System.out.printf("%d\t %d\t\t%.2f\t%.2f\n", i + 1,
                    acertos[i], discrepancias[i], Math.pow(discrepancias[i], 2));
        }

        System.out.printf("\nVariância: %.2f\n", variancia);
    }

    private static double calcularMedia(int[] acertos) {
        int soma = 0;

        for (int acerto : acertos) {
            soma += acerto;
        }

        return soma / acertos.length;
    }

    private static double[] calcularDiscrepancias(int[] acertos, double media) {

        double[] discrepancias = new double[acertos.length];

        for (int i = 0; i < acertos.length; i++) {
            discrepancias[i] = acertos[i] - media;
        }
        
        return discrepancias;
    }

    private static double calcularVariancia(double[] discrepâncias) {
        double somatoria = 0;

        for (double discrepância : discrepâncias) {
            somatoria += Math.pow(discrepância, 2);
        }

        return somatoria / discrepâncias.length;
    }
}

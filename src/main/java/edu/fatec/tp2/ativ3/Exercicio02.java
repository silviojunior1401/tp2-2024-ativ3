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
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] codigos = new int[10];
        double[] valoresUnitarios = new double[10];
        int[] quantidades = new int[10];
        double[] totaisItens = new double[10];
        int totalItensVendidos = 0;
        double valorTotalVendido = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o código do produto: ");
            codigos[i] = scanner.nextInt();
            System.out.print("Digite o valor unitário do produto: ");
            valoresUnitarios[i] = scanner.nextDouble();
            System.out.print("Digite a quantidade vendida do produto: ");
            quantidades[i] = scanner.nextInt();
            totaisItens[i] = valoresUnitarios[i] * quantidades[i];
            totalItensVendidos += quantidades[i];
            valorTotalVendido += totaisItens[i];
        }

        System.out.println("CODIGO\t V. UNIT\t QTD\t TOTAL ITEM");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t   %.2f\t  %d\t %.2f\n", codigos[i], valoresUnitarios[i], quantidades[i], totaisItens[i]);
        }

        System.out.println("Quantidade total de itens vendidos: " + totalItensVendidos);
        System.out.println("Valor total vendido: " + valorTotalVendido);
        System.out.println("Quantidade média de itens por venda: " + (double) totalItensVendidos / 10);
        System.out.printf("Valor unitário médio: %.2f", valorTotalVendido / totalItensVendidos);
        System.out.println("Média do valor total por item: " + valorTotalVendido / 10);

        System.out.printf("Digite um código para consulta de item vendido: ");
        int codigoConsulta = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            if (codigos[i] == codigoConsulta) {
                System.out.println("Código: " + codigos[i]);
                System.out.println("Valor unitário: " + valoresUnitarios[i]);
                System.out.println("Quantidade: " + quantidades[i]);
                System.out.println("Total do item: " + totaisItens[i]);
                break;
            }
        }
    }
}

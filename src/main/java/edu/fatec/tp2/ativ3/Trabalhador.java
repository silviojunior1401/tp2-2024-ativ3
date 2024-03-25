/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ3;

/**
 *
 * @author Silvio Junior
 */
public class Trabalhador extends Pessoa {
    private double salario;

    public Trabalhador(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    @Override
    public void reportar() {
        System.out.println("Nome: " + nome + ", Salário: " + salario);
    }
}

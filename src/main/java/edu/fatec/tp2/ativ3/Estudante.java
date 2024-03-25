/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ3;

/**
 *
 * @author Silvio Junior
 */
public class Estudante extends Pessoa {
    private int idade;

    public Estudante(String nome, int idade) {
        super(nome);
        this.idade = idade;
    }

    @Override
    public void reportar() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ3;

import java.util.ArrayList;

/**
 *
 * @author Silvio Junior
 */
public class OO_Exercicio05 {

    public static void main(String[] params) {
        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
        Trabalhador t1 = new Trabalhador("jorge", 2000.0);
        Trabalhador t2 = new Trabalhador("jose", 5600.0);
        Estudante e1 = new Estudante("luiz", 23);
        Estudante e2 = new Estudante("tatiane", 21);

        lista.add(t1);
        lista.add(t2);
        lista.add(e1);
        lista.add(e2);

        for (Pessoa p : lista) {
            p.reportar();
        }
    }
}

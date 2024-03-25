/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ3;

/**
 *
 * @author Silvio Junior
 */
public class Nightingale extends Bird {

    Nightingale() {
        referenceCount++;
    }

    public static void main(String args[]) {
        System.out.print("Before: " + getRefCount());
        Nightingale florence = new Nightingale();
        System.out.print(" After: " + getRefCount());
        florence.fly();
    }
}

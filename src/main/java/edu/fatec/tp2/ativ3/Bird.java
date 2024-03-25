/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ3;

/**
 *
 * @author Silvio Junior
 */
public class Bird {

    protected static int referenceCount = 0;
    int a;

    protected void fly() {
        System.out.print("Flap Flap:" + a);
    }

    static int getRefCount() {
        return referenceCount;
    }
}

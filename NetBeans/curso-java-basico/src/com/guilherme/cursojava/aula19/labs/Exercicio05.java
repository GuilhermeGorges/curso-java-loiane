/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula19.labs;

import com.guilherme.cursojava.aula15.labs.*;

/**
 *
 * @author Gui e Di
 */
public class Exercicio05 {
    public static void main(String[] args) {
        
        int[] a = new int[10];
        double[] b = new double[a.length];
        
        for (int i = 0; i < a.length; i++){
            a[i] = i;
            b[i] = (a[i]*i);
        }
        
        for (int i = 0; i < a.length; i++){
        System.out.print("A = "+a[i]);
        System.out.print(" B = "+b[i]+"\n");
        }
    }
    
}
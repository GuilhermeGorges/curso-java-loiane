/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula17.loopfor.labs;

import java.util.Scanner;

/**
 *
 * 
 */
public class Exercicio10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite onde a contagem deverá iniciar");
        int start = scan.nextInt();
        
        
        System.out.println("Digite onde a contagem deverá terminar");
        int end = scan.nextInt();
        
        for ( ;start < end; start++){
            System.out.print(start);
        }
        
    }
}

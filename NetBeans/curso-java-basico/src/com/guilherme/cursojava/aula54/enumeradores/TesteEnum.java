/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula54.enumeradores;

/**
 *
 * 
 */
public class TesteEnum {
    public static void main(String[] args) {
        
        DiaSemana dia = DiaSemana.SEGUNDA;
        
        
        System.out.println(dia.toString() + " - " + dia.getValor());
        
        Data data = new Data(1, 4, 2000, DiaSemana.SEXTA);
    }
}

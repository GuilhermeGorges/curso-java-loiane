package com.guilherme.cursojava.aula25orientacaoaobjetos_metodos_semretorno;

public class TesteCarro {
    public static void main(String[] args) {
        
        Carro van = new Carro();
        van. marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        
        System.out.println(van.marca);
        System.out.println(van.modelo);
        van.exibirAutonomia();
        
        Carro fusca = new Carro();
        van. marca = "Volkswagen";
        van.modelo = "Fusca";
        van.numPassageiros = 4;
        van.capCombustivel = 30;
        van.consumoCombustivel = 0.15;
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula56.enumeradores;

/**
 *
 * @author Gui e Di
 */
public class Pessoa {
    
    private TipoDocumento tipoDocumento;
    private String numeroDocumento;
    
    public Pessoa(){
        super();        
    }

    public Pessoa(TipoDocumento tipoDocumento, String numeroDocumento) {
        super();
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }
    
    

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + '}';
    }    
    
    
}

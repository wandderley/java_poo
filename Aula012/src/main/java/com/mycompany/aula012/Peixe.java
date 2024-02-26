/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula012;

/**
 *
 * @author Luiz
 */
public class Peixe extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("comend osubstancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("peixe nao faz som");
    }
    
    public void soltarBolha(){
        System.out.println("soltando bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
}

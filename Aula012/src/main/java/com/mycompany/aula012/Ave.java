/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula012;

/**
 *
 * @author Luiz
 */
public class Ave extends Animal{
    private String corPena;
    
    @Override
    public void locomover() {
        System.out.println("voando");
    }

    @Override
    public void alimentar() {
        System.out.println("frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de ave");
    }
    public void fazerNinho(){
        System.out.println("fazendo ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula02;

/**
 *
 * @author Luiz
 */
public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.modelo = "bic";
        c1.carga = 90;
        c1.destampar();
        c1.rabiscar();
        c1.status();
        
        Caneta c2 = new Caneta();
        c2.modelo = "FaberCastel";
        c2.cor = "Preta";
        c2.ponta = 0.7f;
        c2.carga = 30;
        c2.tampar();
        c2.status();
        c2.rabiscar();
        
    }
}

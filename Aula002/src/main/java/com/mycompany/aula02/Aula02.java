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
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.ponta = 0.333333f;
        c1.carga = 80;
        //c1.tampada = true;    
        c1.tampar();
        c1.status();     
        c1.rabiscar();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparacaostring;

/**
 *
 * @author Luiz
 */
public class ComparacaoString {

    public static void main(String[] args) {
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String ("Gustavo");
        String res;
        res = (nome1.equals(nome3)) ? "igual":"diferente";
        System.out.println(res);
    }
}

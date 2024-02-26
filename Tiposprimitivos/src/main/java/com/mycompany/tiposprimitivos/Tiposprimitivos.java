/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Luiz
 */
public class Tiposprimitivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite nome do aluno:");
        String nome = teclado.nextLine();
        System.out.print("Digite nota do aluno");
        float nota = teclado.nextFloat();
        
        System.out.format("A nota de %s é %.2f", nome, nota);
        
               
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class Palabras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabraInversa = "";
        String palabra = sc.next();
        if (palabra.length() < 4) {
            System.out.println(palabra.toUpperCase());

        } else if (palabra.length() >= 4 && palabra.length() < 8) {
            System.out.println(palabra.toLowerCase());
            
        } else if (palabra.length() >= 8 && palabra.length() < 11) {
            palabra = palabra.replace('a', 'á');
            palabra = palabra.replace('e', 'é');
            palabra = palabra.replace('i', 'í');
            palabra = palabra.replace('o', 'ó');
            palabra = palabra.replace('u', 'ú');
            System.out.println(palabra);

        } else if (palabra.length() >= 11) {
            for (int i = palabra.length() - 1; i >= 0; i--) {
                palabraInversa += String.valueOf(palabra.charAt(i));
                System.out.println(palabraInversa);
            }
        }

    }
}

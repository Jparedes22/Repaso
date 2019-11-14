/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenprimera;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la palabra maestra");
        String palabraMaestra = sc.next();
        String palabraSecundaria;
        int longitud = palabraMaestra.length();

        do {
            System.out.println("Introduce una palabra secundaria");
            palabraSecundaria = sc.next();
            if (palabraMaestra.toLowerCase().contains(palabraSecundaria.
                    toLowerCase())) {
                System.out.printf("%d letras%n", longitud);
            }
            if (palabraSecundaria.toLowerCase().equals(palabraMaestra.
                    toLowerCase())) {
                for (int i = longitud - 1; i >= 0; i--) {

                    System.out.print(palabraMaestra.charAt(i));
                }
            }

        } while (!palabraMaestra.toLowerCase().contains(palabraSecundaria.
                toLowerCase()));

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class GeneradorPalabras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int aleatorio;
        String palabraGenerada = "";
        System.out.println("Introduce la longitud de la palabra");
        int longitud = sc.nextInt();
        for (int i = 0; i < longitud; i++) {
            aleatorio = (int) (Math.random() * 26);

            palabraGenerada += letras[aleatorio];
        }
        System.out.println(palabraGenerada);
    }
}

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
public class SumaArrayas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud de los arrays");
        int longitud = sc.nextInt();
        int[] array1 = new int[longitud];
        int[] array2 = new int[longitud];
        int[] array3 = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            System.out.println("Introduce un número");
            int numeros = sc.nextInt();
        }
    }
}

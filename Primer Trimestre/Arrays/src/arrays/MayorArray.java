/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Usuario DAM 1
 */
public class MayorArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la logitud del array");
        int longitud = sc.nextInt();
        int[] numeros = new int[longitud];
        System.out.println("Introduce los datos del array");
        for (int i = 0; i < longitud; i++) {
            System.out.println("Introduce un número");
            int newNum = sc.nextInt();
            numeros[i] = newNum;
            
        }
        System.out.println("===================================");
        Arrays.sort(numeros);
            System.out.printf("El mínimo es: %d%n",numeros[0]);
            System.out.printf("El máximo es: %d%n",numeros[numeros.length-1]);
        
    }
}

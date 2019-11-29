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
public class MultiplicarArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int acumulador = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un número");
            int num2 = sc.nextInt();
            numeros[i] = num2 * 2;
            acumulador += numeros[i];
        }
        System.out.println("====================================");
        System.out.printf("La suma total es: %d%n", acumulador);
        System.out.printf("La media es: %d%n", acumulador / 5);
    }
}

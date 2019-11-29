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
public class LlenarArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un número del 10 al 50");
            int numero = sc.nextInt();
            array[i] = numero;
        }
        for(int n:array){
            System.out.println(n);
        }
    }
}

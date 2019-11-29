/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class Loteria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aciertos = 0;
        int[] boleto = new int[7];
        int[] loteria = new int[7];
        for (int i = 0; i < boleto.length; i++) {
            System.out.println("Introduce un número");
            int numero = sc.nextInt();
            boleto[i] = numero;
        }
        for (int i = 0; i < 7; i++) {
            int aleatorio = (int) (Math.random() * 10);
            loteria[i] = aleatorio;
        }
        Arrays.sort(boleto);
        Arrays.sort(loteria);
        for (int i = 0; i < boleto.length; i++) {
            if (boleto[i] != loteria[i]) {
                System.out.println("Has perdido");
                break;
            } else {
                aciertos++;
            }
        }
        if (aciertos == 7) {
            System.out.println("Has ganado");
        }
    }
}

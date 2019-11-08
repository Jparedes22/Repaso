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
public class Repaso {

    static String nombre = "50";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        miMetodo(5);
        nombre = "20";
        int num1 = 5;
        int num2 = 10;
        boolean nums = num1 > num2;
        System.out.println(nums);
        System.out.println(nombre);
        String palabra = "eyou";
        palabra.charAt(0);
        System.out.println(palabra.charAt(1));
        System.out.println(palabra.replace('o', '0'));

        if (palabra.contains("ou")) {
            System.out.println("Illo ke paza");
        } else {
            System.out.println("Illo no paza");
        }
    }

    public static int miMetodo(int arg1) {
        nombre = "21";
        System.out.println(nombre);
        return 1;

    }
}

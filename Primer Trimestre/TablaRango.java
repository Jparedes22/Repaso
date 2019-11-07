/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurafor;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class TablaRango {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = sc.nextInt();
        System.out.println("Introduce otro número para cerrar el rango");
        int num2 = sc.nextInt();
        for (int i = num; i <= num2; i++) {
            int multi0 = 1 * 0;
            int multi = 1 * i;
            int multi2 = 2 * i;
            int multi3 = 3 * i;
            int multi4 = 4 * i;
            int multi5 = 5 * i;
            int multi6 = 6 * i;
            int multi7 = 7 * i;
            int multi8 = 8 * i;
            int multi9 = 9 * i;
            int multi10 = 10 * i;
            System.out.printf("%d x 0=%d%n", i, multi0);
            System.out.printf("%d x 1=%d%n", i, multi);
            System.out.printf("%d x 2=%d%n", i, multi2);
            System.out.printf("%d x 3=%d%n", i, multi3);
            System.out.printf("%d x 4=%d%n", i, multi4);
            System.out.printf("%d x 5=%d%n", i, multi5);
            System.out.printf("%d x 6=%d%n", i, multi6);
            System.out.printf("%d x 7=%d%n", i, multi7);
            System.out.printf("%d x 8=%d%n", i, multi8);
            System.out.printf("%d x 9=%d%n", i, multi9);
            System.out.printf("%d x 10=%d%n", i, multi10);
        }

    }
}

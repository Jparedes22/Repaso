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
public class EjercicioUnoRepaso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double acumPar = 0;
        double acumImpar = 0;
        int contPar = 0;
        int contImpar = 0;
        int contNum = 0;
        int contCero = 0;
        int opcion;
        System.out.println("Introduce número positivos, el sistema parará "
                + "cuando introduzca un negativo");
        double num;
        do {
            num = sc.nextDouble();

            if (num >= 0) {
                contNum++;
                if (num % 2 == 0) {
                    if (num == 0) {
                        contCero++;
                    } else if (num != 0) {
                        acumPar = acumPar + num;
                        contPar++;
                    }
                } else if (num % 2 != 0) {
                    acumImpar = acumImpar + num;
                    contImpar++;
                } else {

                }
            }
        } while (num >= 0);
        do {
            System.out.println("1. Suma de los números pares");
            System.out.println("2. Media de los números pares");
            System.out.println("3. Media de los números impares");
            System.out.println("4. Cuántos números se han introducido");
            System.out.println("5. Número de ceros, pares e impares");
            System.out.println("6. Salir");
            System.out.println("Introduce el número del menú al que quieras "
                    + "acceder");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("La suma de los pares es: %.2f%n", acumPar);
                    System.out.println("");
                    break;
                case 2:
                    System.out.printf("La media de los  pares es: %.2f%n", acumPar / contNum);
                    System.out.println("");
                    break;
                case 3:
                    System.out.printf("La media de los impares es:%.2f%n", acumImpar / contNum);
                    System.out.println("");
                    break;
                case 4:
                    System.out.printf("Se han introducido %d números%n", contNum);
                    System.out.println("");
                    break;
                case 5:
                    System.out.printf("Se han introducido %d ceros, %d pares y %d impares%n", contCero, contPar, contImpar);
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Fin del proceso");
                    break;
            }
        } while (opcion != 6);

    }
}

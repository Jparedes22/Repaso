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
public class Cajero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double saldo = 0;
        int pin;
        double saldoDos;
        do {
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Sacar dinero");
            System.out.println("3. Consultar el estado de la cuenta");
            System.out.println("4. Salir");
            System.out.println("Introduce la opción que quieras");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el PIN");
                    pin = sc.nextInt();
                    if (pin == 1111) {
                        System.out.println("Introduzca el dinero que quiere ingresar");
                        saldoDos = sc.nextDouble();
                        saldo += saldoDos;
                    } else {
                        System.out.println("Pin incorrecto. Introdúcelo de nuevo");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Introduce el PIN");
                    pin = sc.nextInt();
                    if (pin == 1111) {
                        System.out.println("Introduce el dinero que quieres sacar");
                        if (saldo <= 0) {
                            System.out.println("Imposible sacar dinero");
                            System.out.println("");
                        } else {
                            saldoDos = sc.nextDouble();
                            saldo -= saldoDos;
                        }
                    } else {
                        System.out.println("Pin incorrecto. Introdúcelo de nuevo");
                    }

                    break;
                    
                case 3:
                    System.out.println("Introduce el PIN");
                    pin = sc.nextInt();
                    if (pin == 1111) {
                    System.out.printf("El estado de la cuenta es de %.2f €%n", saldo);
                    System.out.println("");
                    }else {
                        System.out.println("Pin incorrecto. Introdúcelo de nuevo");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Saliendo");
                    break;
            }

        } while (opcion != 4);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenprimera;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class ExamenPrimera {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PRECIOREFRESCO = 1.20;
        final double PRECIOCAFE = 1.00;
        final double PRECIOBOCADILLO = 3.20;
        final double PRECIOMENU = 9.50;

        int contRefresco = 0;
        int contCafe = 0;
        int contBocadillo = 0;
        int contMenu = 0;

        int numCafe;
        int numBocadillo;
        int numRefresco;
        int numMenu;

        int opcion;
        do {
            System.out.println("1. Pedir café");
            System.out.println("2. Pedir refresco");
            System.out.println("3. Pedir bocadillo");
            System.out.println("4. Pedir menú");
            System.out.println("5. Sacar la cuenta");
            System.out.println("Introduce la opción deseada");
            opcion = sc.nextInt();
            if (opcion < 0) {
                System.out.println("Dato Incorrecto");
            } else {
                switch (opcion) {
                    case 1:
                        System.out.println("¿Cuántos cafés quieres?");
                        numCafe = sc.nextInt();
                        contCafe += numCafe;
                        System.out.printf("Ha pedido %d café(s)%n", contCafe);
                        break;
                    case 2:
                        System.out.println("¿Cuántos refrescos quieres?");
                        numRefresco = sc.nextInt();
                        contRefresco += numRefresco;
                        System.out.printf("Ha pedido %d refresco(s)%n", contRefresco);
                        break;
                    case 3:
                        System.out.println("¿Cuántos bocadillos quieres?");
                        numBocadillo = sc.nextInt();
                        contBocadillo += numBocadillo;
                        System.out.printf("Ha pedido %d bocadillo(s)%n", contBocadillo);
                        break;
                    case 4:
                        System.out.println("¿Cuántos menús quieres?");
                        numMenu = sc.nextInt();
                        contMenu += numMenu;
                        System.out.printf("Ha pedido %d menú(s)%n", contMenu);
                        break;
                    case 5:
                        System.out.println("Pidiendo cuenta...");
                    default:
                        System.out.println("Número introducido incorrecto");
                        break;
                }
            }
        } while (opcion != 5);
        
        double totalRefresco = PRECIOREFRESCO * contRefresco;
        double totalCafe = PRECIOCAFE * contCafe;
        double totalBocadillo = PRECIOBOCADILLO * contBocadillo;
        double totalMenu = PRECIOMENU * contMenu;
        double cuenta = totalBocadillo + totalCafe + totalMenu + totalRefresco;
        System.out.printf("Bocadillos: %d%n", contBocadillo);
        System.out.printf("Refrescos: %d%n", contRefresco);
        System.out.printf("Menús: %d%n", contMenu);
        System.out.printf("Cafés: %d%n", contCafe);
        System.out.printf("Precio Total: %.2f € %n", cuenta);
    }
}

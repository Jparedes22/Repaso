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
public class Notas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contSuspensos = 0;
        double acumNotas = 0;
        double nota;
        
        for (int i = 1; i <= 20; i++) {
            System.out.printf("Introduce la nota nº%d%n", i);
            nota = sc.nextDouble();
            acumNotas = acumNotas + nota;
            if (nota < 5&&nota>=10) {
                contSuspensos++;
            }

        }
        if (contSuspensos > 0) {
            System.out.printf("Hay %d suspensos%n", contSuspensos);
        } else {
            System.out.println("No hay suspensos");
        }
        System.out.printf("La media de las notas es: %.2f%n", acumNotas / 20);
    }
}

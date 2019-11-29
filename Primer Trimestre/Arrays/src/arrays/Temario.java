/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Usuario DAM 1
 */
public class Temario {

    public static void main(String[] args) {
        String[] temas = {"Tema 1: Introducción", "Tema 2: Estructura de datos", "Tema 3: Estructuras",
            "Tema 4: Colecciones", "Tema 5: Orientación a objetos", "Tema 6: Clases y Objetos",
            "Tema 7: Abstracción, Herencia y Polimorfismo", "Tema 8: Ficheros y Excepciones",
             "Tema 9: Base de datos", "Tema 10: Interfaces"};
        System.out.printf("Número de temas = %d%n",temas.length);
        for(int i=0;i<10;i++){
            System.out.println(temas[i]);
        }
    }
}

package Ejercicio4;

import java.util.Scanner;

/**
 * Un número primo es un número entero mayor que 1 que solo es divisible por 1 y
 * por sí mismo.
 * Ejemplos de números primos: 2, 3, 5, 7, 11, 13, etc.
 * 
 * Estructura del Programa:
 * Crear un método separado que realice la verificación de si un número es
 * primo.
 * 
 * Interacción con el Usuario:
 * Pedir al usuario que ingrese un número entero positivo.
 * 
 * Mostrar Resultados:
 * Después de verificar si el número es primo, mostrar el resultado al usuario
 * en la consola.
 * 
 */

   
   public class Ejercicio4 {
       public static void main(String[] args) {
           Scanner entrada = new Scanner(System.in);
   
           System.out.println("Ingrese un número entero positivo para verificar si es primo:");
           int numero = entrada.nextInt();
   
           if (numero <= 1) {
               System.out.println("El número debe ser mayor que 1.");
           } else {
               if (esPrimo(numero)) {
                   System.out.println("El número " + numero + " es primo.");
               } else {
                   System.out.println("El número " + numero + " no es primo.");
               }
           }
   
           entrada.close();
       }
   
       // Método para verificar si un número es primo
       public static boolean esPrimo(int numero) {
           if (numero <= 1) {
               return false;
           }
           for (int i = 2; i <= Math.sqrt(numero); i++) {
               if (numero % i == 0) {
                   return false;
               }
           }
           return true;
       }
   }
   
   


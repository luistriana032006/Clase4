package Ejercicio6;

import java.util.Scanner;

/**
 * Necesitamos convertir unidades de longitud (metros a kilómetros y viceversa)
 * y unidades de masa (gramos a kilogramos y viceversa)
 * Estructura del Programa:
 * Crear métodos separados para cada tipo de conversión
 * (metros a kilómetros, kilómetros a metros, gramos a kilogramos, kilogramos a
 * gramos).
 * 
 * Interacción con el Usuario:
 * Pedir al usuario que ingrese el valor y el tipo de conversión que desea
 * realizar.
 * 
 * Mostrar Resultados:
 * Después de realizar la conversión, mostrar el resultado al usuario en la
 * consola.
 * 
 */
public class Ejercicio6 {

    // variables a utilizar dentro de todo los paquetes
    public static double valorAconvertir, resultado;
    public static String unidadAconvertir;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println(" conversion de unidades");
        System.out.println(" Seleccione 1 para M A KM, 2 para KM A M, 3 PARA Kg A G 4 G A kg ");

        System.out.println(" a cual unidad lo quieres convertir ");
        unidadAconvertir = entrada.next();

        System.out.println(" Digite la unidad a convertir ");

        valorAconvertir = entrada.nextDouble();

        /**
         * como un switch agarra solo String tenemos que convertir el numero que entra
         * en un String
         */

         
        switch (unidadAconvertir) {
            case "1":
                System.out.println(" la conversion de " + valorAconvertir + " a kilometros es  "
                        + MetrosAkilometros(valorAconvertir, resultado));
                break;
            case "2":

                System.out.println(" la conversion de " + valorAconvertir + " a metros es "
                        + kilometrosAmetros(valorAconvertir, resultado));
                break;
            case "3":
                System.out.println(" la conversion de " + valorAconvertir + " a gramos es "
                        + kilogramosAgramos(valorAconvertir, resultado));

                break;

            case "4":
                System.out.println(" la conversion de " + valorAconvertir + " a gramos es "
                        + gramosAkilogramos(valorAconvertir, resultado));
                break;

            default: 
            System.out.println(" datos no validos ");
                break;
        }

        entrada.close();

    }

    // Metros a Kilometros
    public static double MetrosAkilometros(double valorAconvertir, double resultado) {
        // conversion unidades
        resultado = valorAconvertir * (1.0 / 1000);

        return resultado;
    }

    // kilometros a metros
    public static double kilometrosAmetros(double valorAconvertir, double resultado) {

        // conversion de unidades

        resultado = valorAconvertir * (1000 / 1.0);

        return resultado;

    }

    // gramos A kilogramos

    public static double gramosAkilogramos(double valorAconvertir, double resultado) {

        // conversion

        resultado = valorAconvertir * (1.0 / 1000);

        return resultado;

    }

    // kilogramos a gramos

    public static double kilogramosAgramos(double valorAconvertir, double resultado) {

        // conversion
        resultado = valorAconvertir * (1000 / 1.0);

        return resultado;

    }

}

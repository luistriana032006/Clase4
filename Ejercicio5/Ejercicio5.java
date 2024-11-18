package Ejercicio5;

import java.util.Scanner;

/**
 * Definir el Problema:
El promedio de tres números se calcula sumando los tres números y dividiendo el resultado entre 3.

Estructura del Programa:
Crear un método separado que realice el cálculo del promedio.

Interacción con el Usuario:
Pedir al usuario que ingrese tres números.

Mostrar Resultados:
Después de calcular el promedio, mostrar el resultado al usuario en la consola.
 * 
 */
public class Ejercicio5 {
    // variables a utilizar en todos los metodos ( firmas )
    public static double divisor =3;
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println(" suma y division");

        double numero1, numero2,numero3;

        
        System.out.println(" digite los 3 numeros ");

        numero1 = entrada.nextDouble();
        numero2 = entrada.nextDouble();
        numero3 = entrada.nextDouble();


        System.out.println(" la suma de los numeros "+ numero1 +" + "+ numero2 + " + "+ numero3 + " divididos por "+ divisor);
        System.out.println( " da el resultado " + operacion(numero1, numero2, numero3));
    entrada.close();
    }
    // Metodo de la operacion

public static  double operacion ( double numero1, double  numero2, double numero3) {

double resultado;

resultado = (numero1 + numero2 + numero3)/ divisor;

return resultado;


}


}

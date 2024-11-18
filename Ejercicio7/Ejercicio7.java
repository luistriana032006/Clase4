package Ejercicio7;

import java.util.Scanner;

/**
 * Necesitamos calcular la potencia de un número dado una base y un exponente. 
 * La fórmula general es resultado = base ^ exponente.
Esto significa que hay que multiplicar la base por si mismo exponente veces.
Por ejemplo:

2 ^ 4 = 2 * 2 * 2 * 2 = 16
5 ^ 2 = 5 * 5 = 25
27 ^ 1 = 27
325 ^ 0 = 1
Recuerda que si el exponente es 0, la potencia es igual a 1.

Estructura del Programa:
Crear un método separado que realice el cálculo de la potencia.

Interacción con el Usuario:
Pedir al usuario que ingrese la base y el exponente.

Mostrar Resultados:
Después de calcular la potencia, mostrar el resultado al usuario en la consola.
 * 
 * 
 */
public class Ejercicio7 {

    // variables a utilizar
    public static double  exponente, base,resultado;
    public static void main(String[] args) {
         System.out.println(" potenciacion");
          Scanner entrada = new Scanner ( System.in);
          System.out.println(" digite la base ");
          base = entrada.nextDouble();
        System.out.println(" digite el exponente");
        exponente = entrada.nextDouble();

          if ( exponente==0) {
        
            System.out.println(" el resultado es 1");
        }
        else {
        
            System.out.println(" la operacion de potenciacion a la base "+ base + 
            " con el exponente "+exponente+ " da "+ potenciacion(base, exponente));
        }
        entrada.close();
    }

    public static double potenciacion ( double base, double exponente) {
    
        resultado = Math.pow(base, exponente );

        return resultado;
    
    }

}

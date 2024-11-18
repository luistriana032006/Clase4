package Ejercicio1;

import java.util.Scanner;

/**
 * ecesitamos convertir temperaturas de Celsius a Fahrenheit y viceversa.
Operaciones para las conversiones:

Celsius a Fahrenheit: La fórmula es F = (C * (9 / 5)) + 32.
Fahrenheit a Celsius: La fórmula es C = (F - 32) / (9 / 5).
Estructura del Programa:
Crear métodos separados para cada conversión.

Interacción con el Usuario:
Pedir al usuario que ingrese la temperatura y el tipo de conversión que desea realizar.
 * 
 */
public class Ejercicio1 {
public static void main(String[] args) {
    Scanner entrada = new Scanner ( System.in);
     System.out.println( " Ejercicio 1 clase 4 ");
     System.out.println( " Conversión de unidades Celsius y Fahrenheit ");

     double celsius;
     double Fahrenheit;
     int seleccionado;

     
     while ( true ) {
    
        System.out.println( " escriba 1 para C A F escriba 2 para F A C ");
        seleccionado= entrada.nextInt();

        // si la forma de conversion es 1  de celsius a Fahrenheit 
        if ( seleccionado ==1) {
            System.out.println( " digite los grados celsius a fahrenheit ");
           celsius = entrada.nextDouble();
      
              System.out.println(" los grados "+celsiusAfahrenheit(celsius)+ " son F ");
          }

        // si la forma de conversion es 2 de Fahrenheit a celsius 
          else if ( seleccionado ==2 ) {
          
              System.out.println(" digite los grados fahrenheit a celsius ");
              Fahrenheit = entrada.nextDouble();
              System.out.println(" los grados "+ fahrenheitAcelsius(Fahrenheit)+" son C ");
          }
          // si no es ninguna de los dos 
          else {
         System.out.println( " datos no validos ");
         // cerramos el scanner dentro del else el cual dice que no se utilizaron datos validos 
    entrada.close();
     }
     // limpiamos el buffer ( entrada de los datos en cada condicion que marque el while )
     entrada.nextLine();
     
        }

}

// Celsius a fahrenheit 

public static double celsiusAfahrenheit (double celsius ) {
double resultado = (celsius *(9.0/5.0))+32; 
return resultado;
}

//Fahrenheit a Celsius

public static double fahrenheitAcelsius (double fahrenheit) {
  double resultado = (fahrenheit-32) / (9.0/5.0);
  return resultado;
}

}
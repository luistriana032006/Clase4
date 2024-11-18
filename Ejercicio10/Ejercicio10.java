package Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
 /**
  * 
Definir el Problema:
Necesitamos generar la tabla de multiplicar de un número dado por el usuario, 
mostrando los resultados desde 1 hasta 10.

Estructura del Programa:
Crear un método separado que genere y muestre la tabla de multiplicar.
Usa printf para formatear la salida del programa.

Interacción con el Usuario:
Pedir al usuario que ingrese el número para el cual desea generar la tabla de multiplicar.

Mostrar Resultados:
Después de generar la tabla de multiplicar, mostrar los resultados al usuario en la consola.
  */   
 // VARIABLES DEL CODIGO 

 public static int numero, resultado,i;
  public static void main(String[] args) {
    Scanner entrada = new Scanner ( System.in);
    System.out.println(" digite el numero ");

    int numero= entrada.nextInt();
    tabla(numero);
   
    
    entrada.close();
  }

  public static int tabla ( int numero ) {

    System.out.println(" la tabla del "+numero + " es ");
    
     for ( int i=0; i<=10; i++ ) {
        
        resultado = numero* i;
        
        System.out.printf("%d x %d = %d%n", numero, i, resultado);

     }


    return resultado;
}
}

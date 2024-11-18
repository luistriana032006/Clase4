package Ejercicio2;

import java.util.Scanner;

/**
 * Definir el Problema:
Un palíndromo es una palabra, frase o secuencia de caracteres que se lee igual de izquierda
 a derecha que de derecha a izquierda, ignorando espacios, puntuación y mayúsculas.
Ejemplos:

radar
anilina
A man, a plan, a canal, Panama
Estructura del Programa:
Crear un método separado que realice la verificación de si una cadena es un palíndromo.

Interacción con el Usuario:
Pedir al usuario que ingrese una cadena de texto.

Mostrar Resultados:
Después de verificar si la cadena es un palíndromo, mostrar el resultado al usuario en la consola.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner ( System.in);
        System.out.println("Ingrese una cadena de texto para verificar si es un palíndromo:"); 
        
        String cadena = entrada.nextLine(); 
        
        if (esPalindromo(cadena)) { 
            System.out.println("La cadena es un palíndromo."); 
        } 
        
        
        else { System.out.println("La cadena no es un palíndromo.");
    
    } entrada.close(); }  
    
    //Método para verificar si una cadena es un palíndromo 
        public static boolean esPalindromo(String cadena) { 
            
            //Eliminar espacios, puntuación y convertir a minúsculas   
    String cadenaLimpia = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
    
    //Verificar si la cadena es igual a su reverso

    String reverso = new StringBuilder(cadenaLimpia).reverse().toString(); 
    
    return cadenaLimpia.equals(reverso);

    }

}


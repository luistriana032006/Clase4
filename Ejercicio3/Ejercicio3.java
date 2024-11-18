package Ejercicio3;

import java.util.Scanner;

/**
 * Crear un método separado que realice el cálculo del factorial.
Interacción con el Usuario:
Pedir al usuario que ingrese un número entero positivo.
Mostrar Resultados:
Después de calcular el factorial, mostrar el resultado al usuario en la consola.
 * 
 * 
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner ( System.in);
        System.out.println(" Numero factorial ");
        System.out.println("Ingrese un número entero positivo para calcular su factorial:"); 
        
        
        int numero = entrada.nextInt(); 
        
        if (numero < 0) { System.out.println("El número debe ser entero positivo."); } 
        
        
        else { long resultado = Factorial(numero); 
            
            System.out.println("El factorial de " + numero + " es: " + resultado); 
        
        
        } 
        
        entrada.close();
    }

    public static long Factorial ( long numeroIngresado) {
    
        long factorial = 1; 
        
        for (int i = 1; i <= numeroIngresado; i++) {
            
            factorial *= i; 
        } 
        
        return factorial;
    
    }
    
    }


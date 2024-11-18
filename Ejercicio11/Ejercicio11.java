package Ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    /**
     * El Índice de Masa Corporal (IMC) es una medida que se utiliza para determinar
     * si una persona tiene un peso saludable en relación con su altura.
     * La fórmula para calcular el IMC es: IMC = (peso_kg / altura_m) ^ 2.
     * 
     * Categorías del IMC:
     * Bajo peso: IMC < 18.5
     * Peso normal: IMC entre 18.5 y 24.9
     * Sobrepeso: IMC entre 25 y 29.9
     * Obesidad:
     * Grado I: IMC entre 30 y 34.9
     * Grado II: IMC entre 35 y 39.9
     * Grado III: IMC ≥ 40.1
     * Estructura del Programa:
     * Crear un método separado que realice el cálculo del IMC.
     * Crear un método separado que determine la categoría del IMC basado en el
     * valor calculado.
     * Interacción con el Usuario:
     * Pedir al usuario que ingrese su peso en kilogramos y su altura en metros.
     * 
     * Mostrar Resultados:
     * Después de calcular el IMC y determinar la categoría, mostrar los resultados
     * al usuario en la consola.
     */

    public static double peso, altura, resultado2;
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(" digite el numero de su peso en kg ");
        peso = entrada.nextDouble();
        System.out.println(" digite el numero de su altura en metros ");
        altura = entrada.nextDouble();

        System.out.println(" su IMC es de " + IMC(peso, altura));

        categoriaIMC(null);

    } 

    public static double IMC(double peso, double altura) {
        double exponente = 2.0;

        double resultado1 = Math.pow(altura, exponente);

        double resultado2 = peso / resultado1;
        return resultado2;
    }

public static void categoriaIMC(String categoria) {

    
    if (resultado2<18.5) {
    
    System.out.println(" IMC de bajo peso");
    
    } 
    
    else if ( resultado2 >=18.5 && resultado2 <=24.9) {
    
    System.out.println ( " IMC de peso normal ");
    }
    else if ( resultado2 >=25 && resultado2 <=29.9) {
    
        System.out.println(" IMC de obecidad ");
    
    }
 
    else if (resultado2>=30 && resultado2 <=34.9) {
    
    System.out.println(" obesidad grado I ");
    }
    
    else if (resultado2==35 && resultado2<=39.9){
    System.out.println( " obesidad grado II");
    
    }

 else if ( resultado2>= 40.1) {

System.out.println( " obesidad grado III");
 }

}
}

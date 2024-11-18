package Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
/**

 *Definir el Problema:
Necesitamos convertir una cantidad de segundos ingresada por el usuario en días, horas, minutos y segundos.

Estructura del Programa:
Crear un método separado que realice la conversión de segundos a días, horas, minutos y segundos.

Interacción con el Usuario:
Pedir al usuario que ingrese la cantidad de segundos.

Mostrar Resultados:
Después de realizar la conversión, mostrar los resultados al usuario en la consola.
Por ejemplo:
 * 
 * 
 */
public static int segundos;
public static void main(String[] args) {
    


    
        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad de segundos
        System.out.println("Ingrese la cantidad de segundos: ");
        long segundos = entrada.nextLong();

        // Convertir los segundos a días, horas, minutos y segundos
        convertirTiempo(segundos);

        entrada.close();
    }

    // Método para convertir segundos a días, horas, minutos y segundos
    public static void convertirTiempo(long segundos) {
        long dias = segundos / 86400;
        segundos %= 86400;

        long horas = segundos / 3600;
        segundos %= 3600;

        long minutos = segundos / 60;
        segundos %= 60;

        // Mostrar los resultados
        System.out.printf("Días: %d, Horas: %d, Minutos: %d, Segundos: %d%n", dias, horas, minutos, segundos);
    }
}



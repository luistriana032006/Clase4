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
    Scanner entrada = new Scanner ( System.in);
        segundos = entrada.nextInt();

System.out.println(" digite los segundos");
    System.out.println(" la cantidad de segundos en dias horas minutos y segundos es de "+conversion(segundos));

    entrada.close();
}

public static int conversion ( int segundos) {

    int dias;
     dias  = segundos / 86400;
return dias;

}

}

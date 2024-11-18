package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
/**Interés Simple: El interés se calcula solo sobre el capital inicial durante todo el período.
Interés Compuesto: El interés se calcula sobre el capital inicial más los intereses acumulados en cada período.
Fórmulas de Cálculo:
Interés Simple: La fórmula es I = P * r * t, donde:
I es el interés.
P es el capital inicial.
r es la tasa de interés anual.
t es el tiempo en años.

Interés Compuesto: La fórmula es A = P * (1 + (r / n) ^ (n * t)), donde:
A es el monto total después del tiempo t.
P es el capital inicial.
r es la tasa de interés anual.
n es el número de veces que se aplica el interés compuesto por año.
t es el tiempo en años.

Estructura del Programa:
Crear métodos separados para calcular el interés simple y el interés compuesto.
Puede utilizar la función creada en el ejercicio 7 para calcular los cuadrados en las formulas.

Interacción con el Usuario:
Pedir al usuario que ingrese el capital inicial, la tasa de interés, el tiempo y, en el caso del interés compuesto, el número de veces que se aplica el interés por año.

Mostrar Resultados:
Después de calcular los intereses, mostrar los resultados al usuario en la consola. */

// VARIABLES PARA INTERES SIMPLE//
 public static double capitalInicial, interesanual, años, vecesPorañointeres;

public static void main(String[] args) {
    Scanner entrada = new Scanner ( System.in);
    System.out.println(" interes compuesto y simple ");

    System.out.println(" selecciona que tipo de interes quieres calcular ");
    String seleccioninteres = entrada.next();

    switch (seleccioninteres) {
        case "1":
         
        System.out.println(" digite los siguientes datos");

         System.out.println(" capitalinicial");
         capitalInicial = entrada.nextDouble();

         System.out.println(" tasa de interes anual ");
         interesanual = entrada.nextDouble();

         System.out.println(" tiempo en años");
         años = entrada.nextDouble();

        System.out.println(interesSimple(capitalInicial, interesanual, años));
        break;
    


        case "2":
        System.out.println(" digite los siguientes datos");

        System.out.println(" capitalinicial");
        capitalInicial = entrada.nextDouble();

        System.out.println(" tasa de interes anual ");
        interesanual = entrada.nextDouble();

        System.out.println(" tiempo en años");
        años = entrada.nextDouble();
        
        System.out.println(" veces que se aplica el interes compuesto por año ");
        vecesPorañointeres = entrada.nextDouble();
        System.out.println(" su interes compuesto es de " +interesCompuesto(capitalInicial, interesanual, años));
        break;
        default: 
        System.out.println(" datos no validos");
        entrada.close();
            break;
    }

}


// interes simple 

public static  double interesSimple( double capitalInicial, double interesanual, double años) {

    double interessiemple;

    interessiemple = capitalInicial * interesanual * años;

    return interessiemple;

}
//interes compuesto //

public static double interesCompuesto ( double capitalInicial, double interesanual, double años ) {

double interescompuesto;

double resultado1 = capitalInicial *(1.0 + (interesanual/vecesPorañointeres));

 double resultado2 = vecesPorañointeres * años;

 interescompuesto = Math.pow ( resultado1, resultado2);
return interescompuesto;
}

}

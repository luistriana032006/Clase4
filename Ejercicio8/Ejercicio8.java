package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    /**
     * 
     * Necesitamos calcular el área de un círculo,
     * un cuadrado y un triángulo utilizando las fórmulas matemáticas
     * correspondientes.
     * Fórmulas de Cálculo:
     * 
     * Área de un Círculo: La fórmula es A = pi * r ^ 2, donde r es el radio del
     * círculo.
     * Área de un Cuadrado: La fórmula es A = l ^ 2, donde l es la longitud del lado
     * del cuadrado.
     * Área de un Triángulo: La fórmula es A = (b * h) / 2, donde b es la base y h
     * es la altura del triángulo.
     * Estructura del Programa:
     * Crear métodos separados para calcular el área de cada figura geométrica.
     * Puede utilizar la función creada en el ejercicio 7 para calcular los
     * cuadrados en las formulas.
     * 
     * Interacción con el Usuario:
     * Pedir al usuario que ingrese los valores necesarios (radio, lado, base y
     * altura) para calcular el área de cada figura.
     * 
     * Mostrar Resultados:
     * Después de calcular el área, mostrar el resultado al usuario en la consola.
     * 
     * @param args
     */

    /**
     * variables a utilizar en todo el codigo
     */

    public static double resultadocirculo, resultadocuadrado, resultadoTriangulo;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Digite que tipo de Area quieres hallar ");
        System.out.println(" Digite 1 para el area de un circulo");
        System.out.println(" Digite 2 para el area de un cuadrado");
        System.out.println(" Digite 3 para el  area de un triangulo");

        String opcionSelecccionada;
        opcionSelecccionada = entrada.next();

        // opciones a elegir 
        switch (opcionSelecccionada) {
            case "1":
                System.out.println(" digite el valor del radio");
                double radio = entrada.nextDouble();
                System.out.println(
                        " el area del circulo con radio " + radio + " es " + areaCirculo(resultadocirculo, radio));
            break;

            case "2":
                System.out.println(" digite el valor de la longitud del cuadrado");

                double longitud = entrada.nextDouble();

                System.out.println(" el area del cuadrado con longitud   " + longitud + " es "
                        + areaCuadrado(resultadocuadrado, longitud));
            break;

            case "3":
                System.out.println(" digite el valor de la base ");
                double base = entrada.nextDouble();
                System.out.println(" digite el valor de la altura");
                double altura = entrada.nextDouble();

                System.out.println(" el valor del area del triangulo  con base " + base + " y con altura " + altura
                        + " es de " + areaTriangulo(resultadoTriangulo, base, altura));
            break;
            default:
            System.out.println(" datos no validos ");
            entrada.close();
             break;
        }

    }

    // AREA DEL CIRCULO
    public static double areaCirculo(double resultadocirculo, double radio) {

        double exponente = 2;
        resultadocirculo = Math.PI * (Math.pow(radio, exponente));

        return resultadocirculo;
    }

    // AREA DEL CUADRADO

    public static double areaCuadrado(double resultadocuadrado, double longitud) {

        double exponente = 2;
        resultadocuadrado = Math.pow(longitud, exponente);

        return resultadocuadrado;
    }

    // AREA TRIANGULO

    public static double areaTriangulo(double resultadoTriangulo, double base, double altura) {

        resultadoTriangulo = (base * altura) / 2.0;

        return resultadoTriangulo;

    }

}

package com.mycompany.ejerciciop23cap4;

import java.util.Scanner;

class EcuacionCuadratica {
    private double a;
    private double b;
    private double c;

    // Constructor
    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método para calcular el discriminante
    private double calcularDiscriminante() {
        return b * b - 4 * a * c;
    }

    // Método para calcular las soluciones de la ecuación cuadrática
    public void calcularSoluciones() {
        double discriminante = calcularDiscriminante();

        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La solución es única: x = " + x);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
}

public class EjercicioP23Cap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de A:");
        double a = scanner.nextDouble();

        System.out.println("Ingrese el valor de B:");
        double b = scanner.nextDouble();

        System.out.println("Ingrese el valor de C:");
        double c = scanner.nextDouble();

        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);
        ecuacion.calcularSoluciones();
    }
}


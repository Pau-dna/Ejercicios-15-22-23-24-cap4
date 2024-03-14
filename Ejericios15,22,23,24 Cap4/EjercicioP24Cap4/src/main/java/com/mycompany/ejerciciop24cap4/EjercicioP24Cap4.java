
package com.mycompany.ejerciciop24cap4;

import java.util.Scanner;

class Esfera {
   private final String nombre;
   private final double peso;

    // Constructor
    public Esfera(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    // Método para obtener el peso de la esfera
    public double getPeso() {
        return peso;
    }

    // Método para obtener el nombre de la esfera
    public String getNombre() {
        return nombre;
    }  
}


public class EjercicioP24Cap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos de las esferas
        System.out.println("Ingrese el peso de la esfera A:");
        double pesoA = scanner.nextDouble();
        System.out.println("Ingrese el peso de la esfera B:");
        double pesoB = scanner.nextDouble();
        System.out.println("Ingrese el peso de la esfera C:");
        double pesoC = scanner.nextDouble();

        // Creación de objetos Esfera
        Esfera esferaA = new Esfera("A", pesoA);
        Esfera esferaB = new Esfera("B", pesoB);
        Esfera esferaC = new Esfera("C", pesoC);

        // Determinación de la esfera de mayor peso
        Esfera esferaMayorPeso = determinarEsferaMayorPeso(esferaA, esferaB, esferaC);

        // Impresión del resultado
        System.out.println("La esfera de mayor peso es: " + esferaMayorPeso.getNombre() + " con un peso de " + esferaMayorPeso.getPeso());
    }

    // Método para determinar la esfera de mayor peso
    public static Esfera determinarEsferaMayorPeso(Esfera esferaA, Esfera esferaB, Esfera esferaC) {
        if (esferaA.getPeso() > esferaB.getPeso() && esferaA.getPeso() > esferaC.getPeso()) {
            return esferaA;
        } else if (esferaB.getPeso() > esferaC.getPeso()) {
            return esferaB;
        } else {
            return esferaC;
        }
    }
}

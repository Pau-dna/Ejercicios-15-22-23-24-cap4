package com.mycompany.ejerciciop22cap4;

import java.util.Scanner;

class Esfera {
    private String nombre;
    private double peso;

    public Esfera(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }
}

public class EjercicioP22Cap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso de la esfera A:");
        double pesoA = scanner.nextDouble();

        System.out.println("Ingrese el peso de la esfera B:");
        double pesoB = scanner.nextDouble();

        System.out.println("Ingrese el peso de la esfera C:");
        double pesoC = scanner.nextDouble();

        Esfera esferaA = new Esfera("A", pesoA);
        Esfera esferaB = new Esfera("B", pesoB);
        Esfera esferaC = new Esfera("C", pesoC);

        // Comprobar cuál es la esfera de mayor peso
        if (esferaA.getPeso() > esferaB.getPeso() && esferaA.getPeso() > esferaC.getPeso()) {
            System.out.println("La esfera de mayor peso es: " + esferaA.getNombre());
        } else if (esferaB.getPeso() > esferaA.getPeso() && esferaB.getPeso() > esferaC.getPeso()) {
            System.out.println("La esfera de mayor peso es: " + esferaB.getNombre());
        } else if (esferaC.getPeso() > esferaA.getPeso() && esferaC.getPeso() > esferaB.getPeso()) {
            System.out.println("La esfera de mayor peso es: " + esferaC.getNombre());
        } else if (esferaA.getPeso() == esferaB.getPeso() && esferaA.getPeso() > esferaC.getPeso()) {
            System.out.println("Las esferas de mayor peso son: " + esferaA.getNombre() + " y " + esferaB.getNombre());
        } else if (esferaA.getPeso() == esferaC.getPeso() && esferaA.getPeso() > esferaB.getPeso()) {
            System.out.println("Las esferas de mayor peso son: " + esferaA.getNombre() + " y " + esferaC.getNombre());
        } else if (esferaB.getPeso() == esferaC.getPeso() && esferaB.getPeso() > esferaA.getPeso()) {
            System.out.println("Las esferas de mayor peso son: " + esferaB.getNombre() + " y " + esferaC.getNombre());
        } else {
            System.out.println("Las tres esferas tienen el mismo peso.");
        }

        scanner.close();
    }
}

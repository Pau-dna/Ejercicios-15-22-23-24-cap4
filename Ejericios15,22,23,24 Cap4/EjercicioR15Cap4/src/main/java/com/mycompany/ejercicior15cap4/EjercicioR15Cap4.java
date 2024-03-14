package com.mycompany.ejercicior15cap4;

import java.util.Scanner;

public class EjercicioR15Cap4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definición de variables
        double pesoA, pesoB, pesoC, pesoD;

        // Lectura de las variables
        System.out.print("Ingrese el peso de la esfera A: ");
        pesoA = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera B: ");
        pesoB = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera C: ");
        pesoC = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera D: ");
        pesoD = scanner.nextDouble();

        // Algoritmo
        if (pesoA == pesoB && pesoA == pesoC) {
            System.out.println("LA ESFERA D ES LA DIFERENTE");
            if (pesoD > pesoA) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        } else if (pesoA == pesoB && pesoA == pesoD) {
            System.out.println("LA ESFERA C ES LA DIFERENTE");
            if (pesoC > pesoA) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        } else if (pesoA == pesoC && pesoA == pesoD) {
            System.out.println("LA ESFERA B ES LA DIFERENTE");
            if (pesoB > pesoA) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        } else {
            System.out.println("LA ESFERA A ES LA DIFERENTE");
            if (pesoA > pesoB) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        }
    }
}

package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese sus ingresos mensuales: $");
        double ingresos = scanner.nextDouble();
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        System.out.print("Ingrese sus gastos mensuales: $");
        double gastos = scanner.nextDouble();
        
        scanner.close();
        
        boolean cumpleIngresos = ingresos >= 2000000;
        boolean cumpleEdad = edad >= 18 && edad <= 65;
        boolean cumpleGastos = gastos <= (ingresos * 0.70);
        
        System.out.println("\n--- ANÁLISIS ---");
        System.out.println("Ingresos suficientes: " + cumpleIngresos);
        System.out.println("Edad válida: " + cumpleEdad);
        System.out.println("Gastos controlados: " + cumpleGastos);
        
        if (cumpleIngresos && cumpleEdad && cumpleGastos) {
            double creditoMaximo = ingresos * 5;
            System.out.println("\n¡CRÉDITO APROBADO!");
            System.out.println("Monto máximo: $" + creditoMaximo);
        } else {
            System.out.println("\nCrédito RECHAZADO");
            System.out.println("No cumple todos los requisitos.");
        }
    }
}
package com.example;

import java.util.Scanner;

    public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String clasificacion = "Normal";
        System.out.println("Sistema de Triaje Hospitalario");

        for (int i = 1; i <= 5; i++) {
            System.out.println("paciente" + i);
        }
        double temperatura;
        double presionArterial;
        int escalaDolor;

        System.out.print("Ingrese temperatura °C: ");
        temperatura = scanner.nextDouble();

        System.out.print("Ingrese presión arterial:");
        presionArterial = scanner.nextDouble();

        System.out.print("Ingrese dolor (escala 1-10): ");
        escalaDolor = scanner.nextInt();

        if (temperatura > 38.5 || presionArterial > 140.0 || escalaDolor >= 8) {
            clasificacion = "URGENTE";
        } else if (temperatura > 37.5 || presionArterial > 120.0 || escalaDolor >= 5) {
            clasificacion = "PRIORITARIO";
        }
        System.out.println("==> CLASIFICACIÓN FINAL: " + clasificacion);
        scanner.close();
    }
}
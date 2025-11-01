package com.example;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int tiempoBus = 20;
        int tiempoCaminar = 10;
        int tiempoMetro = 15;

        boolean hayTraficoPesado;
        boolean estaLloviendo;

        int tiempoTotal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿esta lloviendo? (si/no)");
        String respuestaLluvia = scanner.next();

        estaLloviendo = respuestaLluvia.equals("si");

        System.out.println("¿hay trafico pesado? (si/no)");
        String respuestaTrafico = scanner.next();

hayTraficoPesado = respuestaTrafico.equals("si");

        if (hayTraficoPesado) {
            tiempoBus = tiempoBus + (int) (tiempoBus * 0.50);
        }
        if (estaLloviendo) {
            tiempoCaminar = tiempoCaminar * 2;
        }
        tiempoTotal = tiempoBus + tiempoMetro + tiempoCaminar;
        System.out.println("Tiempo del Bus (modificado): " + tiempoBus + " minutos");
        System.out.println("Tiempo del Metro: " + tiempoMetro + " minutos");
        System.out.println("Tiempo de Caminar (modificado): " + tiempoCaminar + " minutos");
        System.out.println("total del viaje: " + tiempoTotal + " minutos.");
        scanner.close();
    }
}

package com.example;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 5. Transporte/Aviación");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la hora de su vuelo: (Formato 24h y en número decimal. Ej. 8:30pm digitar 20,5)");
        Double horaVuelo = scanner.nextDouble();
        System.out.println("Seleccione estado del vuelo: ");
        System.out.println("1. Vuelo a tiempo");
        System.out.println("2. Vuelo retrasado");
        System.out.println("3. Vuelo cancelado");
        int estadoVuelo = scanner.nextInt();
        System.out.println("Hay buen clima? (true/false): ");
        Boolean estadoClima = scanner.nextBoolean();
        if(estadoVuelo == 1 && estadoClima == true){
            System.out.println("Su vuelo está programado para la hora indicada: "+horaVuelo+" hrs.");
        }else if(estadoVuelo == 1 && estadoClima == false){
            System.out.println("Su vuelo se atrasará 30 minutos: Nueva hora de vuelo: "+(horaVuelo+0.5)+" hrs.");
        }else if (estadoVuelo == 2 && estadoClima == true) {
            System.out.println("Su vuelo ha sido retrasado 2 horas. Nueva hora de vuelo: "+(horaVuelo+2)+" hrs.");
        } else if (estadoVuelo == 2 && estadoClima == false) {
            System.out.println("Su vuelo ha sido retrasado 2 horas y media. También debido a las condiciones climáticas. Nueva hora de vuelo: "+(horaVuelo+2.5)+" hrs.");
        } else if (estadoVuelo == 3) {
            System.out.println("Su vuelo ha sido cancelado.");
        } else {
            System.out.println("Información inválida. Por favor, verifique los datos ingresados.");
        }
        scanner.close();

    }
    }

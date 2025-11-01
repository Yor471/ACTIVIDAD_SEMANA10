package com.example;

public class Ejercicio6 {
    public void entregas() {
        int horasTrabajo = 8;
        int tiempoTrabajoHora = horasTrabajo * 60;

        int zonaCentro = 30;
        int zonaPeriferica = 45;
        int zonaRural = 60;

        int entregasCentro = 4;
        int entregasPerfierica = 2;
        int entregasRural = 3;

        int totalTiempoCentro = zonaCentro * entregasCentro;
        int totalTiempoPeriferica = zonaPeriferica * entregasPerfierica;
        int totalTiempoRural = zonaRural * entregasRural;
        int tiempoTotalZonas = totalTiempoCentro + totalTiempoPeriferica + totalTiempoRural;

        String conductor = "JUAN CARLOS OSORIO";

        System.out.println("-----OPTIMIZADOR DE RUTAS-----");
        System.out.println("Entregas programadas:");
        System.out.println("");
        System.out.println("El conductor elegido para esta tarea es " + conductor + ".");
        System.out.println("");
        System.out.println("- Zona centro: " + entregasCentro + " Tardan " + zonaCentro + " Minutos" + " total tiempo "
                + totalTiempoCentro + " Minutos.");
        System.out.println("- Zona periferica: " + entregasPerfierica + " Tardan " + zonaPeriferica + " Minutos"
                + " Total tiempo " + totalTiempoPeriferica + " Minutos.");
        System.out.println("- Zona Rural" + entregasRural + " Tardan " + zonaRural + " Minutos" + " Total tiempo "
                + totalTiempoRural + " Minutos.");
        System.out.println("Total tiempo requerido para el trabajo " + tiempoTotalZonas + " Minutos.");
        System.out.println("");
        System.out.println("El conductor debe cumplir con sus " + tiempoTrabajoHora + " Minutos disponibles.");

        if (tiempoTotalZonas <= tiempoTrabajoHora) {
            int tiempoSobrante = tiempoTrabajoHora - tiempoTotalZonas;
            System.out.println("LAS ENTREGAS SE PUEDEN HACER EL DIA DE HOY");
            System.out.println("Tiempo sobrante: " + tiempoSobrante + " Minutos.");

            int entrasFaltantes = tiempoSobrante / zonaCentro;
            int entrasFaltantes2 = tiempoSobrante / zonaPeriferica;
            int entrasFaltantes3 = tiempoSobrante / zonaRural;
            System.out.println("Entregas faltantes Zona centro " + entrasFaltantes);
            System.out.println("Entregas faltantes Zona periferica " + entrasFaltantes2);
            System.out.println("Entregas faltantes Zona rural " + entrasFaltantes3);
        } else {
            int tiempoFaltante = tiempoTotalZonas - tiempoTrabajoHora;
            System.out.println("NO ES POSIBLE HACER LA ENTREGAS");
            System.out.println("Hay un tiempo faltante de " + tiempoFaltante + " Minutos");
            System.out.println("SE DEBE REPROGRAMAR");
        }

    }

}

package com.example;

public class Ejercicio9 {
    public void notas() {
        String[] nombres = {"Alejandra Moreno", "Santiago Vargas", "Camila Herrera"};
        double[] notasParciales = {2.9, 5, 3.4};
        double[] notasProyecto = {4, 4.2, 2.5};
        double[] notasParticipacion = {5, 4.2, 3.8};

        double porcentajeParciales = 0.30;
        double porcentajeProyecto = 0.40;
        double porcentajeParticipacion = 0.30;

        System.out.println("=== CALCULADORA DE NOTAS Y PROMEDIO ESTUDIANTIL ===");
        System.out.println("Universidad de Manizales");
        System.out.println("Distribución: Parciales 30%, Proyecto 40%, Participación 30%");
        System.out.println();

        for (int i = 0; i < nombres.length; i++) {

            double promedioFinal = (notasParciales[i] * porcentajeParciales) + (notasProyecto[i] * porcentajeProyecto) + (notasParticipacion[i] * porcentajeParticipacion);

            String resultado = "";
            if (promedioFinal >= 4.0) {
                resultado = "APROBADO";
            } else if (promedioFinal >= 3.5) {
                resultado = "SUPLETORIO";
            } else {
                resultado = "REPROBADO";
            }

            System.out.println("Estudiante: " + nombres[i]);
            System.out.println("  Nota Parciales: " + notasParciales[i] + " (30%)");
            System.out.println("  Nota Proyecto: " + notasProyecto[i] + " (40%)");
            System.out.println("  Nota Participación: " + notasParticipacion[i] + " (30%)");
            System.out.println("  Promedio final: " + String.format("%.2f", promedioFinal));
            System.out.println("  Resultado de calificacion: " + resultado);
            System.out.println();
        }
    }
}

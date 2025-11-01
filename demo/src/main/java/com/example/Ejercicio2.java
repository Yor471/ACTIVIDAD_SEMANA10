package com.example;

public class Ejercicio2 {
    public static void main(String[] args) {

        int mango = 6;
        int uva = 360;
        int pera = 4982;

        System.out.println("SISTEMA DE INVENTARIO MERCADOS YOR ");
        System.out.println("INVENTARIO INICIAL");
        System.out.println("mango: " + mango);
        System.out.println("uva: " + uva);
        System.out.println("pera: " + pera);

        for (int dia = 1; dia <= 7; dia++) {
            System.out.println("\n===== DÍA " + dia + " =====");

            int ventasMango = 35;
            int ventasUva = 452;
            int ventasPera = 3;

            System.out.println("\n-----MANGO-----");
            mango = mango - ventasMango;
            System.out.println("vendidas hoy: " + ventasMango);
            System.out.println("stock actual: " + mango);

            if (mango < 10) {
                System.out.println("stock bajo realizar pedido ");
                mango = mango + 50;
                System.out.println("+ 50 unidades, nuevo stock: " + mango);

            }
            System.out.println("\n-----UVA-----");
            uva = uva - ventasUva;
            System.out.println("vendidas hoy: " + ventasUva);
            System.out.println("stock actual: " + uva);

            if (uva < 10) {
                System.out.println("stock bajo realizar pedido ");
                uva = uva + 50;
                System.out.println("+ 50 unidades, nuevo stock: " + uva);

            }
            System.out.println("\n-----PERA-----");
            pera = pera - ventasPera;
            System.out.println("vendidas hoy: " + ventasPera);
            System.out.println("stock actual: " + pera);

            if (pera < 10) {
                System.out.println("stock bajo realizar pedido ");
                pera = pera + 50;
                System.out.println("+ 50 unidades, nuevo stock: " + pera);
            }

        }
    }
}

package com.example;

public class Ejercicio3 {

    public void frutas() {

        int mango = 15;
        int uva = 10;
        int pera = 9;

        System.out.println("SISTEMA DE INVENTARIO MERCADOS YOR ");
        System.out.println("INVENTARIO INICIAL");
        System.out.println("mango: " + mango);
        System.out.println("uva: " + uva);
        System.out.println("pera: " + pera);

        for (int dia = 1; dia <= 7; dia++) {
            System.out.println("\n===== DÍA " + dia + " =====");

            int ventasMango = 20;
            int ventasUva = 15;
            int ventasPera = 10;

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
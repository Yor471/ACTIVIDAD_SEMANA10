package com.example;

import java.util.Scanner;
public class Ejercicio1 {
     public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de productos");
        int cantidad = sc.nextInt();
        
        System.out.println("ingrese el precio unitario");
        double precioUnitario = sc.nextDouble();


     double total = cantidad * precioUnitario;
     double descuento = 0;

     if (cantidad > 20){
       descuento = 0.20;
     } else if (cantidad > 10){
        descuento = 0.15;
     } else if (cantidad > 5){
        descuento = 0.10;
     }
     
     double totalConDescuento = total -(total*descuento);


    if (total > 100000){
        totalConDescuento = totalConDescuento -(totalConDescuento*0.05);
    }

    System.out.println("total sin Descuento "+ total);
    System.out.println("descuento aplicado" + descuento *100);
    System.out.println("precio final a pagar " + totalConDescuento);
        
     
}
}


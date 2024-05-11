/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author Paula Lopez
 */
public class Ejecutor2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resultado = "";

        boolean continuar = true;
        while (continuar) {
            System.out.print("Desea ingresar un automóvil? (si/no): ");
            String opcion = scanner.next();
            if (opcion.equalsIgnoreCase("si")) {
                System.out.print("Cédula del dueño: ");
                String cedula = scanner.next();
                System.out.print("Marca del vehículo: ");
                String marca = scanner.next();
                System.out.print("Año de fabricación: ");
                int año = scanner.nextInt();
                System.out.print("Valor del vehículo: ");
                double valor = scanner.nextDouble();

                Automovil automovil = new Automovil(cedula, marca, año, valor);
                automovil.establecerValorMatricula();
                resultado += automovil.toString() + "\no";
            } else if (opcion.equalsIgnoreCase("no")) {
                continuar = false;
            } else {
                System.out.println("Opción no válida. Por favor, ingrese 'si' para continuar o 'no' para salir.");
            }
        }

        System.out.println("Resultados de los automóviles ingresados:\n" + resultado);
     }
}

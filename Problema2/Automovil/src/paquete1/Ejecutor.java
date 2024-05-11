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
public class Ejecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de automóviles a ingresar: ");
        int numAutomoviles = scanner.nextInt();

        String resultado = "";
        for (int i = 0; i < numAutomoviles; i++) {
            System.out.println("Ingresando automóvil #" + (i + 1));
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
            resultado += automovil.toString() + "\n";
        }

        System.out.println("Resultados de los automóviles ingresados:\n" + resultado);
    }
}

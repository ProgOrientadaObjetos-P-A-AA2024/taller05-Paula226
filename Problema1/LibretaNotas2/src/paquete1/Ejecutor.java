/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menú:");
            System.out.println("1. Crear Libreta de Notas con promedio de calificaciones");
            System.out.println("2. Crear Libreta de Notas con todas las calificaciones");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = entrada.nextInt();

            if (opcion == 1) {
                entrada.nextLine(); // Limpiar el buffer
                System.out.println("Ingrese el nombre del estudiante:");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese la calificación 1:");
                double calificacion1 = entrada.nextDouble();
                System.out.println("Ingrese la calificación 2:");
                double calificacion2 = entrada.nextDouble();
                LibretaNotas2 libreta1 = new LibretaNotas2(nombre, calificacion1, calificacion2);
                libreta1.establecerPromedio();
                System.out.println("Libreta de Notas creada con éxito:\n" + libreta1.toString());
            } else if (opcion == 2) {
                entrada.nextLine(); // Limpiar el buffer
                System.out.println("Ingrese el nombre del estudiante:");
                String nombre2 = entrada.nextLine();
                System.out.println("Ingrese la calificación 1:");
                double calificacion1_2 = entrada.nextDouble();
                System.out.println("Ingrese la calificación 2:");
                double calificacion2_2 = entrada.nextDouble();
                System.out.println("Ingrese la calificación 3:");
                double calificacion3_2 = entrada.nextDouble();
                LibretaNotas2 libreta2 = new LibretaNotas2(nombre2, calificacion1_2, calificacion2_2, calificacion3_2);
                libreta2.establecerPromedio();
                System.out.println("Libreta de Notas creada con éxito:\n" + libreta2.toString());
            } else if (opcion == 3) {
                continuar = false;
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
     
       }
    }
}    
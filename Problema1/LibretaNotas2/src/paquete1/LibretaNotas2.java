/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

/**
 *
 * @author Paula Lopez
 */
public class LibretaNotas2 {
    private String nombreEstudiante;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    
    public LibretaNotas2(String n, double c1, double c2) {
    nombreEstudiante = n;  
    calificacion1 = c1;
     calificacion2 = c2;
}
    public LibretaNotas2(String n, double c1, double c2, double c3) {
    nombreEstudiante = n;  
    calificacion1 = c1;
     calificacion2 = c2;
     calificacion3 = c3;
}
    
    public void establacerNombreEstudiante(String x) {
      nombreEstudiante = x;
        
    }
   public void establacerCalificacion1(double x) {
      calificacion1 = x; 
   }  
    public void establacerCalificacion2(double x) {
      calificacion2 = x; 
    }  
    public void establacerCalificacion3(double x) {
      calificacion3 = x; 
       }
    public void establecerPromedio() {
      promedio = (calificacion1 + calificacion2 + calificacion3) /3; 
       }
      
   public String obtenerNombreEstudiante() {
      return nombreEstudiante ;
   }
   public double obtenerCalificacion1() {
      return calificacion1;
   }
   public double obtenerCalificacion2() {
      return calificacion2;
   }    
   public double obtenerCalificacion3() {
      return calificacion3;
   }
      
    public double obtenerPromedio(){
      return promedio;
       }
    
    @Override
   public String toString (){
       String cadena = String.format("Libreta de Calificaciones\n"
               + "Nombre del Estudiantes:%s\n"
               + "Calificacion 1: %.3f\n"
                +"Calificacion 2: %.3f\n"
                +"Calificacion 3: %.3f\n"
                +"Promedio: %.2f", 
               nombreEstudiante,
               calificacion1,
               calificacion2,
               calificacion3,
               obtenerPromedio());
        return cadena;
   }  

    }


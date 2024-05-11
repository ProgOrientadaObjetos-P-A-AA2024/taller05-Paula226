/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

/**
 *
 * @author Paula Lopez
 */
public class Automovil {

    private String cedula;
    private String marca;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;
    
    public Automovil(String ce, String mar, int anio, double val) {
        cedula = ce;
        marca = mar;
        anioFabricacion = anio;
        valorVehiculo = val;
      
    }
    public void establecerCedula(String c) {
        cedula = c;
    }
    public void establecerMarca(String c) {
        marca = c;
    }
    public void establecerAnioFabricacion(int c) {
        anioFabricacion = c;
    }
    public void establecerValorVehiculo(double c) {
         valorVehiculo = c;
    }
    public void establecerValorMatricula() {
        int antiguedad = 2024 - anioFabricacion;
        valorMatricula = 0.002 * valorVehiculo * antiguedad;      
    }
    public String obtenerCedula() {
        return cedula;
    }
    public String obtenerMarca() {
        return marca;
    }
    public int  obtenerAnioFabricacion() {
        return anioFabricacion;
    }
     public double obtenerValorVehiculo() {
        return valorVehiculo;
    }
     public double obtenerValorMatricula() {
         return valorMatricula;
     }

    @Override
    public String toString() {
    String cadena = String.format("Precio de Matriculas:\n" +
            "Cedula del dueño: %s\n" +
            "Marca: %s\n" +
            "Año de Fabricacion: %s\n" +
            "Valor de Vehiculo: %.2f\n" +
            "Valor de la Matricula: %.2f\n",
             cedula, marca, anioFabricacion, valorVehiculo, valorMatricula);
    return cadena;

    }
}




package paquete01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author utpl
 */
public class Propietario {
    private String nombre;
    private String cedula;

    public Propietario(String n, String c) {
        nombre = n;
        cedula = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }
    
    public String toString() {
        return String.format("Nombre: %s\n"
                + "Cedula: %s\n", nombre, cedula);
    }
}

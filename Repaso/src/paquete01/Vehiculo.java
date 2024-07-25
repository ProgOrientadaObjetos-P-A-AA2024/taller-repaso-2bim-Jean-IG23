/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import paquete01.Propietario;

/**
 *
 * @author utpl
 */
public abstract class Vehiculo {
    protected Propietario user;
    protected String marca;
    protected double precioBase;
    protected double precioFinal;

    public Vehiculo(Propietario u, String m, double pB) {
        user = u;
        marca = m;
        precioBase = pB;
    }

    public Propietario obtenerUser() {
        return user;
    }

    public void establecerUser(Propietario u) {
        user = u;
    }

    public String obtenerMarca() {
        return marca;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public void establecerPrecioBase(double pB) {
        precioBase = pB;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }

    public abstract void calcularPrecioFinal();
    
    public String toString() {
        return String.format("Nombre: %s\n"
                + "Cedula: %s\n"
                + "Precio Base: %.2f\n"
                + "Precio Final: %.2f\n", user.obtenerNombre(),
                user.obtenerCedula(), precioBase, precioFinal);
    }
}

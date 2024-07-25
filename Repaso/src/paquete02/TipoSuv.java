/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete01.Vehiculo;
import paquete01.Propietario;

/**
 *
 * @author utpl
 */
public class TipoSuv extends Vehiculo {

    private double porcentajeAdi;
    private double seguroPer;

    public TipoSuv(int pA, Propietario u, String m, double pB) {
        super(u, m, pB);
        porcentajeAdi = pA;
    }

    public double obtenerPorcentajeAdi() {
        return porcentajeAdi;
    }

    public void establecerPorcentajeAdi(int pA) {
        porcentajeAdi = pA;
    }

    public double obtenerSeguroPer() {
        return seguroPer;
    }

    public void establecerSeguroPer() {
        seguroPer = precioBase * (porcentajeAdi / 100);
    }

    public void calcularPrecioFinal() {
        precioFinal = precioBase + seguroPer;
    }

    @Override
    public String toString() {
        return String.format("Vehiculo Tipo Suv \n "
                + "porcentaje Adicional: %.2f\n"
                + "Seguro de las Personas: %.2f\n"
                + "Precio Final: %.2f\n"
                + super.toString(),
                porcentajeAdi,
                seguroPer,
                precioFinal);
    }
}

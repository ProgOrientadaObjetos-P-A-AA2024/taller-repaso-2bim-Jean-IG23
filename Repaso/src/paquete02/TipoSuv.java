/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete01.Propietario;

/**
 *
 * @author utpl
 */
public class TipoSuv extends Vehiculo{
    
    private int porcentajeAdi;
    private double seguroPer;

    public TipoSuv(int pA, double sP, Propietario u, String m, double pB) {
        super(u, m, pB);
        porcentajeAdi = pA;
        seguroPer = sP;
    }

    public int obtenerPorcentajeAdi() {
        return porcentajeAdi;
    }

    public void establecerPorcentajeAdi(int pA) {
        porcentajeAdi = pA;
    }

    public double obtenerSeguroPer() {
        return seguroPer;
    }

    public void establecerSeguroPer(double sP) {
        seguroPer = sP;
    }
    
    
    
    public void calcularPrecioFinal() {
        
    }
}


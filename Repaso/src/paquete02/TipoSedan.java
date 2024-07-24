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
public class TipoSedan extends Vehiculo{
    private int porcentajeDes;
    private double valorDes;
    private double seguroMec;

    public TipoSedan(int pD, double vD, double sM, Propietario u, String m, double pB) {
        super(u, m, pB);
        porcentajeDes = pD;
        valorDes = vD;
        seguroMec = sM;
    }

    public int obtenerPorcentajeDes() {
        return porcentajeDes;
    }

    public void establecerPorcentajeDes(int pD) {
        porcentajeDes = pD;
    }

    public double obtenerValorDes() {
        return valorDes;
    }

    public void establecerValorDes(double vD) {
        valorDes = vD;
    }

    public double obtenerSeguroMec() {
        return seguroMec;
    }

    public void establecerSeguroMec(double sM) {
        seguroMec = sM;
    }
    
    public void calcularPrecioFinal() {
        
    }
}

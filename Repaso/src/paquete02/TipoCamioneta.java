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
public class TipoCamioneta extends Vehiculo {

    private double porcentajeImpo;
    private double valorImpo;
    private double seguroMan;

    public TipoCamioneta(double pI, double vI, double sM, Propietario u, String m, double pB) {
        super(u, m, pB);
        porcentajeImpo = pI;
        valorImpo = vI;
        seguroMan = sM;
    }
    
    public double obtenerPorcentajeImpo() {
        return porcentajeImpo;
    }

    public void establecerPorcentajeImpo(double pI) {
        porcentajeImpo = pI;
    }

    public double obtenerValorImpo() {
        return valorImpo;
    }

    public void establecerValorImpo(double vI) {
        valorImpo = vI;
    }

    public double obtenerSeguroMan() {
        return seguroMan;
    }

    public void establecerSeguroMan(double sM) {
        seguroMan = sM;
    }
    
    public void calcularPrecioFinal() {

    }
}

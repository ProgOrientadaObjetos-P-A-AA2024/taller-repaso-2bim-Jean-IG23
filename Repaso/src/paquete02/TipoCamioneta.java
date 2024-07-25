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
public class TipoCamioneta extends Vehiculo {

    private double porcentajeImpo;
    private double valorImpo;
    private double seguroMan;

    public TipoCamioneta(double pI, Propietario u, String m, double pB) {
        super(u, m, pB);
        porcentajeImpo = pI;
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

    public void establecerValorImpo() {
        valorImpo = precioBase * (porcentajeImpo / 100);
    }

    public double obtenerSeguroMan() {
        return seguroMan;
    }

    public void establecerSeguroMan() {
        seguroMan = valorImpo * 1.5;
    }

    public void calcularPrecioFinal() {
        precioFinal = precioBase + valorImpo
                + seguroMan;
    }

    @Override
    public String toString() {
        return String.format("Vehiculo Tipo Camioneta \n "
                + "Porcentaje Adicional de Importacion: %.2f\n"
                + "Valor Adicional de Importacion: %.2f\n"
                + "Seguro Adicional de Mantenimiento: %.2f\n"
                + "Precio Final: %.2f\n"
                + super.toString(), porcentajeImpo,
                valorImpo, seguroMan, precioFinal);

    }
}

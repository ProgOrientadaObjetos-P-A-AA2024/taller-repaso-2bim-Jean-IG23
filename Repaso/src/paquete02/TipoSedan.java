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
public class TipoSedan extends Vehiculo {

    private double porcentajeDes;
    private double valorDes;
    private double seguroMec;

    public TipoSedan(double pD, Propietario u, String m, double pB) {
        super(u, m, pB);
        porcentajeDes = pD;
    }

    public double obtenerPorcentajeDes() {
        return porcentajeDes;
    }

    public void establecerPorcentajeDes(int pD) {
        porcentajeDes = pD;
    }

    public double obtenerValorDes() {
        return valorDes;
    }

    public void establecerValorDes() {
        valorDes = precioBase * (porcentajeDes / 100);
    }

    public double obtenerSeguroMec() {
        return seguroMec;
    }

    public void establecerSeguroMec() {
        seguroMec = precioBase * 0.01;
    }

    public void calcularPrecioFinal() {
        precioFinal = precioBase - valorDes + seguroMec;
    }

    @Override
    public String toString() {
        return String.format("Vehiculo Tipo Sedan \n "
                + "Porcentaje Descuento: %.2f\n"
                + "Valor Adicional de Importacion: %.2f\n"
                + "Valor de Descuento: %.2f\n"
                + "Precio Final: %.2f\n"
                + super.toString(),
                porcentajeDes,
                valorDes,
                seguroMec,
                precioFinal);
    }
}

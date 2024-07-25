/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author utpl
 */
public class Concesionaria  {
    private ArrayList<Vehiculo> lista;
        private String nombre;
        private double ventasTtotal;
        private double vehiculoCaro;
        private double vehiculoBarato;

    public Concesionaria(ArrayList<Vehiculo> l, String n) {
        lista = l;
        nombre = n;
    }

    public ArrayList<Vehiculo> obtenerLista() {
        return lista;
    }

    public void establecerLista(ArrayList<Vehiculo> l) {
        lista = l;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public double obtenerVentasTtotal() {
        return ventasTtotal;
    }

    public void establecerVentasTtotal() {
double sum = 0;
        for (int i = 0; i < lista.size(); i++) {
            sum = sum + lista.get(i).obtenerPrecioFinal();
        }
        ventasTtotal = sum;     }

    public double obtenerVehiculoCaro() {
        return vehiculoCaro;
    }

    public void establecerVehiculoCaro() {
double c = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).obtenerPrecioFinal() > c) {
                c = lista.get(i).obtenerPrecioFinal();
            }
        }    
    }

    public double obtenerVehiculoBarato() {
        return vehiculoBarato;
    }

    public void establecerVehiculoBarato() {
 double bar = 1000000;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).obtenerPrecioFinal() < bar) {
                bar = lista.get(i).obtenerPrecioFinal();
            }
        }    
    }
    
        @Override
    public String toString() {
        String ca = String.format("%s: \n", nombre);
                for (int i = 0; i < lista.size(); i++) {
                    ca = String.format("%S %s\n",ca, 
                            lista.get(i));
        }
        ca = String.format("%s\n"
                + "Costo del vehiculo mas caro: %.2f\n "
                + "Costo del vehiculo menos caro: %.2f\n"
                + "Ventas Totales: %%.2f\n",
                ca,
                vehiculoCaro,
                vehiculoBarato,
                ventasTtotal);
        
        return ca;
    }  
    
}

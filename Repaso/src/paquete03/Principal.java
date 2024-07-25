/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.util.ArrayList;
import paquete01.Concesionaria;
import paquete01.Propietario;
import paquete01.Vehiculo;
import paquete02.TipoCamioneta;
import paquete02.TipoSedan;
import paquete02.TipoSuv;

/**
 *
 * @author utpl
 */
public class Principal {
    public static void main(String[] args) {

                ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
                
        Propietario pro = new Propietario("Jean", "15045");
        TipoSedan sedan1 = new TipoSedan(15, pro, "Hyunday", 154780);
        sedan1.establecerValorDes();
        sedan1.establecerSeguroMec();
        
        Propietario pro1 = new Propietario("Carlos", "155022");
        TipoSedan sedan2 = new TipoSedan(10, pro, "Chevrolet", 923215);
        sedan1.establecerValorDes();
        sedan1.establecerSeguroMec();
        
        Propietario pro3 = new Propietario("Marvin", "015541");
        TipoSuv suv = new TipoSuv(15, pro3, "Ferrari", 50000);
        suv.establecerSeguroPer();
        
        
        Propietario pro4 = new Propietario("Mabel", "1105218");
        TipoCamioneta camioneta = new TipoCamioneta(20, pro4, "Chevrolet",
                35000);
        camioneta.establecerValorImpo();
        camioneta.establecerSeguroMan();
        
        listaVehiculos.add(sedan1);
        listaVehiculos.add(sedan2);
        listaVehiculos.add(suv);
        listaVehiculos.add(camioneta);
        
        for (int i = 0; i < listaVehiculos.size(); i++) {
            listaVehiculos.get(i).calcularPrecioFinal();
        }
        
        Concesionaria con = new Concesionaria(listaVehiculos, "Katar");

        con.establecerVentasTtotal();
        con.establecerVehiculoCaro();
        con.establecerVehiculoBarato();

        System.out.println(con);
        
        
    }
}

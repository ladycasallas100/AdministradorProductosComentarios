/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

import java.time.LocalTime;

/**
 *
 * @author cafajardo
 */
/*Se crea una clase que esta extendiendo de la clase producto*/
public class Bebida extends Producto {
    
    public Bebida(int id, String nombre, double precio){
        super(id, nombre, precio);
    }
    /*Se realiza el descuento del producto*/
    @Override
    public double getDescuento() {
        LocalTime now = LocalTime.now();
        if (now.isAfter(LocalTime.of(17, 0)) && now.isBefore(LocalTime.of(18, 0))) {
            return this.getPrecio() * 0.2d;
        } else {
            return 0;
        }
    }
}

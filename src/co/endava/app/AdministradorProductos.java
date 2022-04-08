/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.app;

import co.endava.datos.Bebida;
import co.endava.datos.Comida;
import co.endava.datos.Producto;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author dsanchez
 */
public class AdministradorProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Definición de variables*/
        Producto p1 = new Producto(101, "Café", 1500);
        Producto p2 = new Producto(102, "Azucar", 2500);
        Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now().plusDays(2));
        Producto p4 = new Bebida(104, "Té", 1800);
        /*Impresion de variables*/
        System.out.println(p1.getPrecio());
        System.out.println(p2.getPrecio());
        System.out.println("Fecha: "+ p3.getFechaVencimiento() +  ", Precio: "+ p3.getPrecio() + ", Dcto: " + p3.getDescuento());
        System.out.println("Precio: "+ p4.getPrecio() + ", Dcto: " + p4.getDescuento());
        /*Validación de que el producto5 tengo un nombre6*/
        Producto p5 = new Producto(105, "Agua", 1800);
        if (p5 == null) {
            System.out.println("El objeto está nulo");
        } else {
            if (p5.getNombre() == null) {
                System.out.println("El nombre está nulo");
            } else {
                System.out.println(p5.getNombre());
            }
        }
        BigDecimal numero = BigDecimal.ZERO;
        try {
            /*Se controla si llega aparecer un error*/
            numero = BigDecimal.valueOf(Long.parseLong("140"));
        } catch (Exception e){
            numero = BigDecimal.ONE;
            System.out.println("No se pudo convertir " + e);
        }
        System.out.println(numero);
    }
    
}

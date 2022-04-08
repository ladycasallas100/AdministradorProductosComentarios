/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

/**
 *
 * @author cafajardo
 */

/*La clase producto es la abstracción de una producto y la representación del producto*/
public class Producto {
    
    private int id;
    private String nombre;
    private double precio;
    
    public Producto() {
    }
    
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            System.out.println("No se permiten precios negativos");
        } else {
            this.precio = precio;
        }
    }
    
    public double getDescuento(){
        return precio * 0.1d;
    }
    
    @Override
    public String toString() {
        return id + ", " + nombre + ", " + precio;
    }
}

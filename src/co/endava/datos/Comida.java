/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

import java.time.LocalDate;

/**
 *
 * @author cafajardo
 */
public class Comida extends Producto {
    private LocalDate fechaVencimiento;

    public Comida(int id, String nombre, double precio, LocalDate fechaVencimiento) {
        super(id, nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    /*Se valida el descuento dependiendo del día*/
    @Override
    public double getDescuento() {
        if (fechaVencimiento.equals(LocalDate.now())) {
            return super.getDescuento();
        } 
        else {
            return 0;
        }
    }
    
    @Override
    public String toString(){
        return super.toString() + ", " + fechaVencimiento;
    }
}

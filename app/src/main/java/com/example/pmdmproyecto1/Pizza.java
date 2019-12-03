package com.example.pmdmproyecto1;

import java.io.Serializable;

public class Pizza implements Serializable {
    private String nombre;
    private int cantidadPorciones;
    private double precio;

    public Pizza(String nombre, int cantidadPorciones, double precio) {
        this.nombre = nombre;
        this.cantidadPorciones = cantidadPorciones;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadPorciones() {
        return cantidadPorciones;
    }

    public void setCantidadPorciones(int cantidadPorciones) {
        this.cantidadPorciones = cantidadPorciones;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nombre='" + nombre + '\'' +
                ", cantidadPorciones=" + cantidadPorciones +
                ", precio=" + precio +
                '}';
    }
}

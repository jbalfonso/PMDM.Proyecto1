package com.example.pmdmproyecto1;

import java.io.Serializable;

public class Bebida implements Serializable {
private String nombre;
private double precio;

    public Bebida(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
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
        this.precio = precio;
    }
}

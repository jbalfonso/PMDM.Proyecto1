package com.example.pmdmproyecto1;

import java.io.Serializable;

public class Pedido implements Serializable {
    private Pizza pizza;
    private Bebida bebida;
    private String nombrePedido;
    private double precioPedido;

    public Pedido(Pizza pizza, Bebida bebida, String nombrePedido) {
        this.pizza = pizza;
        this.bebida = bebida;
        this.nombrePedido = nombrePedido;
        calculaPrecioPedido();

    }
public void calculaPrecioPedido(){
        precioPedido = pizza.getPrecio()*pizza.getCantidadPorciones();
        precioPedido += bebida.getPrecio();
}
    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getNombrePedido() {
        return nombrePedido;
    }

    public void setNombrePedido(String nombrePedido) {
        this.nombrePedido = nombrePedido;
    }

    public double getPrecioPedido() {
        return precioPedido;
    }

    public void setPrecioPedido(double precioPedido) {
        this.precioPedido = precioPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "pizza=" + pizza +
                ", bebida=" + bebida +
                ", nombrePedido='" + nombrePedido + '\'' +
                ", precioPedido=" + precioPedido +
                '}';
    }
}


package com.example.pmdmproyecto1;

import java.io.Serializable;

public class Tarjeta implements Serializable {
    private String numeroTarjeta;
    private String tipoTarjeta;
    private String fechaCaducida;
    private String numeroSeguridad;

    public Tarjeta(String numeroTarjeta, String tipoTarjeta, String fechaCaducida, String numeroSeguridad) {
        this.numeroTarjeta = numeroTarjeta;
        this.tipoTarjeta = tipoTarjeta;
        this.fechaCaducida = fechaCaducida;
        this.numeroSeguridad = numeroSeguridad;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getFechaCaducida() {
        return fechaCaducida;
    }

    public void setFechaCaducida(String fechaCaducida) {
        this.fechaCaducida = fechaCaducida;
    }

    public String getNumeroSeguridad() {
        return numeroSeguridad;
    }

    public void setNumeroSeguridad(String numeroSeguridad) {
        this.numeroSeguridad = numeroSeguridad;
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "numeroTarjeta='" + numeroTarjeta + '\'' +
                ", tipoTarjeta='" + tipoTarjeta + '\'' +
                ", fechaCaducida='" + fechaCaducida + '\'' +
                ", numeroSeguridad='" + numeroSeguridad + '\'' +
                '}';
    }
}

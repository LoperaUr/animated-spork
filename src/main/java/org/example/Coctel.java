package org.example;

public class Coctel {
    private String nombre;
    private Long precioU;

    public Coctel() {
    }

    public Coctel(String nombre, Long precioU) {
        this.nombre = nombre;
        this.precioU = precioU;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPrecioU() {
        return precioU;
    }

    public void setPrecioU(Long precioU) {
        this.precioU = precioU;
    }
}

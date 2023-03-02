package org.example;

public class Shot extends Coctel{
    private String tipoLicor;

    public Shot() {
    }

    public Shot(String nombre, Long precioU, String tipoLicor) {
        super(nombre, precioU);
        this.tipoLicor = tipoLicor;
    }
}

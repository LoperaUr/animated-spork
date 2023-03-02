package org.example;

public class Shot extends Coctel{
    private String tipoLicor;

    public Shot() {
    }

    public Shot(String nombre, Long precioU, String tipoLicor) {
        super(nombre, precioU);
        this.tipoLicor = tipoLicor;
    }

    public Long calcularCosto(Long precioUnitario, int cantidad ){
        return cantidad * precioUnitario;
    }

    public Long calcularCosto2(int cantidad){
        Long costoT = this.getPrecioU()*cantidad;
        return costoT;
    }


}

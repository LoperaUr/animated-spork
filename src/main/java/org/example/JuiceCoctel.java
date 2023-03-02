package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class JuiceCoctel extends Coctel{
    private LocalDate fechaVencimiento;
    private LocalDate fechaCreacion;

    public JuiceCoctel() {
        this.fechaCreacion = LocalDate.now();
    }

    public JuiceCoctel(String nombre, Long precioU, LocalDate fechaVencimiento) {
        super(nombre, precioU);
        this.fechaVencimiento = fechaVencimiento;
        this.fechaCreacion = LocalDate.now();
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    Double costoDef = 0.0;
    public Double calcularCosto(int cantidad){
        Long diferenciaDias = ChronoUnit.DAYS.between(this.fechaCreacion,this.fechaVencimiento);
        Long costoNormal = this.getPrecioU() * cantidad;
        if (diferenciaDias == 1){
            System.out.println("Va un dia de creado! ");
            costoDef = costoNormal - 0.5 * (costoNormal);
        } else if (diferenciaDias == 2) {
            System.out.println("Van dos dias de creado! ");
            costoDef = Double.valueOf(costoNormal - costoNormal);
        } else if (diferenciaDias == 3) {
            System.out.println("Van tres dias de creado! ");
            costoDef = Double.valueOf(costoNormal - 2 * costoNormal);
        } else {
            System.out.println("Pa' la basura");
        }
        return costoDef;
    }
}

package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LeFrontend {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digita la cantidad de producto: ");
        Integer cantidadProducto = sc.nextInt();

        // Asignar la fecha del dispositivo
        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);
        // Asignas fehcas especifica
        LocalDate fecha2 = LocalDate.of(2023,2,24);
        System.out.println(fecha2);
        // Encontrar la diferencia entre 2 fechas
        Long diferenciaEntreFechas = ChronoUnit.DAYS.between(fecha,fecha2);
        System.out.println("La diferencia entre las dos fechas es: " + diferenciaEntreFechas + " dias");

    }
}
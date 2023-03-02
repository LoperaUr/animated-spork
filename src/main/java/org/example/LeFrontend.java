package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LeFrontend {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        JuiceCoctel coctel1 = new JuiceCoctel("BloodyMary",25000L,LocalDate.of(2023,3,4));
        System.out.println(coctel1.calcularCosto(5));


    }
}
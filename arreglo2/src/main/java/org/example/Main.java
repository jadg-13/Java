package org.example;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(new Estudiante("Roberto", "Ingeniería"));
        estudiantes.add(new Estudiante("Cristo", "Medicina"));
        System.out.println(estudiantes);

        estudiantes.add(new Estudiante("Hendrix", "Arquitectura"));

        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }

    }
}
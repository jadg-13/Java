package org.example;

public class Estudiante {

    private String nombre;
    private String carrera;

    public Estudiante(String nombre, String carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public String toString() {
        return "Nombre: " + this.nombre.toUpperCase() + ", Carrera: " + this.carrera.toLowerCase() + ", Email "+ this.nombre.toLowerCase()+"@uamv.edu.ni";
    }
}

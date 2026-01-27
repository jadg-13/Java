package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int[] numeros = new int[5];
        Scanner leer = new Scanner(System.in);
        //for
        for(int i = 0; i< 5; i++){
            System.out.println("Ingresa un numero: ");
            numeros[i] = leer.nextInt();
        }

        //foreach
        for(int num : numeros){
            System.out.println("Numero: " + num);
        }*/
/*
        String[] nombres = {"Rolando", "Cristo", "Roger"};
        for(String nombre : nombres) {
            System.out.println("Hola: " + nombre.toUpperCase());
            System.out.println("Hola: " + nombre.toLowerCase());
        }

        Arrays.sort(nombres);
        System.out.println(Arrays.toString(nombres));
*/
        Persona[] personas = new Persona[5];
        personas[0] = new Persona("Rolando", 18);
        personas[1] = new Persona("Cristo", 17);
        personas[2] = new Persona("Roger", 19);
        personas[3] = new Persona("Ana", 16);
        personas[4] = new Persona("Maria", 20);

        for(Persona persona : personas){
            if(persona.getEdad() >= 18){
                System.out.println(persona.getNombre() + " es mayor de edad.");
            }else{
                System.out.println(persona.getNombre() + " es menor de edad.");
            }
        }
    }
}
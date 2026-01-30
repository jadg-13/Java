package org.example;

/*
 * Uso de ArrayList
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int flag= 1, num;
        Scanner input = new Scanner(System.in);
        do{
            try {
                System.out.print("Ingresa un numero: ");
                num = Integer.parseInt(input.nextLine());
                numbers.add(num);
            }catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
            try {
                System.out.print("Deseas agregar otro numero? (0=No, 1=Si)");
                flag = Integer.parseInt( input.nextLine());
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());

            }
        }while(flag != 0);
        System.out.println("Numeros: " + numbers);
        /*
        Eliminar los numeros pares
         */
        for(int number : numbers){

            if(number % 2 == 0){
                numbers.remove(number);
            }
        }
        //Mostrar lista
        System.out.println("Numeros: " + numbers);
    }
}
package org.example3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Sumar 2 numeros
        int num1;
        int num2;
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + sum);
        sc.close();
    }

}

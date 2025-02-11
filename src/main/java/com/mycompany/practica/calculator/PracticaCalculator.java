/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica.calculator;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class PracticaCalculator {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double operation = 0;
        int respuesta;
        double a, b;
        
        while(true){
            System.out.println("Select the type of operation:");
            System.out.println("1: Multiply");
            System.out.println("2: Divide");
            System.out.println("3: Add");
            System.out.println("4: Subtract");
            System.out.println("5: Exit");
            
            respuesta = scan.nextInt();
            scan.nextLine();
            switch (respuesta){
                case 1:
                    System.out.println("Enter the numbers you want to multiply:");
                    a = scan.nextDouble();
                    b = scan.nextDouble();
                    System.out.println("The result is: " + (a * b));
                    break;
                case 2:
                    System.out.println("Enter the numbers you want to divide:");
                    a = scan.nextDouble();
                    b = scan.nextDouble();
                    if (b != 0) {
                        System.out.println("The result is: " + (a / b));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 3:
                    System.out.println("Enter the numbers you want to add:");
                    a = scan.nextDouble();
                    b = scan.nextDouble();
                    System.out.println("The result is: " + (a + b));
                    break;
                case 4:
                    System.out.println("Enter the numbers you want to subtract:");
                    a = scan.nextDouble();
                    b = scan.nextDouble();
                    System.out.println("The result is: " + (a - b));
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    scan.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid operation.");
                    break;
            }
            System.out.println("=========");
        }     
  
    }
}

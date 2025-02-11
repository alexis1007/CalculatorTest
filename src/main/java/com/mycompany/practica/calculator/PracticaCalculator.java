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
        double a,b;
        
        while(true){
            System.out.println("Selec te type of operation");
            System.out.println("multiply: 1");
            System.out.println("divide: 2");
            System.out.println("add up: 3");
            System.out.println("subtract 4");
            
            respuesta = scan.nextInt();
            scan.nextLine();
            switch (respuesta){
                case 1:
                    System.out.println("what numbers do yo want multiply");
                    a = scan.nextInt();
                    scan.nextLine();
                    b = scan.nextInt();
                    scan.nextLine();
                    System.out.println("The result is: "+(a*b));
                    break;
                case 2:
                    System.out.println("What numbers do you want divide");
                    a = scan.nextInt();
                    scan.nextLine();
                    b = scan.nextInt();
                    scan.nextLine();
                    System.out.println("The result is: "+(a/b));
                    break;
                case 3:
                    System.out.println("What numbers do you want add");
                    a = scan.nextInt();
                    scan.nextLine();
                    b = scan.nextInt();
                    scan.nextLine();
                    System.out.println("The result is: "+(a+b));
                    break;
                case 4:
                    System.out.println("What numbers do you want subtract");
                    a = scan.nextInt();
                    scan.nextLine();
                    b = scan.nextInt();
                    scan.nextLine();
                    System.out.println("The result is: "+(a-b));
                    break;
                    
            }
            System.out.println("=========");
        }      
  
    }
}

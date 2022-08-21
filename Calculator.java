/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.basic;

import java.util.Scanner;

/**
 *
 * @author mrahm
 */
public class Calculator {
    public static void main(String[] args) {
        
        int op;
        double x,y;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose operation:\n 1. Addition\n 2. Subtraction\n 3. Division\n 4. Multiplication");
        op= input.nextInt();
        System.out.println("First number- ");
        x= input.nextDouble();
        System.out.println("Second number- ");
        y= input.nextDouble();
        
        switch(op){
            case 1: 
                System.out.println("Result= "+(x+y));
                break;
            case 2: 
                System.out.println("Result= "+(x-y));
                break;
            case 3: 
                System.out.println("Result= "+(x/y));
                break;
            case 4: 
                System.out.println("Result= "+(x*y));
                break;
            default:
                System.out.println("Invalid operation!");
                break;    
        }
    }
    
}

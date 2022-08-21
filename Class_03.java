/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.class_03;

import java.util.Scanner;

/**
 *
 * @author SWE
 */
public class Class_03 {

    public static void main(String[] args) {
        int n,i;
        Scanner sc= new Scanner(System.in);
        System.out.print("n=");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            System.out.println("Number is : "+i+" and cube of "+i+" is :"+ i*i*i);
        }
        
        
    }
}

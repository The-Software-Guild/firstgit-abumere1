/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;
import java.util.Scanner;
/**
 *
 * @author joseph
 */
public class HealthyHearts {
    public static void main(String[] args) {
        
        int age, heartRate;
        
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("What is your age? ");
        age = Integer.parseInt(inputScanner.nextLine());
        
        heartRate = (220 - age);
        
        System.out.println("Your maximum heart rate should be " + (220 - age) + " beats per minute");
        System.out.println("Your target HR is " + (heartRate/2) + " - " +((heartRate * 85) * 0.1) + "per minute.");
    }
}

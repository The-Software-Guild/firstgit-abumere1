/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basicAssessment;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author joseph
 */
public class SummativeSums {
    static int arrOfInts() {
        
        int sum = 0;
        
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int arrlength = myscanner.nextInt();
        int [] myArray = new int[arrlength];
        
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<arrlength; i++ ) {
         myArray[i] = myscanner.nextInt();
         sum += myArray[i];
        }
        //displaying sum
        System.out.println("Final sum: " + sum);
        
        return sum;
    }  
    
    //the main method
    public static void main(String[] args) {
        
        System.out.println("Array Sum: " + arrOfInts());
        
    }
}

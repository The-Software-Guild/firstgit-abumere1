/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basicAssessment;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author joseph
 */
public class DogGenetics {
    public static void main(String[] args) {
        
        String dogName;
        int total = 0, dogBreed1 = 0, dogBreed2 = 0;
        int dogBreed3 = 0, dogBreed4 = 0, dogBreed5 = 0;
        
        Scanner myScanner  = new Scanner(System.in);
        Random num = new Random();
        
        System.out.println("Hello there! What is the name of your dog? ");
        dogName = myScanner.nextLine();
        
        System.out.println("Well then, I have this highly reliable report on "
                + dogName + "'s prestigious background right here.");
       
        System.out.println("\n\nSir" + dogName + " is\n\n");
        while (total != 100) {
            dogBreed1 = num.nextInt(100);
            dogBreed2 = num.nextInt(100 - dogBreed1);
            dogBreed3 = num.nextInt(100 - dogBreed2);
            dogBreed4 = num.nextInt(100 - dogBreed3);
            dogBreed5 = num.nextInt(100 - dogBreed4);
            
            total = (dogBreed1 + dogBreed2 + dogBreed3 + dogBreed4 + dogBreed5);
        }
        
        System.out.println(dogBreed1 + "%St.Bernard");
        System.out.println(dogBreed2 + "%Chihuahua");
        System.out.println(dogBreed3 + "%Dramatic RedNosed Asian Pug");
        System.out.println(dogBreed4 + "%Common Cur");
        System.out.println(dogBreed5 + "%King Doberman");
        
        System.out.println("\n\nWow, that's QUITE the dog!");
    }
}

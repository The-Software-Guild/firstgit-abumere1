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
public class RockPaperScissors {
    public static void main(String[] args) {
        //Declaring key variables
        
        int round, negativeVal, positiveVal,
                rock, paper, scissors; 
        int choice, k = 0, j = 0, y = 0;
        negativeVal = 0;
        positiveVal = 10;
        rock = 1;
        paper = 2;
        scissors = 3;
        String finalChoice;
        String positive = "yes";
        
        Scanner myScanner = new Scanner(System.in);
        //Indicating number of desired rounds
        Boolean play = true;
        while (play) {
        System.out.println("How many rounds would you like to play: ");
        round = Integer.parseInt(myScanner.nextLine());
        
        //setting a range for the rounds
        if (round < negativeVal) {
            System.out.println("This is not a value within the range");
            System.exit(round);
        }
        
        if (round > positiveVal) {
            System.out.println("This is not a value within the range");
            System.exit(round);
        }
        
        for(int i = 1; i <= round; i++) {
            //Collecting data for user choice
            System.out.println("Please take a pick from any of the options: 1 for Rock, 2 for Paper or 3 for Scissors");
            choice = Integer.parseInt(myScanner.nextLine());
            
            if ((choice == rock) || (choice == paper) || (choice == scissors)) {
                System.out.println("Good choice");
            } else {
                System.out.println("You inputed an invalid move");
            }
            //Generating computer choice  
            Random compChoice = new Random();
            int comp_random = compChoice.nextInt(3) + 1;
            System.out.println("Computer Choice is: " + comp_random );
            
            //Calculating wins, and displaying ties
            if (choice == comp_random) {
                k++;
                System.out.println("It's a tie!"); 
            } 
            else if (choice == rock) {
                if (comp_random == paper) {
                    y++;
                    System.out.println("Computer wins");
                } else {
                    j++;
                    System.out.println("Player wins");
                  } 
            } else if (choice == paper) {
                if (comp_random == rock) {
                    j++;
                    System.out.println("Player wins");
                } else {
                    y++;
                    System.out.println("Computer wins");
                }
            } else if (choice == scissors) {
                if (comp_random == rock) {
                    y++;
                    System.out.println("Computer wins");
                } else {
                    j++;
                    System.out.println("Player wins");
                }
             }
        } 
        //Printing to console number of wins, ties and the over winner of the Game.
        System.out.println("The number of ties: " + k);
        System.out.println("Player wins: " + j);
        System.out.println("Computer wins: " + y);
        
        if (j > y) {
            System.out.println("Player wins the Game. Yaay!");
        } else if (y > j) {
            System.out.println("Computer wins the Game. Boooooo!");
        } else {
            System.out.println("Its a tie game.");
        }
   
        System.out.println("Would you like to play again Y/N");
        play = myScanner.nextLine().trim().equalsIgnoreCase("y");    
        } 
    }
}

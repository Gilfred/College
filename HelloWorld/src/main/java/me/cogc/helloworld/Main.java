package me.cogc.helloworld;

import java.util.Scanner;

/**
 *
 * @author Michael C. Jackson
 */
public class Main {
   
    /**
     * 
     * @param args 
     */
    public static void main(String[] args){
        String name = "";
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Welcome to my first application.\nThis is running in the console\nWhat is your name?");
        name = userInput.nextLine();
        System.out.println("Hello " + name + ", it's a pleasure to meet you!");
    }
}

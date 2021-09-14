package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

// Libraries
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Goes through options of car troubles
        // Responds with proper responses to the issues
        System.out.print("Is the car silent when you turn the key? ");
        String carSilent = input.nextLine();

        if (carSilent.equals("y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            String batteryTerm = input.nextLine();

            if (batteryTerm.equals("y"))
            {
                System.out.println("Clean terminals and try starting again.");
            }
            else if (batteryTerm.equals("n"))
            {
                System.out.println("Replace cables and try again.");
            }
        }
        else if (carSilent.equals("n"))
        {
            System.out.print("Does the car make a slicking noise? ");
            String slicking = input.nextLine();

            if (slicking.equals("y"))
            {
                System.out.println("Replace the battery.");
            }
            else if (slicking.equals("n"))
            {
                System.out.print("Does the car crank up but fail to start? ");
                String crankUp = input.nextLine();

                if (crankUp.equals("y"))
                {
                    System.out.println("Check spark plug connections.");
                }
                else if (crankUp.equals("n"))
                {
                    System.out.print("Does the engine start and then die? ");
                    String startDie = input.nextLine();

                    if (startDie.equals("y"))
                    {
                        System.out.print("Does you car have fuel injection? ");
                        String fuelInject = input.nextLine();

                        if (fuelInject.equals("y"))
                        {
                            System.out.println("Get it in for service.");
                        }
                        else if (fuelInject.equals("n"))
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else if (startDie.equals("n"))
                    {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}

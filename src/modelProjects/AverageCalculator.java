package modelProjects;

import java.util.Scanner;

public class AverageCalculator
{
    public static void main(String[] args) {
        Scanner thisIsAScanner = new Scanner(System.in); //declare 'scanner' (A scanner takes in user inputs)

        System.out.print("How many numbers do you have in mind? "); //print out the question

        if (thisIsAScanner.hasNextInt()) { //hasNextInt is telling if the next input is an Int, execute this
            float numberOfNumbers = thisIsAScanner.nextInt(); //store the input (next input is an int) into a variable

            System.out.print("What's the sum of the numbers you had in mind? ");
            float sumOfNumbers = thisIsAScanner.nextInt(); //different variable to store another data for another question

            float average = sumOfNumbers / numberOfNumbers;
            System.out.println("The average of the numbers you had in mind is " + average);
        } else { //else starts right after if {} ends
            System.out.println("You did not enter an integer");
        }
    }
}
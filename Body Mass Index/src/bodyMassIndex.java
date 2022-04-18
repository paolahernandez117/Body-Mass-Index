/*Body Mass Index (BMI) helps in specifying the weight category a person belongs to, 
depending on their body weight. BMI is estimated using the following formula:
BMI = Weight in kilograms / (Height in meters)2
Write a program that calculates and outputs the BMI. Assume various input values wherever required.*/
import java.util.Scanner;

public class bodyMassIndex {
    public static void main (String[]args){
        System.out.println("\n");
        System.out.println("\tBody Mass Index Calculator\t\n");
        System.out.println("Body Mass Index (BMI) helps in specifying the weight category a person belongs to,");
        System.out.println("depending on their body weight. BMI is estimated using the following formula:\n");
        System.out.println(" BMI = Weight in kilograms");
        System.out.println("       -------------------");
        System.out.println("       (Height in meters)^2 \n");

        System.out.println("Enter your weight in kilograms: ");
        Scanner keyboard = new Scanner(System.in);
        double weight = keyboard.nextDouble();
        System.out.println("Enter your height in meters: ");
        double height = keyboard.nextDouble();

        double bmiCalculation = weight / (height*height);

        System.out.println("Based on your input, your Body Mass Index (BMI) is: "+ bmiCalculation);
        System.out.println("\n");

    }
}

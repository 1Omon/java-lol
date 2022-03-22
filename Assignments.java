package com.company;

import java.util.Scanner;

public class Assignments {
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the first figure: ");
        float first_number = input1.nextFloat();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the second figure: ");
        float second_number = input2.nextFloat();


        //for addition
        float sumOfNumbers = first_number + second_number;
        System.out.println("The sum of "+first_number+" and "+ second_number+ " is "+sumOfNumbers);

        //for subtraction
        float differenceBetweenNumbers = first_number - second_number;
        System.out.println("The difference between "+first_number+" and "+ second_number+ " is "+differenceBetweenNumbers);

        //for division
        float division = first_number / second_number;
        System.out.println("The quotient when "+first_number+" is divided by "+ second_number+ " is "+division);

        //for multiplication
        float multiplication = first_number * second_number;
        System.out.println("The product of "+first_number+" and "+ second_number+ " is "+multiplication);

        //finding remainder
        float remainder = first_number % second_number;
        int reainder = (int) remainder;
        System.out.println("The remainder when "+first_number+" is divided by "+ second_number+ " is "+reainder);
    }
}

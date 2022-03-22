package com.company;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        int examScore, assessmentScore, fees;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter scores for exams - ");
        examScore = input.nextInt();

        System.out.println("Enter scores for assessment - ");
        assessmentScore = input.nextInt();

        System.out.println("Enter fees paid - ");
        fees = input.nextInt();

        //students get certificate if they either get 25 in exams and 15 in assessment
        if (examScore >= 25 && assessmentScore >= 15) {
            if (fees >= 100) {
                System.out.println("Congratulations, you have been issued a certificate ;)");
            } else {
                System.out.println("You passed the exams but failed to pay your fees");
            }
        } else if (examScore == 25 && assessmentScore == 14) {
            if (fees >= 100) {
                System.out.println("Congratulations, you have been condoned and issued a certificate :)");
            } else {
                System.out.println("You were condoned but have not made full payments of fees");
            }
        } else if (examScore == 24 && assessmentScore == 15) {
            if (fees >= 100) {
                System.out.println("Congratulations, you have been condoned and issued a certificate :)");
            } else {
                System.out.println("You were condoned but have not made full payments of fees");
            }
        } else{
            if (fees >= 100) {
                System.out.println("Sorry, You weren't issued a certificate because you failed the exams");
            }else{
                System.out.println("Oops, you have been repeated");
            }
        }
    }
}

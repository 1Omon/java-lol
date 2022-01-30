package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int secret_number = (int)(Math.random() * 101) ;
        Scanner input = new Scanner(System.in);

        System.out.println("What's your guess? - ");

        int guess = input.nextInt();

        if (guess == secret_number){
            System.out.println("Correct guess!!!");
        }else{
            while (guess != secret_number){
                System.out.println("wrong guess!");
                Scanner input2 = new Scanner(System.in);

                System.out.println("What's your guess? - ");

                int next_guess = input.nextInt();
            }
        }
    }
}

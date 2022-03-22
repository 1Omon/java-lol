package com.company;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // write your code here
        //Checking if user is an admin or a student
        Scanner reply = new Scanner(System.in);
        System.out.println("Are you an admin...yes or no?");

        String res = reply.nextLine();

        boolean isAdmin;
        if(res == "yes"){
            isAdmin = true;
            String[] questions = {"1. ", "2. ", "3. ", "4. ", "5. "};
            char[] answers = {'A','C', 'B','D','A'};
        }
    }
}

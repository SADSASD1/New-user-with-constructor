package com.company;

import java.util.Scanner;
public class Main  {

    public static void main(String[] args) {


        String answer;
        do {
            Scanner firstname = new Scanner(System.in);
            System.out.println("Enter your firstname");
            String names = firstname.nextLine();


            Scanner lastname = new Scanner(System.in);
            System.out.println("Enter your lastname");
            String lastnames = lastname.nextLine();


            Scanner email = new Scanner(System.in);
            System.out.println("Enter your email");
            String emails = email.nextLine();


            Scanner password = new Scanner(System.in);
            System.out.println("Enter your password");
            String passwords = password.nextLine();


            System.out.println("Your firstname is" + " " + names);
            System.out.println("Your lastname is" + " " + lastnames);
            System.out.println("Your email is" + " " + emails);
            System.out.println("Your email is" + " " + passwords);


            Scanner in = new Scanner(System.in);
            System.out.println("Do you want to create another user");
            answer = in.next();

;

        }


        while (answer.equalsIgnoreCase("Yes"));
    }



    }



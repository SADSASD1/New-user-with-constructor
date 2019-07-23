package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main  {

    public static void main(String[] args) {


        String answer;

        do{


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


            Scanner input = new Scanner(System.in);
            System.out.println("Do you want to create another user");
            answer = input.next();


            class User {

                User us = new User();
                User us1 = new User();
                User us2 = new User();
                User us3 = new User();
                User us4 = new User();

                List<User> users = new ArrayList<>() ;

                public void User () {
                    users.add(us);
                    users.add(us1);
                    users.add(us2);
                    users.add(us3);
                    users.add(us4);
                    for (User users:users) {
                        System.out.println(users.users);
                    }
                }
            }

        }



        while (answer.equalsIgnoreCase("Yes"));

        System.out.println();
    }



    }



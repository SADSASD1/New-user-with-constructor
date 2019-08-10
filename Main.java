package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main  {

    public static void main(String[] args) {


        String answer;

        do{
            Scanner user_input=new Scanner(System.in);

            String firstname;
            System.out.println("Enter your firstname");
            firstname = user_input.next();


            String lastname;
            System.out.println("Enter your lastname");
            lastname = user_input.next();


            String email;
            System.out.println("Enter your email");
            email = user_input.next();


            String password;
            System.out.println("Enter your password");
            password = user_input.next();


            System.out.println("Your firstname is" + " " + firstname);
            System.out.println("Your lastname is" + " " + lastname);
            System.out.println("Your email is" + " " + email);
            System.out.println("Your email is" + " " + password);


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
                        System.out.println(users);
                    }
                }
            }

        }



        while (answer.equalsIgnoreCase("Yes"));

        System.out.println();
    }



    }



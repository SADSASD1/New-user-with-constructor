import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User us = new User("Ashot", "Aleqsanyan", "aleqsanyan1996@mail.ru", "1234qwer");
        User vahan = new User("Vahan", "Karapetyan", "Vahan@gmail.com", "qwer1234");
        User karen = new User("Karen", "Karapetyan", "Karen@gmail.com", "asdf1234");
        User hayk = new User("Hayk", "Ohanyan", "Hayk125@gamil.com", "44rr44");


        List myList = new ArrayList();
        myList.add(us);
        myList.add(vahan);
        myList.add(karen);
        myList.add(hayk);

        Scanner user =new Scanner(System.in);
        System.out.println("Enter your firstname");
        System.out.println("Enter your lastname");
        System.out.println("Enter your email");
        System.out.println("Enter your password");
        String names =user.nextLine();
        String lastnames = user.nextLine();
        String emails = user.nextLine();
        String passwords = user.nextLine();
        System.out.println("Your firstname is" + " " + names);
        System.out.println("Your lastname is" + " " +  lastnames);
        System.out.println("Your email is" + " " + emails);
        System.out.println("Your email is" + " " + passwords);

        Scanner in = new Scanner(System.in);
        boolean bool;
        System.out.println("Are your user (true/false)");
        bool=in.nextBoolean();
        if(bool) {
            System.out.println("Your user is right");
        }
        else {
            System.out.println("Your user is not correct");
        }





    }
}






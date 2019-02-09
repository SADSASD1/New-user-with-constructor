import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        User us = new User("Ashot", "Aleqsanyan", "aleqsanyan1996@mail.ru", "1234qwer");
        UserVahan us1 = new UserVahan("Vahan", "Karapetyan", "Vahan@gmail.com", "qwer1234");
        UserKaren us2 = new UserKaren("Karen", "Karapetyan", "Karen@gmail.com", "asdf1234");
        UserHayk us3 = new UserHayk("Hayk", "Ohanyan", "Hayk125@gamil.com", "44rr44");

        ArrayList<String>arrayList=new ArrayList<String>();

        System.out.println(String.valueOf(us));
        System.out.println(String.valueOf(us1));
        System.out.println(String.valueOf(us2));
        System.out.println(String.valueOf(us3));
    }
}




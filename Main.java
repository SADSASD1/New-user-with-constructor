
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        User us = new User("Ashot", "Aleqsanyan", "aleqsanyan1996@mail.ru", "1234qwer");
        User vahan = new User ("Vahan", "Karapetyan", "Vahan@gmail.com", "qwer1234");
        User karen  = new User ("Karen", "Karapetyan", "Karen@gmail.com", "asdf1234");
        User hayk  = new User ("Hayk", "Ohanyan", "Hayk125@gamil.com", "44rr44");

        ArrayList<User>User=new ArrayList<User>(3);
         User.add(us);
         User.add(vahan);
         User.add(karen);
         User.add(hayk);

        System.out.println(User);

    }
}




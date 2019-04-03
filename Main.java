import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User us = new User("Ashot", "Aleqsanyan", "aleqsanyan1996@mail.ru", "1234qwer");
        User vahan = new User ("Vahan", "Karapetyan", "Vahan@gmail.com", "qwer1234");
        User karen  = new User ("Karen", "Karapetyan", "Karen@gmail.com", "asdf1234");
        User hayk  = new User ("Hayk", "Ohanyan", "Hayk125@gamil.com", "44rr44");

        List myList = new ArrayList();
        myList.add(us);
        myList.add(vahan);
        myList.add(karen);
        myList.add(hayk);

        for(Object next:myList){
            System.out.println(next);
        }
        }

    }





import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User us = new User("Ashot","Aleqsanyan","aleqsanyan1996@mail.ru","1234qwer");
        System.out.println(us.toString());

        List<String> listStrings =new ArrayList<String>();
        listStrings.add("Vahan");
        listStrings.add("Karapetyan");
        listStrings.add("Vahan@gmail.com");
        listStrings.add("qwer1234");
        System.out.println(listStrings);

        List<String> listStrings2 =new ArrayList<String>();
        listStrings2.add("Karen");
        listStrings2.add("Karapetyan");
        listStrings2.add("Karen@gmail.com");
        listStrings2.add("asdf1234");
        System.out.println(listStrings2);


        List<String> listStrings3 =new ArrayList<String>();
        listStrings3.add("Hayk");
        listStrings3.add("Ohanyan");
        listStrings3.add("Hayk125@gmail.com");
        listStrings3.add("44rr44");
        System.out.println(listStrings3);
    }
    }



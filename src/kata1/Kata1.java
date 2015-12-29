package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Kata1 {

    
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Person p1;
        Calendar f1;
        f1 = GregorianCalendar.getInstance();
        f1.set(1995, 12, 10);
        p1 = new Person("Juan", "Leandro", f1);
        System.out.println(p1.getFullName());
        System.out.println(p1.getBirthday().getTime());
        System.out.println(p1.getAge());
    }
}
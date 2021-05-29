package JavaCoreLesson4;

import java.util.*;

public class Test_ {

    public static void main(String args[]) {

        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "1", "2", "3", "4", "5", "1", "2", "3");

        Set<String> counts = new HashSet<>(numbers);
        System.out.println("List of unique numbers:");

        for (String temp : counts) {
            if (Collections.frequency(numbers, temp) == 1)
                System.out.println(temp);
        }
        System.out.println();

        for (String temp : counts) {
            if (Collections.frequency(numbers, temp) != 1)
                System.out.println(temp + ": appears " + Collections.frequency(numbers, temp) + " times.");
        }
        System.out.println();

        Phonebook_.add("Saukova", "81111111111");
        Phonebook_.add("Saukova", "82222222222");
        Phonebook_.add("Grafskaya", "833333333333");
        Phonebook_.add("Terentiev", "84444444444");
        Phonebook_.add("Alexeev", "85555555555");


        System.out.println("Phones for " + "Saukova: " + Phonebook_.get("Saukova"));

    }


}

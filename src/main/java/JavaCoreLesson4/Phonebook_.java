package JavaCoreLesson4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Phonebook_ {
    private static HashMap<String, HashSet<String>> phoneBook = new HashMap<>();

    public static void add(String lastname, String phone) {
        if (phoneBook.containsKey(lastname)) {
            HashSet<String> phones = phoneBook.get(lastname);
            phones.add(phone);
            phoneBook.put(lastname, phones);
        }
        else phoneBook.put(lastname, new HashSet<String>(Arrays.asList(phone)));
    }

    public static HashSet<String> get(String lastname) {
        if (phoneBook.containsKey(lastname)) {
            HashSet<String> phones = phoneBook.get(lastname);
            return phones;
        } else {
            System.out.println("No entry for " + lastname + " have been found");
            return null;

        }
    }

}

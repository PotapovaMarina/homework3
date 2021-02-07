import java.util.*;

public class Phonebook {
    private Map<String, List<String>> phones;

    public Phonebook() {
        phones = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        if (phones.containsKey(surname)) {
            phones.get(surname).add(phoneNumber);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            phones.put(surname, numbers);
        }
    }

    public List<String> getNumber(String surname) {
        return phones.get(surname);
    }

    @Override
    public String toString() {
        return "Телефонная книга "+phones;
    }
}
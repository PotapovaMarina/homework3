import java.util.*;


public class Main {
    public static void main (String[] args){
        String [] arrayWords = {"Alex", "Peter", "John", "Kate","Anna","Tom","Kate","Alex","Anna","Anna","Liza"};

        System.out.println("************1 задача**********************");

        System.out.println("Наш массив:");
        System.out.println(Arrays.toString(arrayWords));

        Set<String> hashSet = new HashSet<>(Arrays.asList(arrayWords));
        System.out.println("Список уникальных слов, из которых состоит наш массив:");
        System.out.println(hashSet);

        for (String s: hashSet) {
             int freq= Collections.frequency(Arrays.asList(arrayWords),s);
             System.out.println("Слово "+s+" встречается в массиве "+ freq+" раз");
        }
        System.out.println("************2 задача**********************");
        Phonebook phones=new Phonebook();
        phones.add("Иванов","+79165546789");
        phones.add("Иванов","+79856789069");
        phones.add("Петров","+79154567890");
        phones.add("Петров","+79856789900");
        System.out.println(phones);
        System.out.println("Телефоны у Иванова:");
        System.out.println(phones.getNumber("Иванов"));
    }
}

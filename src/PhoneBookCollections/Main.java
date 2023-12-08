package PhoneBookCollections;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"vans", "puma", "converse", "etnies",
                "dcshoes", "reebok", "etnies", "vans", "nike",
                "puma", "element", "etnies", "dcshoes", "vans",
                "converse", "reebok", "diesel", "puma", "nike"};
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            if (Collections.frequency(Arrays.asList(words), word) == 1) {
                uniqueWords.add(word);
            }
        }
        System.out.println("Уникальные слова: " + uniqueWords);
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Количество повторений каждого слова:" + wordCount);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Седюк", "29-843-11-98");
        phoneBook.add("Кацубо", "29-684-77-35");
        phoneBook.add("Згурский", "44-788-33-25");
        phoneBook.add("Потапов", "44-782-13-05");
        phoneBook.add("Згурский", "29-632-37-73");
        phoneBook.add("Седюк", "29-777-9-15");

        System.out.println("\nТелефонный справочник:");
        System.out.println("Номер Седюка: " + phoneBook.get("Седюк"));
        System.out.println("Номер Згурского: " + phoneBook.get("Згурский"));
        System.out.println("Номер Потапова: " + phoneBook.get("Потапов"));

    }
}
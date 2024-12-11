package app.loop_h5_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        // countOccurrence
        List<String> words = List.of("sedan", "SUV", "coupe", "sedan", "truck", "coupe", "sedan");
        System.out.println("Occurrences of 'bird': " + countOccurrence(words, "bird"));

        // toList
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("List: " + toList(array));

        // findUnique
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);
        System.out.println("Unique numbers: " + findUnique(numbers));

        // calcOccurrence
        calcOccurrence(words);

        // findOccurrence
        List<WordOccurrence> result = findOccurrence(words);
        result.forEach(System.out::println);
    }

    public static int countOccurrence(List<String> list, String word) {
        return (int) list.stream().filter(e -> e.equals(word)).count();
    }

    public static List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        return list;
    }

    public static List<Integer> findUnique(List<Integer> numbers) {
        Set<Integer> uniqueSet = new HashSet<>(numbers);
        return new ArrayList<>(uniqueSet);
    }

    public static Map<String, Integer> calcOccurrence(List<String> words) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        return wordCountMap;
    }

    public static List<WordOccurrence> findOccurrence(List<String> words) {
        Map<String, Integer> wordCountMap = calcOccurrence(words);

        return wordCountMap.entrySet().stream()
                .map(entry -> new WordOccurrence(entry.getKey(), entry.getValue()))
                .toList();
    }
}

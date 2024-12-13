package app.loop_h5_1;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // countOccurrence
        List<String> words = List.of("sedan", "SUV", "coupe", "sedan", "truck", "coupe", "sedan");
        System.out.println("Occurrences of 'bird': " + countOccurrence(words, "bird"));

        // toList
        int[] items = {1, 2, 3, 4, 5};
        System.out.println("List: " + toList(items));

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

    public static List<Integer> toList(int[] items) {
        List<Integer> elements = new ArrayList<>();
        for (int num : items) {
            elements.add(num);
        }
        return elements;
    }

    public static List<Integer> findUnique(List<Integer> numbers) {
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }
        return uniqueNumbers;
    }

    public static List<String> calcOccurrence(List<String> words) {
        List<String> results = new ArrayList<>();

        for (String word : words) {
            long count = words.stream().filter(w -> w.equals(word)).count();
            if (results.stream().noneMatch(r -> r.startsWith(word + ":"))) {
                results.add(word + ": " + count);
            }
        }

        results.forEach(System.out::println);
        return results;
    }

    public static List<WordOccurrence> findOccurrence(List<String> words) {
        List<WordOccurrence> occurrences = new ArrayList<>();

        for (String word : words) {
            boolean found = false;
            for (WordOccurrence occurrence : occurrences) {
                if (occurrence.name.equals(word)) {
                    occurrence.count++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                occurrences.add(new WordOccurrence(word, 1));
            }
        }

        return occurrences;
    }
}

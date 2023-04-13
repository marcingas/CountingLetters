package pl.marcin;

import java.util.*;

public class UniqueChar {
    public static void main(String[] args) {

        Map<Character, Integer> numberOfWorsPerLetter = new HashMap<>();
        String userInput = "Litwo, Ojczyzno moja! ty jesteś jak zdrowie." +
                " Ile cię trzeba cenić,ten tylko się dowie," +
                " Kto cię stracił.";
        userInput = userInput.replaceAll(",", " ").replaceAll("!", " ")
                .replaceAll("\\.", " ").replaceAll("  ", " ").toLowerCase();

        String[] wordsInInvocationAsArray = userInput.split(" ");
        List<String> wordsInINvocationAsList = Arrays.asList(wordsInInvocationAsArray);

        Set<Character> setChar = new HashSet<>();

        for (String w : wordsInINvocationAsList) {
            Character firstLetter;
            String word = w;
            firstLetter = word.charAt(0);
            setChar.add(firstLetter);
        }
        System.out.println("W pierwszych dwóch zdaniach inwokacji znajdują się unikalne litery: ");
        System.out.print(setChar);
    }
}

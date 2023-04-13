package pl.marcin;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Character, Integer> numberOfWorsPerLetter = new HashMap<>();
        String userInput = "Litwo, Ojczyzno moja! ty jesteś jak zdrowie." +
                " Ile cię trzeba cenić,ten tylko się dowie," +
                " Kto cię stracił.";
        userInput = userInput.replaceAll(",", " ").replaceAll("!", " ")
                .replaceAll("\\.", " ").replaceAll("  ", " ").toLowerCase();

        String[] wordsInInvocationAsArray = userInput.split(" ");
        List<String> wordsInINvocationAsList = Arrays.asList(wordsInInvocationAsArray);

        for (String w : wordsInINvocationAsList) {
            Character firstLetter;
            String word = w;
            firstLetter = word.charAt(0);
            if (numberOfWorsPerLetter.containsKey(firstLetter)) {
                int value = numberOfWorsPerLetter.get(firstLetter);
                numberOfWorsPerLetter.put(firstLetter, value + 1);
            } else {
                numberOfWorsPerLetter.put(firstLetter, 1);
            }
        }

        System.out.println("W pierwszych dwóch zdaniach inwokacji znajduje się tyle słów rozpoczynających się " +
                " na konkretną literę: ");
        Map<Character,List<String>> map = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : numberOfWorsPerLetter.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            List<String>temporaryList = new ArrayList<>();
            for(String word : wordsInINvocationAsList){
                if(word.charAt(0) == key){
                    temporaryList.add(word);
                }
            }
            map.put(key,temporaryList);

            System.out.println(key + " -> " + value + " ->" + map.get(key));
        }
    }
}
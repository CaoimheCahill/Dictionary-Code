/**
 * Assignment 2022 Part3 (Dictionary Driver Class)
 *
 * Student Number: 21331308
 * Name: Caoimhe Cahill
 *
 * 5th April 2022
 */

public class DictionaryDriver {
    public static void main(String[] args) {

        Dictionary allWords = new Dictionary("./Sample.CSV", 0, 100);
        System.out.println("Dictionary - All Words");
        System.out.println(allWords);
        System.out.println();


        System.out.println();

        System.out.println("Dictionary - Large Words");
        System.out.println();

        // words between 5 and 50
        Dictionary largeWords = new Dictionary("./Sample.CSV", 5, 50);
        System.out.println(largeWords);
        System.out.println();
        System.out.printf("Checking for attack - %b%n", largeWords.inDictionary("attack")); // comes back as true
        System.out.printf("Checking for shame - %b%n", largeWords.inDictionary("ShAmE")); // comes back as true even with upper and lower case letters
        System.out.printf("Checking for but - %b%n", largeWords.inDictionary("but")); // comes back as false, in dictionary but lower than 5 letters
        System.out.printf("Checking for caffeine - %b%n", largeWords.inDictionary("caffeine")); // comes back as false, not in dictionary 

        System.out.println();
        System.out.printf("Dictionary - Small Words");
        System.out.println();

        // words between 0 and 4
        Dictionary smallWords = new Dictionary("./Sample.CSV", 0, 4);
        System.out.println(smallWords);
        System.out.println();
        System.out.printf("Checking for but - %b%n", smallWords.inDictionary("but")); // comes back as true
        System.out.printf("Checking for jump - %b%n", smallWords.inDictionary("JuMp")); // comes back as true even with upper and lower case letters
        System.out.printf("Checking for summer - %b%n", smallWords.inDictionary("summer")); // comes back as false, in dictionary but more than 4 letters
        System.out.printf("Checking for blast - %b%n", smallWords.inDictionary("blast")); // comes back as false, not in dictionary 
        System.out.println();

        // adding words to dictionary
        System.out.printf("Adding : dog %B\n", allWords.add("dog"));
        System.out.printf("Adding : water %B\n", allWords.add("water"));
        System.out.printf("Adding : loser %B\n", allWords.add("loser"));
        System.out.printf("Adding : couch %B\n", allWords.add("couch"));
        System.out.printf("Adding : phone %B\n", allWords.add("phone"));
        System.out.println();

        // checking words in all words dictionary
        System.out.println("Dictionary - All Words With Added Words");
        System.out.println(allWords);
        System.out.println();
        System.out.printf("Checking for dog - %B%n", allWords.inDictionary("dog")); 
        System.out.printf("Checking for water - %B%n", allWords.inDictionary("WaTeR"));
        System.out.printf("Checking for loser - %B%n", allWords.inDictionary("loser")); 
        System.out.printf("Checking for couch - %B%n", allWords.inDictionary("cOuCh")); 
        System.out.printf("Checking for phone - %B%n", allWords.inDictionary("phone")); 
        System.out.println();

        // testing next word method
        System.out.printf("Random Word (All Words Dictionary) = %s", allWords.nextWord()); // random word from all words dictionary
        System.out.println();
        System.out.printf("Random Word (Large Word Dictionary)= %s", largeWords.nextWord()); // random word from large word dictionary 
        System.out.println();
        System.out.printf("Random Word (Small Word Dictionary)= %s", smallWords.nextWord()); // random word from small word dictionary

    }
}

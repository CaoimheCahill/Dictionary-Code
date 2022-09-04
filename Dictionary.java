/**
 * Assignment 2022 Part3 (Dictionary Class)
 *
 * Student Number: 21331308
 * Name: Caoimhe Cahill
 *
 * 5th April 2022
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Dictionary {

    private ArrayList<String> words;
    private int shortest;
    private int longest;

    // This method reads the words from the specified CSV file between the specified shortest and longest lenghts
    //  return an empty list if no word matchs
    public Dictionary(String filepath, int shortest, int longest) {


        this.words = new ArrayList<>();
        this.shortest = shortest;
        this.longest = longest;

        try {
            File aFile = new File(filepath);
            Scanner aSource = new Scanner(aFile);

            while (aSource.hasNextLine()) {
                String line = aSource.nextLine();
                String[] line_split = line.split(",");

                for (String word : line_split) {
                    String word_trimmed = word.trim();

                    String word_uppercase = word_trimmed.toUpperCase();

                    if (word_trimmed.length() >= this.shortest && word_trimmed.length() <= this.longest) {
                        if (!this.words.contains(word_uppercase)) {
                            this.words.add(word_uppercase);
                        }
                    }
                }
            }
            aSource.close();
        } catch (IOException e) {
            System.out.println("File does not exist.");
        }
        Collections.sort(this.words);
    }


    public boolean add(String word) {
        String word_trimmed = word.trim();
        String word_uppercase = word_trimmed.toUpperCase();

        if (word_trimmed.length() >= this.shortest && word_trimmed.length() <= this.longest) {
            if (!this.words.contains(word_uppercase)) {
                this.words.add(word_uppercase);
                Collections.sort(this.words);
                return true;
            }
        }
        return false;
    }

    public String nextWord(){
        if(this.words.isEmpty()){
            return "";
        }else{
        int random = (int)(Math.random() * this.words.size());
        return this.words.get(random);
        }
        
    }

    public boolean inDictionary(String word){
        String word_trimmed = word.trim();
        String word_uppercase = word_trimmed.toUpperCase();

        if(this.words.contains(word_uppercase)){
            return true;
        }
        return false;
    }
    public String toString() {
        return words.toString();
    }
}

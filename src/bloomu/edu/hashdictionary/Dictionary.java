package bloomu.edu.hashdictionary;

import java.util.LinkedList;

/**
 * This is a Dictionary that uses the Hashing Technique
 * to store it's words.
 *
 * @author Lennox Haynes
 */

public class Dictionary {

    private LinkedList<Word>[] dictionary; // Stores words and definitions.
    private int wordCount; // Store number of words in this dictionary.
    private static int wordCap = 50_000; // Maximum amount of words.

    /**
     * Constructor
     */
    public Dictionary()
    {
        this.dictionary = new LinkedList[wordCap];
        this.wordCount = 0; // Total number of words in this dictionary
    }

    /**
     * Uses the hashCode() from the Object class to find the hash code of
     * the specified word (modulo if necessary).
     *
     * @param word The word to find the hash code.
     *
     * @return The hash code value of the word in bounds of the dictionary.
     */
    public static int hashCode(String word)
    {
        int hCode = word.toLowerCase().hashCode(); // Stores the hashCode

        if (hCode < 0) // If the hCode is negative.
        {
            hCode*= (-1); // Makes the hashCode positive.
        }

        if (hCode >= wordCap) // If hCode is greater than wordCap (50,000).
        {
            hCode%= wordCap; // Finds an index in the dictionary.
        }
        return hCode;
    }

    /**
     * Adds a word and its definition to this dictionary.
     *
     * @param word Word being added to this dictionary.
     *
     * @param description The definition of the word.
     */
    public void add(String word, String description)
    {
        // Creates a new LinkList if the index or the word is empty.
        if (this.dictionary[hashCode(word)] == null) {
            this.dictionary[hashCode(word)] = new LinkedList();
        }
        // Adds the word and definition
        this.dictionary[hashCode(word)].add(new Word(word, description));

    }

    /**
     * Finds the specified word and it's definitions.
     *
     * @param word The word from the dictionary.
     *
     * @return The word and all it's descriptions.
     */
    public String lookFor(String word) {

        // If the index of the word is null/empty.
        if (this.dictionary[hashCode(word)] == null) {
            return null;
        }

        StringBuilder showWord = new StringBuilder(word);

        // Find the specific instance to the specified word
        for (Word w: this.dictionary[hashCode(word)])
        {
            if (w.getWord().equals(word))
            {
                // Adds the definition to the showWord
                showWord.append("\n-").append(w.getDef());
            }

        }
        return showWord.toString();
    }

    /**
     * Creates a small class to hold the word and definition.
     */
    private static class Word {

        private String word;
        private String definition;

        public Word(String word, String definition){
            this.word = word;
            this.definition = definition;
        }

        public String getWord() {
            return word;
        }

        public String getDef() {
            return definition;
        }
    }

}

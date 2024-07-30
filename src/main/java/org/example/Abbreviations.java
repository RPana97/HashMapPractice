package org.example;
import java.util.HashMap;
import java.util.Map;

public class Abbreviations {

    // A map to store the abbreviations and their explanations
    private Map<String, String> abbreviations;

    // Constructor
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    // Method to add an abbreviation and its explanation
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(abbreviation, explanation);
    }

    // Method to check if an abbreviation exists
    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(abbreviation);
    }

    // Method to find the explanation for a given abbreviation
    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.getOrDefault(abbreviation, null);
    }

    public static void main(String[] args) {
        // Create an instance of Abbreviations
        Abbreviations abbreviations = new Abbreviations();

        // Add some abbreviations and their explanations
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        // A sample text containing abbreviations
        String text = "e.g. i.e. etc. lol";

        // Split the text into parts and replace abbreviations with their explanations
        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }
            System.out.print(part + " ");
        }
        System.out.println();
    }
}


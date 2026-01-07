package leetcode.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * 1) Java Program to Find Duplicate Characters in a String
 * Approach
 * Convert string to lowercase (optional, to avoid case issues)
 * Use a HashMap<Character, Integer> to store frequency
 * Print characters whose count > 1
 */


public class DuplicateCharacters {

    public static void main(String[] args) {
        String string = "Pranay";
        findDuplicateCharactersFromString(string);
    }

    public static void findDuplicateCharactersFromString(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Duplicate characters are:");
        for (Map.Entry<Character, Integer> entryMap : map.entrySet()) {
            if (entryMap.getValue() > 1) {
                System.out.println(entryMap.getKey() + " ==> " + entryMap.getValue());
            }
        }
    }
}

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 2) Java Program to Find the First Non-Repeating Character
 * Approach
 * Use LinkedHashMap (maintains insertion order)
 * Count frequency of each character
 * Return the first character with count = 1
 */

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        char result = findFirstNonRepeatingChar("NAYAN");

        System.out.println("First non-repeating character: " + result);

    }

    public static char findFirstNonRepeatingChar(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+ 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
//                System.out.println("First Non-Repeating character is : "+entry.getKey());
                return entry.getKey();
            }
        }
        return '\0';
    }
}

package algos.strings;
import java.util.HashMap;
import java.util.Map;;

public class CountDuplicateCharacters {

    public static HashMap<Character,Integer> countDuplicates(String duplicates){
        //convert string to CharArray
        // iterate the array and add the character,Count to HashMap
        // iterate the HashMap and print the characters that have count > 1
        HashMap<Character,Integer> charCounts = new HashMap<>();
        for( char ch : duplicates.toCharArray())
        {
            if(charCounts.containsKey(ch)){
                charCounts.put(ch,charCounts.get(ch)+1);
            }
            else
                charCounts.put(ch,1);

        }
        // functional programming style
        // charCounts.compute(ch,(k,v) -> (v == null) ? 1 : ++v);
        return charCounts;
    }

    public static void main(String[] args){
        String testString = "aabbcc";
        Map<Character,Integer> map = countDuplicates(testString);
        for( char c : map.keySet()){
            System.out.println(c + "," + map.get(c));
        }

        // with Streams
        // Map<Character,Integer> result =
        // testString.chars().mapToObj( c -> (char) c)
        // .collect(Collectors.groupingBy( c -> c, Collectors.counting()))

    }
}

package algos.strings;
import java.util.HashMap;;

public class FirstNonRepeatedCharacter {

    public static int findCharacter(String x){

        //loop through array and insert into hashmap with character, frequency

        HashMap<Character,Integer> nonDuplicates = new HashMap<>();
        for(char ch : x.toCharArray()){
            if(nonDuplicates.containsKey(ch))
                nonDuplicates.put(ch,nonDuplicates.get(ch)+1);
            else
                nonDuplicates.put(ch,1);
        }
        for(int i=0;i<x.length();i++){
            if(nonDuplicates.get(x.charAt(i)) == 1)
                return i;
        }

        return -1;
    }

    public static void main(String[] args){
        String testString1 = "abcdefga";
        String multiDuplicates = "aabbcc";
        String noDuplicates = "abc";
        String emptyString ="";

        System.out.println(findCharacter(testString1));
        System.out.println(findCharacter(multiDuplicates));
        System.out.println(findCharacter(noDuplicates));
        System.out.println(findCharacter(emptyString));


    }
}

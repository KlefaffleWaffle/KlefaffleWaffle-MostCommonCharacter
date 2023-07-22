import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {

    HashMap<Character, Integer> characters = new HashMap<Character, Integer>();
    
    for(int i = 0; i < str.length(); i++){
        if(characters.containsKey((Character) str.charAt(i))){
            characters.replace((Character) str.charAt(i), characters.get((Character) str.charAt(i)) +1);
        }else{
            characters.put((Character) str.charAt(i),1);
        }
        
    }
    int x = -1;
    char c = '$';
        for(Map.Entry<Character, Integer> Entry: characters.entrySet() ){
            if(Entry.getValue() > x){
                x = Entry.getValue();
                c = Entry.getKey();
            }
        }


        return c;
    }
}

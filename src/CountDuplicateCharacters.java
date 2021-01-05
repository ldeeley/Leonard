import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharacters {

    public static void main(String[] args) {
        Map<Character,Integer> characterIntegerMap = new HashMap<>();
        String testString = "supercalifragilisticexpialidocious";

        Character ch;
        Integer value;
        for (int i=0;i<testString.length()-1;i++){
            ch = testString.charAt(i);
            if (characterIntegerMap.containsKey(ch)){
                characterIntegerMap.put(ch, characterIntegerMap.get(ch) + 1);
            } else {
                characterIntegerMap.put(ch,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : characterIntegerMap.entrySet())
        {
            ch = entry.getKey();
            value = entry.getValue();

            System.out.println(ch + "=" + value);
        }
    }

}

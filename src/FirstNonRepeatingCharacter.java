import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args)  {
        String testString = "iittss  aa  ggoodd  aawffuull   ssmmaall  aaffaaiirr";

        Map<Character,Integer> characterIntegerMap = new HashMap<>();

        char ch;
        for (int i = 0; i < testString.length();i++){
            ch = testString.charAt(i);
            if (characterIntegerMap.containsKey(ch)) {
                characterIntegerMap.put(ch,characterIntegerMap.get(ch)+1);
            } else characterIntegerMap.put(ch,1);
        }

        boolean dupeNotFound = true;
        int i = 0;
        while (dupeNotFound){
            if (characterIntegerMap.get(testString.charAt(i))==1){
                System.out.println("The first non-dupe character is "+ testString.charAt(i));
                dupeNotFound = false;
            } else i++;
        }

    }

}

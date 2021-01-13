
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args)  {
        String testString = "iittss  aa  ggoodd  aawffubzull   ssmcmaall  aaffwaaiirr";


        LinkedHashMap<Character,Integer> characterIntegerMap = new LinkedHashMap<>(26);

        char ch;
        for (int i = 0; i < testString.length();i++){
            ch = testString.charAt(i);
            if (characterIntegerMap.containsKey(ch)) {
                characterIntegerMap.put(ch,characterIntegerMap.get(ch)+1);
            } else characterIntegerMap.put(ch,1);
        }

        for (Map.Entry<Character,Integer> nonDupe : characterIntegerMap.entrySet()){
            if (nonDupe.getValue()==1){
                System.out.println("First non-dupe character is : "+ nonDupe.getKey());
                break;
            }
        }


    }

}

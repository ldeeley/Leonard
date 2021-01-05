import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharacters {

    public static void main(String[] args) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        String testString = "supercalifragilisticexpialidocious";

        Character ch;
        Integer value;
        for (int i = 0; i < testString.length(); i++) {
            ch = testString.charAt(i);

            characterIntegerMap.compute(ch, (k, v) -> (v == null) ? 1 : ++v);  //ch is the key,  BiFunction computes a mapping based on Key

        }
        for (Map.Entry<Character, Integer> entry : characterIntegerMap.entrySet()) {
            ch = entry.getKey();
            value = entry.getValue();

            System.out.println(ch + "=" + value);
        }
    }

}

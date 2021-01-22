
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacterFunc {

    public static void main(String[] args)  {

        String testString2 = "length for testString2 , the heart sigln is ";

        Set<Character> uniqueChars  = testString2.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(k -> k.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        Optional<Character> firstNonRepeat = testString2.chars()
                .mapToObj(c -> (char) c)
                .filter(uniqueChars::contains)
                .findFirst();

        System.out.println(firstNonRepeat);

    }




     }





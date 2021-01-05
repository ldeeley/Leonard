import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateCharactersFunc {

    public static void main(String[] args) {

        String testString = "supercalifragilisticexpialidocious";

        Map<Character,Long> characterIntegerMap = testString.chars()
                        .mapToObj(c->(char) c)
                        .collect(Collectors.groupingBy(c->c, Collectors.counting()));

        for (Character ch : characterIntegerMap.keySet()) {
            System.out.println(ch + "=" + characterIntegerMap.get(ch));
        }

    }

}

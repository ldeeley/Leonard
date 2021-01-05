import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountDuplicateCharactersFunc {

    public static void main(String[] args) {

        String testString = "supercalifragilisticexpialidocious";

        Map<Character,Long> characterIntegerMap = testString.chars()
                        .mapToObj(c->(char) c)
                        .collect(Collectors.groupingBy(c->c, Collectors.counting()));

        characterIntegerMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);

//        for (Character ch : characterIntegerMap.keySet()) {
//            System.out.println(ch + "=" + characterIntegerMap.get(ch));
//        }

    }

}

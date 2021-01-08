import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountDuplicateCharactersFunc {

    public static void main(String[] args) {

        String testString = "supercalifragilisticexpialidocious";
        String testString2 =  "😍 I love 💕 you Ӝ so much 💕 😍 🎼🎼🎼!";
        String testString3 = String.valueOf(Character.toChars(128149));
        System.out.println(testString3);

//        Map<Character,Long> characterIntegerMap = testString.chars()
//                        .mapToObj(c->(char) c)
//                        .collect(Collectors.groupingBy(c->c, Collectors.counting()));
//
//        characterIntegerMap.entrySet().stream()
//                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
//                .forEach(System.out::println);

        testString2.codePoints()
                .mapToObj(c->(char)c)
                .forEach(System.out::println);

//        for (Character ch : characterIntegerMap.keySet()) {
//            System.out.println(ch + "=" + characterIntegerMap.get(ch));
//        }

    }

}

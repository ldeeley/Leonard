import java.util.stream.Collectors;

public class CountingDuplicateCharacters {

    public static void main(String[] args) {
        String testString = "supercalifragilisticexpialidocious";

        testString.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter((k)-> k.getValue()>=2)
                .forEach(System.out::println);

    }

}

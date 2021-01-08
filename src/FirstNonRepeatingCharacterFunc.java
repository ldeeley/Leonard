
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.counting;

public class FirstNonRepeatingCharacterFunc {

    public static void main(String[] args) throws IOException {
        String fileContents = Files.readString(Paths.get("C:\\Users\\leste\\IdeaProjects\\Leonard\\src\\lifeonmars.txt"));
        Set<Character> nonDupesSet = fileContents.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() < 2)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

     for (int i=0; i< fileContents.length();i++){
         if (nonDupesSet.contains(fileContents.charAt(i))) {
             System.out.println("the first non-duplicated character in the string is : "+fileContents.charAt(i));
             break;
         }
     }

    }
}

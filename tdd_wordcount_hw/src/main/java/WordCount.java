import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordCount {


    public int getWordCount(String string) {

        string = string.toLowerCase();
        String[] arrOfStr = string.split("[;, \"'?.@!_|&%/\n\t]");
        if (string.length() == 0 || arrOfStr.length == 0) {
            throw new IllegalArgumentException("There are no words here.");
        }
        else {
            Set<String> hashSet = new HashSet<>(Arrays.asList(arrOfStr));
            return hashSet.size();

        }
    }
}


public class WordCount {


    public int getWordCount(String string) {

        String [] arrOfStr = string.split("[;, ?.@!_|&%]");
        int count = arrOfStr.length;
        return count;
    }
}

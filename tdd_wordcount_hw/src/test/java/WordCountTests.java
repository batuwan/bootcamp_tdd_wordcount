import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCountTests {

    @Test
    public void getWordCount_WhenAStringIsGiven_ShouldReturnNumberOfWords() {

        //Given
        WordCount sut = new WordCount();
        //When
        int count = sut.getWordCount("Batuhan Karaman");
        //Then
        assertEquals(count,2);

        /*
         todo: number of unique words
         fixme: capitalization
        */
    }


}

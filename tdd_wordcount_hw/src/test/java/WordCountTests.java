import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCountTests {

    @Test
    public void getWordCount_WhenAStringIsGiven_ShouldReturnTwo() {

        //Given
        WordCount sut = new WordCount();
        //When
        int count = sut.getWordCount("Batuhan Karaman");
        //Then
        assertEquals(count, 2);


    }

    @Test
    public void getWordCount_WhenInputStringIsEmpty_ShouldThrowException() {

        //Given
        WordCount sut = new WordCount();
        //When
        Throwable thrown = Assertions.catchThrowable(() -> sut.getWordCount("!"));
        //Then
        assertEquals("There are no words here.", thrown.getMessage());

    }

    @Test
    public void getWordCount_WhenInputHasDuplicateWords_ShouldReturnTwo() {

        //Given
        WordCount sut = new WordCount();
        //When
        int count = sut.getWordCount("Batuhan Karaman Batuhan");
        //Then
        assertEquals(count, 2);


    }

    @Test
    public void getWordCount_WhenInputHasPunctuations_ShouldReturnThree() {

        //Given
        WordCount sut = new WordCount();
        //When
        int count = sut.getWordCount("Batuhan, Karaman!?\" Karaman?");
        //Then
        assertEquals(count, 3);


    }

    @Test
    public void getWordCount_WhenInputHasBothUpperAndLowerCase_ShouldReturnTwo() {

        //Given
        WordCount sut = new WordCount();
        //When
        int count = sut.getWordCount("Batuhan batuhan Karaman karaman");
        //Then
        assertEquals(count, 2);


    }
}

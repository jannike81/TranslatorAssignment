import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestRunner {

    @Test
    public void testUpperCaseEnglishWordToMorse() {
        Translator translator = new Translator();

        String[] expected = {"****", "*", "*---"};
        String[] actual = translator.translateFromEnglishToMorse("HEJ");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testLowerCaseEnglishWordToMorse() {
        Translator translator = new Translator();

        String[] expected = {"****", "*", "*---"};
        String[] actual = translator.translateFromEnglishToMorse("hej");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testEnglishWordsToMorse() {
        Translator translator = new Translator();

        String[] expected = {"****", "*", "*---", ";", "****", "*", "*---"};
        String[] actual = translator.translateFromEnglishToMorse("hej hej");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testEnglishNumberToMorse() {
        Translator translator = new Translator();

        String[] expected = {"*****"};
        String[] actual = translator.translateFromEnglishToMorse("5");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testEnglishWordNotFound() {
        Translator translator = new Translator();

        String[] expected = {"English letter is not found"};
        String[] actual = translator.translateFromEnglishToMorse("%");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMorseWordNotFound() {
        Translator translator = new Translator();

        String[] expected = {"Morse letter is not found"};
        String[] actual = translator.translateFromMorseToEnglish("%");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMorseWordToEnglish() {
        Translator translator = new Translator();

        String[] expected = {"H", "E", "L", "L", "O", " ", "W", "O", "R", "L", "D"};
        String[] actual = translator.translateFromMorseToEnglish("**** * *-** *-** --- ; *-- --- *-* *-** -**");
        assertArrayEquals(expected, actual);
    }

}

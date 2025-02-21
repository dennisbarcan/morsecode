
import MorseCode.MorseCodeTranslator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MorseCodeTranslatorTest {


    MorseCodeTranslator translator = new MorseCodeTranslator();


    @Test
    public void testTranslateToMorse() {
        String testdata = "DENNIS";
        String expected = "-.. . -. -. .. ... ";
        String actual = translator.translateToMorse(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testTranslateToText() {
        String testdata = ".--. .-. --- --. .-. .- -- -- . .-. .. -. --. ";
        String expected = "PROGRAMMERING";
        String actual = translator.translateToText(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidMorseCode() {
        String testdata = ".... . .--- X"; // Ogiltig morsekod med tecken som inte finns
        String expected = "Fel: Ogiltig morsekod";
        String actual = translator.translateToText(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidCharacterInText() {
        String testdata = "HEJ!"; // Ogiltigt tecken i text
        String expected = "Fel: Ogiltigt tecken i texten";
        String actual = translator.translateToMorse(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyText() {
        String testdata = ""; // Testar tom input
        String expected = "";
        String actual = translator.translateToMorse(testdata);
        assertEquals(expected, actual);
    }
}



package MorseCode;

import java.util.HashMap;

public class MorseCodeTranslator {

    private HashMap<Character, String> lettersToMorse = new HashMap<>();
    private HashMap<String, Character> morseToLetters = new HashMap<>();

    public MorseCodeTranslator() {
        morseCode();
    }

    private void morseCode() {

        lettersToMorse.put('A', ".-");
        lettersToMorse.put('B', "-...");
        lettersToMorse.put('C', "-.-.");
        lettersToMorse.put('D', "-..");
        lettersToMorse.put('E', ".");
        lettersToMorse.put('F', "..-.");
        lettersToMorse.put('G', "--.");
        lettersToMorse.put('H', "....");
        lettersToMorse.put('I', "..");
        lettersToMorse.put('J', ".---");
        lettersToMorse.put('K', "-.-");
        lettersToMorse.put('L', ".-..");
        lettersToMorse.put('M', "--");
        lettersToMorse.put('N', "-.");
        lettersToMorse.put('O', "---");
        lettersToMorse.put('P', ".--.");
        lettersToMorse.put('Q', "--.-");
        lettersToMorse.put('R', ".-.");
        lettersToMorse.put('S', "...");
        lettersToMorse.put('T', "-");
        lettersToMorse.put('U', "..-");
        lettersToMorse.put('V', "...-");
        lettersToMorse.put('W', ".--");
        lettersToMorse.put('X', "-..-");
        lettersToMorse.put('Y', "-.--");
        lettersToMorse.put('Z', "--..");


        // Morsekod --> Letters
        for (char letter : lettersToMorse.keySet()) {
            String morse = lettersToMorse.get(letter);
            morseToLetters.put(morse, letter);
        }
    }

    // Text --> Morsekod
    public String translateToMorse(String text) {
        String resultMorse = "";
        text = text.toUpperCase(); // Omvandlar input till stora bokstäver

        for (char letter : text.toCharArray()) {
            if (letter == ' ') {
                resultMorse += " ";
            } else if (lettersToMorse.containsKey(letter)) {
                resultMorse += lettersToMorse.get(letter) + " ";
            } else {
                return "Fel: Ogiltigt tecken i texten";
            }
        }
        return resultMorse;
    }

    // Moreskod --> Text
    public String translateToText(String morse) {
        String resultText = "";
        String[] morseArray = morse.split(" ");

        for (String morseLetter : morseArray) {
            if (morseToLetters.containsKey(morseLetter)) {
                resultText += morseToLetters.get(morseLetter); // Lägg till motsvarande bokstav
            } else if (!morseLetter.isEmpty()) {
                return "Fel: Ogiltig morsekod"; // Hantera ogiltiga morse-tecken
            }
        }
        return resultText;
    }
}

import java.util.Map;
import java.util.HashMap;

public class Translator {
    MyHashMap myHM = new MyHashMap();
    HashMap<String, String> hm = myHM.getHM(); //creates a new hashmap and gives it the values

    public Translator() {

    }


    public String[] translateFromEnglishToMorse(String wordInput) {
        wordInput = wordInput.toUpperCase(); //need to convert to upper case since that is what the hashmap has
        String[] lettersFromEnglishInput = wordInput.split("");
        String[] fromEnglishToMorse = new String[lettersFromEnglishInput.length];
        for (int i = 0; i < lettersFromEnglishInput.length; i++) {
            if (hm.containsKey(lettersFromEnglishInput[i])) {
                fromEnglishToMorse[i] = hm.get(lettersFromEnglishInput[i]);
            } else {
                fromEnglishToMorse[i] = "English letter is not found";
            }
        }
        return fromEnglishToMorse;
    }

    public String[] translateFromMorseToEnglish(String wordInput) {
        String[] lettersFromMorseInput = wordInput.split(" ");
        String[] fromMorseToEnglish = new String[lettersFromMorseInput.length];

        for (int n = 0; n < lettersFromMorseInput.length; n++) { //loop through the array of Strings containing morse letters
            if (hm.containsValue(lettersFromMorseInput[n])) { //if morse letter is found as a value in the hashmap hm
                fromMorseToEnglish[n] = getKey(lettersFromMorseInput[n]); //get the key of the value and put it on the array of Strings
            } else {
                fromMorseToEnglish[n] = "Morse letter is not found";
            }
        }
        return fromMorseToEnglish;
    }

    private String getKey(String value) {
        for (Map.Entry<String, String> entry : hm.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();

            }
        }
        return null;
    }
}




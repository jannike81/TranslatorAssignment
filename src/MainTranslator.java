import java.util.Scanner;

public class MainTranslator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("**Welcome to my translator which translates from English to Morse or the other way around**");
        System.out.println("Type 1 if you want to translate from English to Morse ");
        System.out.println("Type 2 if you want to translate from Morse to English ");
        String optionInput = scan.nextLine();

        Translator myTranslator = new Translator();


        if (optionInput.equals("1")) {
            System.out.println("Type what you want to translate from English to Morse: ");
            String textInput = scan.nextLine();
            String[] morseLetters = myTranslator.translateFromEnglishToMorse(textInput);
            System.out.print(textInput + " = ");
            for (String s : morseLetters) {
                System.out.print(s + " ");
            }
        } else if (optionInput.equals("2")) {
            System.out.println("Type what you want to translate from Morse to English ");
            System.out.println("***Keep in my mind to have a space between morse codes and ; for a morse word*** ");
            String textInput = scan.nextLine();
            String[] englishLetters = myTranslator.translateFromMorseToEnglish(textInput);
            System.out.print(textInput + " = ");
            for (String s : englishLetters) {
                System.out.print(s);
            }
        } else {
            System.out.println("Option is invalid, try again");
        }


    }


}


package uk.co.crescentworks.string;



class LetterChange {

    static String LOWER_CASE_VOWELS = "aeiou";
    static int ASCII_a_VALUE = 97;
    static int ASCII_z_VALUE = 122;
    static int ASCII_A_VALUE = 65;
    static int ASCII_Z_VALUE = 90;

    static String letterChanges(String str) {
        if (nullString(str)) {
            return "";
        } else {
            return vowelCapital(nextLetter(str));
        }
    }

    static String vowelCapital(String str) {
        if (nullString(str)) {
            return "";
        } else {
            StringBuilder capitalised = new StringBuilder();
            for (char thisCharacter : str.toCharArray()) {
                if (LOWER_CASE_VOWELS.indexOf(thisCharacter) > -1) {
                    int thisCharacterValue = (int) thisCharacter;
                    thisCharacter = (char) (thisCharacterValue - 32);
                }
                capitalised.append(thisCharacter);
            }
            return capitalised.toString();
        }
    }

    static String nextLetter(String str) {
        StringBuilder nextLetter = new StringBuilder();
        if (!nullString(str)) {

            for (char thisCharacter : str.toCharArray()) {
                int thisCharacterValue = (int) thisCharacter;

                if (thisCharacterValue == ASCII_z_VALUE) {
                    thisCharacterValue = ASCII_A_VALUE;

                } else if (thisCharacterValue == ASCII_Z_VALUE) {
                    thisCharacterValue = ASCII_a_VALUE;

                } else if (
                        (ASCII_a_VALUE <= thisCharacterValue && thisCharacterValue < ASCII_z_VALUE) ||
                                (ASCII_A_VALUE <= thisCharacterValue && thisCharacterValue < ASCII_Z_VALUE)) {
                    thisCharacterValue += 1;
                }

                char nextChar = (char) thisCharacterValue;
                nextLetter.append(nextChar);
            }
        }
        return nextLetter.toString();

    }

    static boolean nullString(String str) {
        return (str == null || str == "");
    }
}
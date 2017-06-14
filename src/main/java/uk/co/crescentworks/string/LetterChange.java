package uk.co.crescentworks.string;



class LetterChange {

    static String LOWER_CASE_VOWELS = "aeiou";
    static int ASCII_a_VALUE = 97;
    static int ASCII_z_VALUE = 122;
    static int ASCII_A_VALUE = 65;
    static int ASCII_Z_VALUE = 90;

    static String letterChanges(String str) {
        // a string builder for the value we shall return
        StringBuilder rotatedAndCaptitalised = new StringBuilder();

        // use the iterator syntax to avoid pesky indexing issues
        for(char thisCharacter: str.toCharArray()){
                int thisCharacterValue = (int)thisCharacter;
                if(thisCharacterValue == ASCII_z_VALUE){

                    // if we're at z then wrap around to a
                    thisCharacterValue = ASCII_a_VALUE;
                } else if (thisCharacterValue == ASCII_Z_VALUE) {

                    // if we're at Z then wrap around to A
                    thisCharacterValue = ASCII_A_VALUE;
                } else if (

                        // we only want to rotate letters, everything else can stay in place
                        (ASCII_a_VALUE <= thisCharacterValue && thisCharacterValue <= ASCII_z_VALUE) ||
                                (ASCII_A_VALUE <= thisCharacterValue && thisCharacterValue <= ASCII_Z_VALUE)){
                    thisCharacterValue += 1;
                }

                // get the value of the char, rotated or not
                char rotatedChar = (char)thisCharacterValue;

                // if the char is a lower case vowel, upper case it
                if (LOWER_CASE_VOWELS.indexOf(rotatedChar) > -1) {
                    rotatedChar = (char)(thisCharacterValue - 32);
                }

                // append the char to our output string builder
                rotatedAndCaptitalised.append(rotatedChar);
            }
        return rotatedAndCaptitalised.toString();
    }
}
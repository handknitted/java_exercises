package simpletest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by david on 13/06/17.
 */
public class LetterChangeTest {

    @Test
    public void testLetterChanges() {
        String inputString = "hello joshua";
        String outputString = "Ifmmp kptIvb";
        String actualOutput = LetterChange.letterChanges(inputString);
        assertEquals("We didn't get the right value", outputString, actualOutput);
    }

    @Test
    public void testLetterChangesWithCapitals() {
        String inputString = "Hello Joshua";
        String outputString = "Ifmmp KptIvb";
        String actualOutput = LetterChange.letterChanges(inputString);
        assertEquals("We didn't get the right value", outputString, actualOutput);
    }

    @Test
    public void testLetterChangesWithPunctuation() {
        String inputString = "hello there, Joshua!";
        String outputString = "Ifmmp UIfsf, KptIvb!";
        String actualOutput = LetterChange.letterChanges(inputString);
        assertEquals("We didn't get the right value", outputString, actualOutput);
    }

}

package uk.co.crescentworks.string;

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

    @Test
    public void testLetterChangesz_A(){
        String inputString = "zzzzzz";
        String outputString = "AAAAAA";
        String actualOutput = LetterChange.letterChanges(inputString);
        assertEquals("We didn't get the right value", outputString, actualOutput);
    }

    @Test
    public void testLetterChangesZ_A(){
        String inputString = "ZZZZZZ";
        String outputString = "AAAAAA";
        String actualOutput = LetterChange.letterChanges(inputString);
        assertEquals("We didn't get the right value", outputString, actualOutput);
    }

    @Test
    public void testVowelCapital(){
        String inputString = "abcdefghijklmnopqrstuvwxyz";
        String outputString = "AbcdEfghIjklmnOpqrstUvwxyz";
        String actualOutput = LetterChange.vowelCapital(inputString);
        assertEquals("We didn't get the right value", outputString, actualOutput);
    }

    @Test
    public void testNextLetter(){
        String inputString = "abcdefghijklmnopqrstuvwxyz";
        String outputString = "bcdefghijklmnopqrstuvwxyzA";
        String actualOutput = LetterChange.nextLetter(inputString);
        assertEquals("We didn't get the right value", outputString, actualOutput);
    }

    @Test
    public void testNextLetterz_a(){
        String inputString = "Zz";
        String outputString = "aA";
        String actualOutput = LetterChange.nextLetter(inputString);
        assertEquals("We didn't get the right value", outputString, actualOutput);
    }

    @Test
    public void testNullInputLetterChanges(){
        String inputString = null;
        String outputString = "";
        String actualOutput = LetterChange.letterChanges(inputString);
        assertEquals("We didn't get the right value", outputString, actualOutput);
    }

    @Test
    public void testNullInputNextLetter(){
        String inputString = null;
        String outputString = "";
        String actualOutput = LetterChange.nextLetter(inputString);
        assertEquals("We didn't get the right value", outputString, actualOutput);
    }


}

package morseTranslator;

import org.junit.Assert;
import org.junit.Test;

public class TDDTest {
    @Test
    public void testEnglishToMorse1() {
        Logic test = new Logic();
        String testInput = "Hello";
        test.translateEnglish(testInput);

        String actual = test.getOutput();
        String expected = "**** * *-** *-** ---";

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testEnglishToMorse2() {
        Logic test = new Logic();
        String testInput = "Testing commas ,,, Testing periods ... Testing question marks ???";
        test.translateEnglish(testInput);

        String actual = test.getOutput();
        String expected = "- * *** - ** -* --* / -*-* --- -- -- *- *** / --**-- --**-- --**-- / - * *** - ** -* --* " +
                "/ *--* * *-* ** --- -** *** / *-*-*- *-*-*- *-*-*- / - * *** - ** -* --* / --*- **- * *** - ** --- -* " +
                "/ -- *- *-* -*- *** / **--** **--** **--**";

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testMorseToEnglish1() {
        Logic test = new Logic();
        String testInput = "*-- *- *-** **- ** --* ** / -- -- -- / -*-- * ***";
        test.translateMorse(testInput);

        String actual = test.getOutput();
        String expected = "WALUIGI MMM YES";

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testMorseToEnglish2() {
        Logic test = new Logic();
        String testInput = "** -- / --* --- -* -* *- / - *-* -*-- / *- / -*-* --- -- -- *- --**-- " +
                "/ *- -* -** / *- *-** *** --- / *- / *--* * *-* ** --- -** *-*-*- / *** **** --- **- " +
                "*-** -** / *-- * / - *-* -*-- / *- / --*- **- * *** - ** --- -* / -- *- *-* -*- **--**";
        test.translateMorse(testInput);

        String actual = test.getOutput();
        String expected = "IM GONNA TRY A COMMA, AND ALSO A PERIOD. SHOULD WE TRY A QUESTION MARK?";

        Assert.assertEquals(expected, actual);
    }

}
//Utveckla programmet i TDD och skriv minst 3 JUnit-testfall

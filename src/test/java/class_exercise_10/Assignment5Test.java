package class_exercise_10;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;

public class Assignment5Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testCheckIt2() {
        Assignment5.checkIt(true, true, false);
        assertEquals("P is true\n", outContent.toString());
    }

    @Test
    public void testCheckIt3() {
        Assignment5.checkIt(true, false, true);
        assertEquals("P is true\n", outContent.toString());
    }

    @Test
    public void testCheckIt4() {
        Assignment5.checkIt(true, false, false);
        assertEquals("P is false\n", outContent.toString());
    }

    @Test
    public void testCheckIt5() {
        Assignment5.checkIt(false, true, true);
        assertEquals("P is false\n", outContent.toString());
    }

    @Test
    public void testTwoPredP1Tr1P2Tr2() {
        assertEquals("A", Assignment5.twoPred(0, 1));
    }

    @Test
    public void testTwoPredP1Tr2() {
        assertEquals("B", Assignment5.twoPred(1, 0));
    }

    @Test
    public void testTwoPredP2Tr1() {
        assertEquals("A", Assignment5.twoPred(4, 6));
    }

    @Test
    public void testTwoPredP2Tr3() {
        assertEquals("B", Assignment5.twoPred(6, 4));
    }
}

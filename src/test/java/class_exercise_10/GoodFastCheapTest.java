package test.java.class_exercise_10;

import static org.junit.Assert.*;

import main.java.class_exercise_10.GoodFastCheap;

import org.junit.Test;

public class GoodFastCheapTest {
    @Test
    public void testSatisfactoryMajARows26() {
        GoodFastCheap gfc = new GoodFastCheap();

        // Test row 2
        gfc.good = true;
        gfc.fast = true;
        assertTrue(gfc.satisfactory());

        // Test row 6
        gfc.good = false;
        assertFalse(gfc.satisfactory());
    }

    @Test
    public void testSatisfactoryMajARow37() {
        GoodFastCheap gfc = new GoodFastCheap();

        // Test row 3
        gfc.good = true;
        gfc.cheap = true;
        assertTrue(gfc.satisfactory());

        // Test row 7
        gfc.good = false;
        assertFalse(gfc.satisfactory());
    }

    @Test
    public void testSatisfactoryMajBRow24() {
        GoodFastCheap gfc = new GoodFastCheap();

        // Test row 2
        gfc.good = true;
        gfc.fast = true;
        assertTrue(gfc.satisfactory());

        // Test row 4
        gfc.fast = false;
        assertFalse(gfc.satisfactory());
    }

    @Test
    public void testSatisfactoryMajBRow57() {
        GoodFastCheap gfc = new GoodFastCheap();

        // Test row 5
        gfc.fast = true;
        gfc.cheap = true;
        assertTrue(gfc.satisfactory());

        // Test row 7
        gfc.fast = false;
        assertFalse(gfc.satisfactory());
    }

    @Test
    public void testSatisfactoryMajCRow34() {
        GoodFastCheap gfc = new GoodFastCheap();

        // Test row 3
        gfc.good = true;
        gfc.cheap = true;
        assertTrue(gfc.satisfactory());

        // Test row 4
        gfc.cheap = false;
        assertFalse(gfc.satisfactory());
    }

    @Test
    public void testSatisfactoryMajCRow56() {
        GoodFastCheap gfc = new GoodFastCheap();

        // Test row 5
        gfc.fast = true;
        gfc.cheap = true;
        assertTrue(gfc.satisfactory());

        // Test row 6
        gfc.cheap = false;
        assertFalse(gfc.satisfactory());
    }

}

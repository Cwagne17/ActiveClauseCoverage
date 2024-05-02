package class_exercise_10;

import static org.junit.Assert.*;

import org.junit.Test;

public class GoodFastCheapTest {
    @Test
    public void test2() {
        GoodFastCheap gfc = new GoodFastCheap();
        gfc.makeGood();
        gfc.makeFast();
        assertTrue(gfc.satisfactory());
    }

    @Test
    public void test3() {
        GoodFastCheap gfc = new GoodFastCheap();
        gfc.makeGood();
        gfc.makeCheap();
        assertTrue(gfc.satisfactory());
    }

    @Test
    public void test4() {
        GoodFastCheap gfc = new GoodFastCheap();
        gfc.makeGood();
        assertFalse(gfc.satisfactory());
    }

    @Test
    public void test6() {
        GoodFastCheap gfc = new GoodFastCheap();
        gfc.makeFast();
        assertFalse(gfc.satisfactory());
    }

}

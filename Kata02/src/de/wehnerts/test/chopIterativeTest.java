package de.wehnerts.test;

import org.junit.jupiter.api.Test;

import static de.wehnerts.tdd.chopIterative.chop;
import static org.junit.jupiter.api.Assertions.*;

class chopIterativeTest {

    @Test
    void testChop_numberIsinArray() {

        assertEquals(0, chop(new int[]{1}, 1));

        assertEquals(0, chop(new int[]{1,3,5}, 1));
        assertEquals(1, chop(new int[]{1,3,5}, 3));
        assertEquals(2, chop(new int[]{1,3,5}, 5));

        assertEquals(0, chop(new int[]{1,3,5,7}, 1));
        assertEquals(1, chop(new int[]{1,3,5,7}, 3));
        assertEquals(2, chop(new int[]{1,3,5,7}, 5));
        assertEquals(3, chop(new int[]{1,3,5,7}, 7));


    }
    @Test
    void testChop_numberIsNOTinArray() {
        assertEquals(-1, chop(new int[]{}, 2));
        assertEquals(-1, chop(new int[]{1}, 2));
        assertEquals(-1, chop(new int[]{1,3,5}, 2));

    }
}
package seminars.third.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberInIntervalTest {

    @Test
    void testInInterval() {
        assertTrue(MainHW.numberInInterval(26));
    }

    @Test
    void testIsNotInterval() {
        assertFalse(MainHW.numberInInterval(24));
    }

    @Test
    void testIsNumMoreThanInterval() {
        assertFalse(MainHW.numberInInterval(101));
    }
}
package seminars.third.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EvenOddNimberTest {

    @Test
    void testEvenNumber() {
        assertTrue(MainHW.evenOddNumber(6));
    }

    @Test
    void testOddNumber() {
        assertFalse(MainHW.evenOddNumber(3));
    }
}
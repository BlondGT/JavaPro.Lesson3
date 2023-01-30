package ua.ithillel.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {


    @Test
    void shouldReverseString() {

        assertEquals("elppa", Reverse.stringReverse("apple"));
    }

    @Test
    void shouldNotReverseString() {

        assertNotEquals("people", Reverse.stringReverse("people"));
    }
}

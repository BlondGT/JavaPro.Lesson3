package ua.ithillel.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymbolTest {

    @Test
    void shouldFindSymbol() {

        assertEquals(2, Symbol.findSymbolOccurrence("hello", 'l'));
    }

    @Test
    void shouldNotFindSymbol() {

        assertEquals(0, Symbol.findSymbolOccurrence("hello", 'w'));
    }
}
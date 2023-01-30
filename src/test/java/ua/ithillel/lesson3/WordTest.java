package ua.ithillel.lesson3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void shouldFindWord() {

        int wordPosition = Word.findWordPosition("people", "eople");
        assertEquals(1, wordPosition);
    }

    @Test
    void shouldNotFindWord() {

        int wordPosition1 = Word.findWordPosition("apple", "olo");
        assertEquals(-1, wordPosition1);
    }

}
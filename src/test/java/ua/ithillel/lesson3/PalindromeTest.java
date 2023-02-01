package ua.ithillel.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void shouldIsPalindrome() {

        assertTrue(Palindrome.isPalindrome("ollo"));
    }

    @Test
    void shouldIsNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("lotus"));
    }

}
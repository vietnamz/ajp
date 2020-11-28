package org.vietnamz.isbn;

import static  org.junit.Assert.*;
import org.junit.Test;

public class ValidateISDNCheck {

    @Test
    public void checkAValidISBN() {
        IsbnValidator isbnValidator = new IsbnValidator();
        boolean result = isbnValidator.checkIsbn("1245566876");
        //assertTrue(result);
    }

    @Test
    public void checkAnInvalidISBN() {
        IsbnValidator isbnValidator = new IsbnValidator();
        boolean result = isbnValidator.checkIsbn("1245566877");
        assertFalse(result);
    }

    @Test(expected = NumberFormatException.class)
    public void nineDigitsISBNsAreNotAllowed() {
        IsbnValidator isbnValidator = new IsbnValidator();
        boolean result = isbnValidator.checkIsbn("123456789");
    }

    @Test()
    public void charactersISDBsAreNotAllowed() {
        IsbnValidator isbnValidator = new IsbnValidator();
        boolean result = isbnValidator.checkIsbn("aaaaaaaaaa");
    }
}

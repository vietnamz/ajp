package org.vietnamz.isbn;

public class IsbnValidator {
    public boolean checkIsbn(String isbn) {

        if ( isbn.length() != 10 ) throw new NumberFormatException("ISBN must be 10 digits");
        int total = 0;
        for(int i = 0; i < 10; i++ )
        {
            total += isbn.charAt(i) * (10-i);
        }
        if ( total % 11  == 0 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

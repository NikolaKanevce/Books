package model;

import enumeration.Format;
import enumeration.Type;

public class EBook extends Book {
    private Format format;
    private double size;


    public EBook(String ISBN, int publishYear, Author author) {
        super(ISBN, publishYear, Type.E_BOOK, author);
    }

    public EBook(String ISBN, int publishYear, Author author, Format format, double size) {
        super(ISBN, publishYear, Type.E_BOOK, author);
        this.format = format;
        this.size = size;
    }
}

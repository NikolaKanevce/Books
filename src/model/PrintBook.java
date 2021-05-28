package model;

import enumeration.Type;

public class PrintBook extends Book{
    private int numberOfPages;
    private double weight;


    public PrintBook(String ISBN, int publishYear, Author author) {
        super(ISBN, publishYear, Type.PRINT_COPY, author);
    }

    public PrintBook(String ISBN, int publishYear, Author author, int numberOfPages, double weight) {
        super(ISBN, publishYear, Type.PRINT_COPY, author);
        this.numberOfPages = numberOfPages;
        this.weight = weight;
    }


}

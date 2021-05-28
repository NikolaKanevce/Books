public abstract class Book {
    private String ISBN;
    private int publishYear;
    private Type type;
    private Author author;

    Book(String ISBN, int publishYear, Type type, Author author) {
        this.ISBN = ISBN;
        this.publishYear = publishYear;
        this.type = type;
        this.author = author;
    }


    int getPublishYear(){
        return this.publishYear;
    }

    @Override
    public String toString() {
        return this.ISBN;
    }

    Author getAuthor(){
        return this.author;
    }

    public Type getType() {
        return type;
    }
}

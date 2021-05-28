import java.util.*;
import java.util.stream.Collectors;

public class BooksHolder {
    private List<Book> books;

    public BooksHolder() {
        this.books = new ArrayList<>();
    }

    public BooksHolder(List<Book> books) {
        this.books = books;
    }

    private void addBook(Book book) {
        this.books.add(book);
    }

    private void addBooks(List<Book> books) {
        this.books.addAll(books);
    }

    public void printBooksSortedByYear() {
        System.out.println(this.books.stream().sorted(Comparator.comparing(Book::getPublishYear)).collect(Collectors.toList()));
    }

    public void printBooksByFirstLetterOfTheAuthorSurname(String letter) {
        List<Book> books;
        books = this.books.stream().filter(s->s.getAuthor().getSurname().startsWith(letter)).collect(Collectors.toList());
        System.out.println(books);
    }

    public void authorsWithSameDecadeAsBooks(){
        Set<Author> authors = new HashSet();
        List<Author> authorsInSameDecade = new ArrayList<>();
        books.forEach(s->authors.add(s.getAuthor()));
        for(Author author: authors){
            if(books.stream().filter(book-> book.getType().equals(Type.PRINT_COPY) &&
                    book.getPublishYear() >= (author.getBirthYear()/10)*10 &&
                    book.getPublishYear() <= ((author.getBirthYear()/10) * 10) + 10).count() > 0){
                authorsInSameDecade.add(author);
            }
        }
        System.out.println(authorsInSameDecade);
    }

    public void printAuthorsWithMoreThanThreeBooks(){
        Set<Author> authors = new HashSet();
        List<Author> authorsWithMoreThanThreeBooks = new ArrayList<>();
        books.forEach(s->authors.add(s.getAuthor()));
        for(Author author : authors){
            if(books.stream().filter(s->s.getAuthor().equals(author)).count() > 3){
                authorsWithMoreThanThreeBooks.add(author);
            }
        }
        System.out.println(authorsWithMoreThanThreeBooks);
    }

    public void getOldestAndNewestBook(){
        List<Book> listOfBooks = this.books.stream().sorted(Comparator.comparing(Book::getPublishYear)).collect(Collectors.toList());
        System.out.println("Oldest book is: ");
        System.out.println(listOfBooks.get(0));
        System.out.println("Newest book is: ");
        System.out.println(listOfBooks.get(listOfBooks.size()-1));
    }
}

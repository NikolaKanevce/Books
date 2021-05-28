import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Author author1 = new Author("Victor", "Hugo", 1802);
        Author author2 = new Author("Honore", "De Balzac", 1799);
        Author author3 = new Author("Jules", "Verne", 1828);
        Author author4 = new Author("Ivo", "Andric", 1892);

        books.add(new EBook("1", 1850, author1, Format.epub, 165));
        books.add(new PrintBook("2", 1819, author2, 150, 0.5));
        books.add(new EBook("3", 1870, author3, Format.html5, 600));
        books.add(new EBook("4", 1921, author4, Format.pdf, 452));
        books.add(new PrintBook("5", 1829, author2, 222, 1.5));
        books.add(new PrintBook("6", 1818, author2,350, 1));
        books.add(new PrintBook("5", 1829, author2, 222, 1.5));
        books.add(new PrintBook("6", 1818, author2,350, 1));

        BooksHolder booksHolder = new BooksHolder(books);

        booksHolder.printBooksSortedByYear();

        Scanner scanner = new Scanner(System.in);
        String letter = scanner.next();

        booksHolder.printBooksByFirstLetterOfTheAuthorSurname(letter);

        booksHolder.authorsWithSameDecadeAsBooks();

        booksHolder.printAuthorsWithMoreThanThreeBooks();

        booksHolder.getOldestAndNewestBook();
    }
}

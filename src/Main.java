import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("B", "A", 6));
        books.add(new Book("C", "D", 56));
        books.add(new Book("D", "B", 50));
        books.add(new Book("A", "A", 564));

        books.sort((Book o1, Book o2) -> {
                if (!o1.getTitle().equals(o2.getTitle())) {
                    return o1.getTitle().compareTo(o2.getTitle());
                }
                return o1.getAuthor().compareTo(o2.getAuthor());
        });

        System.out.println(books);

    }
}
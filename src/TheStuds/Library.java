package TheStuds;

public class Library {

    Book book0 = new Book("1234", "GitGreat", "2019");
    Book book1 = new Book("5678", "GitBETTER", "2020");
    Book book2 = new Book("2323", "GitGUT", "2021");

    public void showComparison() {
        System.out.println(compareISBN(book1, book2));
    }

    public boolean compareISBN(Book book1, Book book2) {
        return book1.getISBN().equals(book2.getISBN());
    }
}

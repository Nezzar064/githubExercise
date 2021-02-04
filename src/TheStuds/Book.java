package TheStuds;

public class Book {

    private String ISBN;
    private String title;
    private String publisherYear;

    public Book(String ISBN, String title, String publisherYear) {
        this.ISBN = ISBN;
        this.title = title;
        this.publisherYear = publisherYear;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(String publisherYear) {
        this.publisherYear = publisherYear;
    }
}

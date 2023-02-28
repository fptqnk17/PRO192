package model;

public final class Book implements Comparable<Book> {

    private String bookID;
    private String bookTitle;
    private String author;
    private int yearPublished;

    public Book() {
        this.bookID = this.bookTitle = this.author = "";
        this.yearPublished = 0;
    }

    public Book(String bookID, String bookTitle, String author, int yearPublished) {
        this.setBookID(bookID);
        this.setBookTitle(bookTitle);
        this.setAuthor(author);
        this.setYearPublished(yearPublished);
    }

    public String getBookID() {
        return bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setBookID(String bookID) {
        if (bookID != null && !bookID.isEmpty() && !bookID.isBlank()) {
            this.bookID = bookID.replaceAll("\\s+", " ").trim().toUpperCase();
        }
    }

    public void setBookTitle(String bookTitle) {
        if (bookTitle != null && !bookTitle.isEmpty() && !bookTitle.isBlank()) {
            this.bookTitle = bookTitle.replaceAll("\\s+", " ").trim();
        }
    }

    public void setAuthor(String author) {
        if (author != null && !author.isEmpty() && !author.isBlank()) {
            this.author = author.replaceAll("\\s+", " ").trim();
        }
    }

    public void setYearPublished(int yearPublished) {
        if (yearPublished >= 1900) {
            this.yearPublished = yearPublished;
        }
    }

    @Override
    public String toString() {
        return "Book{" + this.bookID + " - " + this.bookTitle + " - " + this.author + " - " + this.yearPublished + '}';
    }

    @Override
    public int compareTo(Book other) {
        return this.bookID.compareToIgnoreCase(other.bookID);
    }
}

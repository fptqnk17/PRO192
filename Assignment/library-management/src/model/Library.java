package model;

import java.io.*;
import java.util.*;
import java.util.Collections;
import java.util.function.Predicate;

import utils.Validation;
import utils.exception.LibraryFullException;

public final class Library extends ArrayList<Book> {

    public Library() {
        super();

        this.loadDataFromFile();
    }

    public void listAllBooks() {
        this.listAllBooks(this);
    }

    public void listAllBooks(ArrayList<Book> list) {
        int total = list.size();

        if (total <= 0) {
            System.err.println("Sorry. Nothing to print.");

            return;
        }

        Collections.sort(list);

        System.out.println("List all books");
        System.out.println("--------------------------------");

        for (var book : list) {
            System.out.println(book);
        }

        System.out.println("--------------------------------");
        System.out.println("Total: " + total + " books.");
    }

    public void addNewBook() throws LibraryFullException {
        if (this.size() >= 10000) {
            throw new LibraryFullException("The library can only hold 10,000 books and is full.");
        }

        System.out.println("Add new book");
        System.out.println("--------------------------------");

        String newBookID = null;
        String newBookTitle = null;
        String newAuthor = null;
        int newYearPublished = 0;

        while (true) {
            newBookID = Validation.getString("Enter Book ID (st. ID B0000): ", "[bB][\\d]{4}");

            if (!this.isBookIDDuplicated(newBookID)) {
                break;
            }
        }

        newBookTitle = Validation.getString("Enter Book Title: ");
        newAuthor = Validation.getString("Enter Author: ");
        newYearPublished = Validation.getInt("Enter Year Published: ", 1900, Integer.MAX_VALUE);

        this.add(new Book(newBookID, newBookTitle, newAuthor, newYearPublished));
    }

    private boolean isBookIDDuplicated(String bookID) {
        bookID = bookID.trim().toUpperCase();

        for (Book book : this) {
            if (book.getBookID().equalsIgnoreCase(bookID)) {
                return true;
            }
        }

        return false;
    }

    private void loadDataFromFile() {
        File file = new File("libs.txt");

        try {
            Object[] lines = new BufferedReader(new FileReader(file)).lines().toArray();

            for (var line : lines) {
                String[] row = line.toString().split(":");

                try {
                    int yearPublished = Integer.parseInt(row[3]);

                    this.add(new Book(row[0], row[1], row[2], yearPublished));
                } catch (NumberFormatException ex) {
                }
            }

        } catch (FileNotFoundException ex) {
        }
    }

    public ArrayList<Book> search(Predicate<Book> predicate) {
        ArrayList<Book> list = new ArrayList<>();

        for (Book book : this) {
            if (predicate.test(book)) {
                list.add(book);
            }
        }
        if (list.isEmpty()) {
            System.err.println("Can not not found.");
        }

        return list;
    }
}

package view;

import model.Library;
import utils.Validation;
import utils.exception.LibraryFullException;

public final class LibraryManagement extends Menu<String> {

    private static String[] options = {
        "List all books",
        "Search book",
        "Add new book",
        "Exit"
    };

    private Library library;

    public LibraryManagement() {
    }

    public LibraryManagement(String title, String[] options, Library library) {
        super(title, options);

        this.library = library;
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1 -> {
                this.library.listAllBooks();
            }

            case 2 -> {
                this.search();
            }

            case 3 -> {
                try {
                    this.library.addNewBook();
                } catch (LibraryFullException ex) {
                    System.err.println("A problem occured: " + ex);
                }
            }

            case 4 -> {
                this.stop();
            }
        }
    }

    private void search() {
        String[] searchOptions = {
            "Find by BookID",
            "Find by Title",
            "Find by Author",
            "Find by Year of publishing",
            "Return"
        };

        new Menu<String>("Book Searching", searchOptions) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1 -> {
                        String bookID = Validation.getString("Enter Book ID (st. ID B0000): ", "[bB][\\d]{4}");

                        library.listAllBooks(library.search(predicate -> predicate.getBookID().equalsIgnoreCase(bookID)));
                    }

                    case 2 -> {
                        String bookTitle = Validation.getString("Enter Book Title: ");

                        library.listAllBooks(library.search(predicate -> predicate.getBookTitle().toLowerCase().contains(bookTitle.toLowerCase())));
                    }

                    case 3 -> {
                        String author = Validation.getString("Enter Author: ");

                        library.listAllBooks(library.search(predicate -> predicate.getAuthor().toLowerCase().contains(author.toLowerCase())));
                    }

                    case 4 -> {
                        int yearPublished = Validation.getInt("Enter Year Published: ", 1900, Integer.MAX_VALUE);

                        library.listAllBooks(library.search(predicate -> predicate.getYearPublished() == yearPublished));
                    }

                    default -> {
                        this.stop();
                    }
                }
            }
        }.run();
    }

    public static void main(String[] args) {
        new LibraryManagement("Library Management", options, new Library()).run();
    }
}

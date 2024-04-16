package test;
import application.Book;
import application.Library;
import application.Journal;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add resources to the library
        Book book1 = new Book("Atomics Habits", "James Clear");
        Book book2 = new Book("Rich & Poor Dad", "Robert Kyousaki");
        library.addResource(book1);
        library.addResource(book2);
        
        Journal journal1 = new Journal("New World",123);
        Journal journal2 = new Journal("Morocco News",326);

        library.addResource(journal1);
        library.addResource(journal2);

        // Consult a resource
        library.consultResource(3);
        
        // Borrow a resource
        library.borrowResource(1);

        // Return a resource
        library.returnResource(1);

        //Verify that the system is working correctly
        //System.out.println("Is the first book borrowed? " + library.resources.get(0).isBorrowing());
    }
}


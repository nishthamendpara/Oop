class BookNotAvailableException extends Exception {
    BookNotAvailableException(String message) {
        super(message);
    }
}

class Library {
    int availableBooks;

    Library(int books) {
        availableBooks = books;
    }

    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

public class Pr21 {
    public static void main(String[] args) {

        Library lib = new Library(3);

        try {
            lib.issueBook(2);
            lib.issueBook(2);
        } 
        catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}//output
//Book issued successfully
//Exception: Requested books not available

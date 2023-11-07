import java.util.ArrayList;

/**
 * This class represents a member to the Library and holds basic information about the member,
 * and performs tasks such as borrowing a book and printing details.
 *
 * @author (Patrick Lapke)
 * @version (12/01/2022)
 */
public class LibraryMember extends Visitor {
    int idNumber;
    ArrayList<Books> borrowedBooks;
    ArrayList<String> messages;
    
    /**
     * Constructor the objects of class LibraryMember
     * 
     * @param fName   The first name of the member.
     * @param lName   The last name of the member.
     * @param mail    The email of the member.
     * @param idNum   The id number of the member.
     */
    public LibraryMember(String fName, String lName, String mail, int idNum) {
        super(fName, lName, mail);
        idNumber = idNum;
        borrowedBooks = new ArrayList<>();
        messages = new ArrayList<>();
    }
    
    /**
     * Return the id number of the member.
     * 
     * @return  The members id number.
     */
    public int getIdNumber() {
        return idNumber;
    }
    
    /**
     * Return the books of the member.
     * 
     * @return  The books of the member.
     */
    public ArrayList<Books> getBorrowedBooks() {
        return borrowedBooks;
    }
    
    /**
     * Return the messages sent to the member.
     * 
     * @return  The messages sent to the member.
     */
    public ArrayList<String> getMessages() {
        return messages;
    }
    
    /**
     * Set the new id number or the member.
     * 
     * @param idNum  The new id number.
     */
    public void setIdNumber(int idNum) {
        idNumber = idNum;
    }
    
    /**
     * Set the new list of borrowed books.
     * 
     * @param book  The new list of borrowed books.
     */
    public void setBooksList(Books book) {
        if (book == null) {
            System.out.println("Book cannot be null");
        } else {
            borrowedBooks.add(book);
        }
    }
    
    /**
     * 
     */
    public void setMessages(String msg) {
        if (msg == null) {
            System.out.println("Message cannot be null");
        } else {
            messages.add(msg);
        }
    }
    
    /**
     * Prints all details of a member.
     */
    public void printMemberDetails() {
        printVisitorInfo();
        if (borrowedBooks.isEmpty()) {
            System.out.println("No currently borrowed books");
        } else {
            System.out.println("Currently borrowed books: ");
            for (Books book : borrowedBooks) {
                book.printResourceDetails();
            }
        }
    }
    
    /**
     * Loans a book to the member if they do not already have it on loan.
     * 
     * @param book  The book to be loaned.
     */
    
    public void addBook(Books book) {
        if (book == null) {
            System.out.println("Book cannot be null");
        } else if (borrowedBooks.contains(book)) {
            System.out.println("Book already in your borrowed list");
        } else {
            borrowedBooks.add(book);
            System.out.println("Book added successfully");
        }
    }
    
    /**
     * Checks if a member has any borrowed books.
     * 
     * @return  True if they do not have any borrowed books.
     * @return  False if they have borrowed books.
     */
    
    public boolean isBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            return false; 
        } else {
            return true;
        }
    }
    
    /**
     * Prints all details of each book a member holds, if they hold none, lets them know
     * they do not have any books on loan.
     */
    public void printAllBookDetails() {
        if (isBorrowedBooks()) {
            System.out.println("No borrowed books currently");
        } else {
                for (Books book : borrowedBooks) {
                book.printResourceDetails();
            }
        }
    }
    
    /**
     * Prints all messages sent to the member plus the number of total messages.
     */
    public void printMessages() {
        if (isBorrowedBooks()) {
            System.out.println("No messages currently");
        } else {
            int counter = 1;
            for (String message : messages) {
                System.out.println("Message " + counter + " " + message);
                counter += 1;
            }
        }
    }
    
    /**
     * Prints the number of books borrowed by a member.
     */
    public void printNumOfBorrowedBooks() {
        if (isBorrowedBooks()) {
            System.out.println("Current books borrowed: 0");
        } else {
            int counter = 0;
            for (Books book : borrowedBooks) {
                counter += 1;
            }
            System.out.println("Current books borrowed: " + counter);
        }
    }
    
    /**
     * Add a message to the members list of recieved messages.
     * 
     * @param msg  The message to be sent.
     */
    public void addMessage(String msg) {
        if (msg == null) {
            System.out.println("Message cannot be null");
        } else {
            messages.add(msg);   
        }
    }
    
}

import java.util.ArrayList;
/**
 * This class represents a physical book in the library. It holds data such as the isbn number,
 * a Library Member that currently holds this book, and any damages to it.
 *
 * @author (Patrick Lapke)
 * @version (12/01/2022)
 */
public class Books extends Resource {
    private int isbnNum;
    private LibraryMember member;
    private ArrayList<String> damages;
    
    /**
     * Constructor for the objects of Books.
     * 
     * @param resTitle   The title of the book.
     * @param resAuthor  The author of the book.
     * @param isbn       The ISBN number of the book.
     */
    public Books(String resTitle, String resAuthor, int isbn) {
        super(resTitle,resAuthor);
        isbnNum = isbn;
        damages = new ArrayList<>();
    }
    
    /**
     * Return the ISBN number of the book.
     * 
     * @return  The books ISBN number.
     */
    public int getIsbnNum() {
        return isbnNum;
    }
    
    /**
     * Return the member that holds this book, or null if it is unloaned.
     * 
     * @return  Null or the member that holds the book.
     */
    public LibraryMember getMember() {
        return member;
    }
    
    /**
     * Return the damages of the book.
     * 
     * @return  The books damages.
     */
    public ArrayList<String> getDamages() {
        return damages;
    }
    
    /**
     * Set the new ISBN number.
     * 
     * @param num  New ISBN number. 
     */
    public void setIsbnNum(int num) {
        isbnNum = num;
    }
    
    /**
     * Set the new Library Member.
     * 
     * @param newMember  The new Library Member. 
     */
    public void setMember(LibraryMember newMember) {
        member = newMember;
        }
    
    /**
     * Set the new damages of the book.
     * 
     * @param newDamages  The new damages. Cannot be null.
     */
    public void setDamage(String newDamages) {
        if (newDamages == null) {
            System.out.println("The damages cannot be null");
        } else {
            damages.add(newDamages);
        }
    }
    
    /**
     * Checks availability of a book.
     * 
     * @return  True if nobody is loaning the book.
     * @return  False if a member is loaning the book. 
     */
    
    public boolean isAvailable() {
        if (member == null) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Prints the details of a book.
     */
    public void printResourceDetails() {
        super.printResourceDetails();
        System.out.println("ISBN number: " + isbnNum);
        if (damages.isEmpty()) {
            System.out.println("Damages: No damages");
        } else {
            for (String damage : damages) {
                System.out.println(damage);
            }
        }
    }
}



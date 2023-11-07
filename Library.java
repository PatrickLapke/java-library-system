import java.util.ArrayList;
/**
 * This class stores information about a library. It is able to store a catalogue filled with
 * Physical books and Electronic Resources and maintain a list of members of the library.
 *
 * @author (Patrick Lapke)
 * @version (12/01/2022)
 */
public class Library
{
    private String nameOfLibrary;
    private String address;
    private ArrayList<Resource> catalogue;
    private ArrayList<LibraryMember> members;
    
    /**
     * Constructor for objects of class Library.
     * 
     * @param name                The name is the Library.
     * @param addressOfLibrary    The address of the Library.
     */

    public Library(String name, String addressOfLibrary) {
        nameOfLibrary = name;
        address = addressOfLibrary;
        catalogue = new ArrayList<>();
        members = new ArrayList<>();
    }
    
    /**
     * Return the name of the Library.
     * 
     * @return  The name of the Library.
     */
    public String getNameOfLib() {
        return nameOfLibrary;
    }
    
    /**
     * Return the address of the Library.
     * 
     * @return  The address of the Library.
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * Return the ArrayList filled with Resource objects named catalogue.
     * 
     * @return  The catalogue of the Library as an ArrayList.
     */
    public ArrayList<Resource> getCatalogue() {
        return catalogue;
    }
    
    /**
     * Return the ArrayList filled with LibraryMember objects named members.
     * 
     * @return  The members of the Library as an ArrayList.
     */
    public ArrayList<LibraryMember> getMembers() {
        return members;
    }
    
    /**
     * Set the new name of the Library
     * 
     * @param newName The new Library name. Cannot be null.
     */
    public void setNewNameOfLibrary(String newName) {
        if (newName == null) {
            System.out.println("The new Library name cannot be null");
        } else {
            nameOfLibrary = newName;
        }
    }
    
    /**
     * Set the new address of the Library
     * 
     * @param newAddress  The new Library address. Cannot be null.
     */
    public void setNewAddress(String newAddress) {
        if (newAddress == null) {
            System.out.println("Address cannot be null");
        } else {
            address = newAddress;
        }
    }
    
    /**
     * Add a member to the list of members.
     * 
     * @param member  A Library Member. Cannot be null.
     */
    public void addMembers(LibraryMember member) {
        if (member == null) {
            System.out.println("Member cannot be null");
        } else if (members.contains(member)) {
            System.out.println("Member is already in the list");
        } else {
            members.add(member);
        }
    }
    /**
     * Print the current state of the Library.
     */
    
    public void printLibraryDetails() {
        System.out.println("Library Name: " + nameOfLibrary);
        System.out.println("Library Address: " + address);
        for (Resource resource : catalogue) {
            if (resource instanceof Books) {
                System.out.println("Book details: ");
                resource.printResourceDetails();
            }
            if (resource instanceof ElectronicResource) {
                System.out.println("Electronic Resource details: ");
                resource.printResourceDetails();
            }
        }
    }
    /**
     * Check the catalogue to see if a specific resource is inside it.
     * 
     * @param resource    The resource to be checked. Cannot be null.
     * @return        A boolean true if the resource is in the catalogue, false if it is not.
     */
    
    public boolean isInCatalogue(Resource resource) {
        if (catalogue.contains(resource)) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Change the title of a resource if it is in the catalogue.
     * 
     * @param newTitle  The resource to be checked and a String of the new title. 
     *                  Title cannot be null. 
     */
    
    public void changeTitle(Resource resource, String newTitle) {
        if (isInCatalogue(resource) && newTitle != null) {
            resource.setTitle(newTitle);
            System.out.println("Resource title changed");
        } else {
            System.out.println("Resource not in catalogue");
        }
    }
    
    /**
     * Searches the catalogue by title and if a match is found, prints all details of each
     * match and prints the total number of matches found.
     * 
     * @param title  The title to search
     */
    
    public void searchCatalogueTitle(String title) {
        int counter = 0;
        for (Resource resource : catalogue) {
            if (resource.getTitle() == title) {
                counter += 1;
                if (resource instanceof Books) {
                    resource.printResourceDetails();
                }
                if (resource instanceof ElectronicResource) {
                    resource.printResourceDetails();
                }
                System.out.println("Total resources found with same title " + counter);
            } else {
                System.out.println("No match");
            }
        }
    }
    
    /**
     * Searches the catalogue by author and if a match is found, prints all details of each
     * match and prints the total number of matches found.
     * 
     * @param author  The author to search
     */
    
    public void searchCatalogueAuthor(String author) {
        int counter = 0;
        for (Resource resource : catalogue) {
            if (resource.getAuthor() == author) {
                counter += 1;
                if (resource instanceof Books) {
                    resource.printResourceDetails();
                }
                if (resource instanceof ElectronicResource) {
                    resource.printResourceDetails();
                }
                System.out.println("Total resources found with same author " + counter);
            } else {
                System.out.println("No match");
            }
        }
    }
    
    /**
     * Removes a resource from the catalogue if found.
     * 
     * @param resource  The resource object to be removed.
     */
    
    public void removeItem(Resource resource) {
        if (resource != null && isInCatalogue(resource)) {
            catalogue.remove(resource);
            System.out.println("Resource removed from the catalogue");
        } else {
            System.out.println("Resource is not in the catalogue");
        }
    }
    
    /**
     * Removes a resource object at a specific index if the object is if the catalogue,
     * and if the index is in range.
     * 
     * @param index  The resource object to be removed.
     */
    
    public void removeSpecificItem(int index) {
        if (index < catalogue.size() && index >= 0) {
            catalogue.remove(index);
            System.out.println("Object at " + index + " is removed");
        } else {
            System.out.println("Resource not found or index out of range");
        }
    }
    
    /**
     * Prints all details of all unloaned physical books.
     */
    
    public void printUnloanedBooks() {
        for (Resource resource : catalogue) {
            if (resource instanceof Books) {
                Books book = (Books) resource;
                if (book.getMember() == null) {
                    book.printResourceDetails();
                }
            }
        }
    }
    
    /**
     * Returns all the available resources in the catalogue.
     * 
     * @return  Returns an int that is the number of all available resources.
     */
    
    public int numOfResources() {
        return catalogue.size();
    }
    
    /**
     * Adds a resource object to the catalogue.
     * 
     * @param resource  The resource object to be added. Cannot be null.
     */
    
    public void addResource(Resource resource) {
        if (isInCatalogue(resource)) {
            System.out.println("Resource already in catalogue");
        } else if (resource == null) {
            System.out.println("Resource cannot be null");
        }else {
            catalogue.add(resource);
            System.out.println("Resource added to the catalogue");
        }
    }
    
    /**
     * Lends out a book object to a member of the Library if it is in the catalogue, another
     * member does not have it, and if the member does not already have 5 borrowed books.
     * 
     * @param book  The book to be lent. Cannot be null.
     * @param member  The member that is requesting the book. Cannot be null.
     */
    
    public void lendBook(Books book, LibraryMember member) {
        if (book == null || member == null) {
            System.out.println("Cannot have a null paramter");
        }
        if (!catalogue.contains(book)) {
            System.out.println("Book is not in the catalogue");
        } else if (member.getBorrowedBooks().size() == 5) {
            System.out.println("Borrowed books is equal to 5, exiting");
            
        } else if (book.getMember() != null) {
            System.out.println("Book already lent to another member");
        } else {
            book.setMember(member);
            member.addBook(book); 
        }
    }
    
    /**
     * Return a book to the library if the book is in the catalogue and records any
     * damage to the book.
     * 
     * @param book   The book object to return. Cannot be null.
     * @param isDmg  A boolean to convey damage to the book.
     * @param dmg    Written damage of the kind of damage. Cannot be null.
     */
    
    public void returnBook(Books book, boolean isDmg, String dmg) {
        if (book == null || dmg == null) {
            System.out.println("The book or the damage cannot be null");
        } else if (!catalogue.contains(book)) {
            System.out.println("Book is not in the catalogue");
        } else {
           book.setMember(null);
           if (!dmg.isEmpty()) {
               book.setDamage(dmg);
              }
           }
        }
    
    /**
     * Send a message to all members.
     * 
     * @param msg  The message to be sent.
     */
    
    public void sendMessage(String msg) {
        if (msg == null) {
            System.out.println("Message cannot be null");
        } else {
            for (LibraryMember member : members) {
                if (member.getBorrowedBooks() != null) {
                    ArrayList<Books> books = member.getBorrowedBooks();
                    for (Books book : books) {
                        if (isInCatalogue(book)) {
                            member.setMessages(msg);
                        }
                    }
                }
            }
        }
    }
    
    /**
     * Print all books in the catalogue.
     */
    
    public void printBookDetails() {
        for (Resource resource : catalogue) {
            if (resource instanceof Books) {
                resource.printResourceDetails();
            }
        }
    }
    
    /**
     * Print all Electronic Resources in the catalogue.
     */
    
    public void printElectronicResourceDetails() {
        for (Resource resource : catalogue) {
            if (resource instanceof ElectronicResource) {
                resource.printResourceDetails();
            }
        }
    }
}

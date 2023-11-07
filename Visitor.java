
/**
 * This class represents a Visitor to the library and is a superclass to both Guests and Members
 * of the Library. It holds basic info about the Visitor that relates to their identity, and
 * performs basic tasks such as printing a Visitors information.
 *
 * @author (Patrick Lapke)
 * @version (12/01/2022)
 */
public class Visitor
{
    private String firstName;
    private String lastName;
    private String email;
    
    /**
     * Constructor the objects of class Visitor
     * 
     * @param fName  The first name of the Visitor.
     * @param lName  The last name of the Visitor.
     * @param mail   The email of the Visitor.
     */
    public Visitor(String fName, String lName, String mail) {
        firstName = fName;
        lastName = lName;
        email = mail;
    }
    
    /**
     * Return the Visitors first name.
     * 
     * @return  The Visitors first name.
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Return the Visitors last name.
     * 
     * @return  The Visitors last name.
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Return the Visitors email address.
     * 
     * @return  The Visitors email address.
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Set the new Visitors first name.
     * 
     * @param newFirstName  The Visitors new first name.
     */
    public void setFirstName(String newFirstName) {
        if (newFirstName == null) {
            System.out.println("First name cannot be null");
        } else {
            firstName = newFirstName;
        }
    }
    
    /**
     * Set the Visitors new last name.
     * 
     * @param newLastName  The Visitors new last name.
     */
    public void setLastName(String newLastName) {
        if (newLastName == null) {
            System.out.println("Last name cannot be null");
        } else {
            lastName = newLastName;
        }
    }
    
    /**
     * Set the Visitors new email adress.
     * 
     * @param newEmail  The Visitors new email address.
     */
    public void setEmail(String newEmail) {
        if (newEmail == null) {
            System.out.println("Email cannot be null");
        } else {
            email = newEmail;
        }
    }
    
    /**
     * Prints the basic information of the Visitor.
     */
    
    public void printVisitorInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Email: " + email);
    }
}

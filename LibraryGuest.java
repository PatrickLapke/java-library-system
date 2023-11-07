
/**
 * This class represents guests to the Library and holds basic information such as their 
 * access days and performs basic tasks like updating their access days.
 *
 * @author (Patrick Lapke)
 * @version (12/01/2022)
 */
public class LibraryGuest extends Visitor
{
    int daysOfAccess;
    
    /**
     * Constructor for objects of class LibraryGuest.
     * 
     * @param fName       The first name of the guest.
     * @param lName       The last name of the guest.
     * @param mail        The email of the guest.
     * @param accessDays  The number of access days available for the guest.
     */
    public LibraryGuest(String fName, String lName, String mail, int accessDays) {
        super(fName, lName, mail);
        if (accessDays <= 3 && accessDays >= 0) {
            daysOfAccess = accessDays;
        } else {
            System.out.println("Days cannot be greater than 3, access days will be 0");
        }
    }
    
    /**
     * Return the guests access days.
     * 
     * @return  The number of access days.
     */
    public int getDaysOfAccess() {
        return daysOfAccess;
    }
    
    /**
     * Sets the new days of access.
     * 
     * @param newDaysOfAccess  The new days of access.
     */
    public void setDaysOfAccess(int newDaysOfAccess) {
        if (newDaysOfAccess <= 3 && newDaysOfAccess >= 0) {
            daysOfAccess = newDaysOfAccess;
            System.out.println("Days of access set successfully");
        } else {
            System.out.println("Updated days of access must be 3 days or less");
        }
    }
}

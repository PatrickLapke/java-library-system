
/**
 * A superclass to both the Books class and ElectronicResource class. Holds data included
 * in both subclasses and performs basic tasks such as printing details.
 *
 * @author (Patrick Lapke)
 * @version (12/01/2022)
 */
public class Resource
{
    private String title;
    private String author;
    
    /**
     * Constructor for the objects of class Resource.
     * 
     * @param resTitle   The title of the resource.
     * @param resAuthor  The author of the resource.
     */
    public Resource(String resTitle, String resAuthor) {
        title = resTitle;
        author = resAuthor;
    }
    
    //Getter Methods
    
    /**
     * Return the title of the resource.
     * 
     * @return  The Resources title.
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Return the author of the resource.
     * 
     * @return  The Resources author.
     */
    public String getAuthor() {
        return author;
    }
    /**
     * Set the new title of a resource.
     * 
     * @param newTitle  The new title.
     */
    
    public void setTitle(String newTitle) {
        if (newTitle == null) {
            System.out.println("Title cannot be null");
        } else {
            title = newTitle;
        }
    }
    
    /**
     * Set the new author of a resource.
     * 
     * @param newAuthor  The new author.
     */
    public void setAuthor(String newAuthor) {
        if (newAuthor == null) {
            System.out.println("Author cannot be null");
        } else {
            author = newAuthor;
        }
    }
    
    /**
     * Prints all details of a resource.
     */
    public void printResourceDetails() {
        System.out.println("Resource Title: " + title);
        System.out.println("Resource Author: " + author);
        }
}

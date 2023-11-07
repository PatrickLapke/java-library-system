
/**
 * This class represents an Electronic Resource at the library and holds basic data such as the
 * ability to download it and performs basic tasks such as printing details.
 *
 * @author (Patrick Lapke)
 * @version (12/01/2022)
 */
public class ElectronicResource extends Resource
{
    private boolean downloadable;
    
    /**
     * Constructor for objects of class ElectronicResource.
     * 
     * @param resTitle     The title of the Electronic Resource.
     * @param resAuthor    The author of the Electronic Resource.
     * @param canDownload  The ability to download the Electronic Resource. 
     */
    public ElectronicResource(String resTitle, String resAuthor, boolean canDownload) {
        super(resTitle,resAuthor);
        downloadable = canDownload;
    }
    /**
     * Return the downloadability of the Electronic Resource.
     * 
     * @return  The downloadability of the Electronic Resource as a boolean.
     */
    
    public boolean getDownloadable() {
        return downloadable;
    }
    //Setter Methods
    
    public void setDownloadable(boolean isDownloadable) {
        downloadable = isDownloadable;
    }
    /**
     * Prints all details of a Electronic Resource.
     */
    
    public void printResourceDetails() {
        super.printResourceDetails();
        if (downloadable == false) {
            System.out.println("Electronic Resource not downloadable");
        } else {
            System.out.println("Electronic Resource is downloadable");
        }
    }
}

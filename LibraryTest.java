

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LibraryTest.
 *
 * @author  (Patrick Lapke)
 * @version (12/05/2022)
 */
public class LibraryTest
{
    private Library library1;
    private Books books1;
    private Books books2;
    private Books books3;
    private Books books4;
    private Books books5;
    private Books books6;
    private Books books7;
    private LibraryMember libraryM1;
    private LibraryMember libraryM2;

    
    
    
    
    

    
    
    
    
    
    
    
    
    
    

    
    /**
     * Default constructor for test class LibraryTest
     */
    public LibraryTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        library1 = new Library("Boston", "boston stree");
        books1 = new Books("1", "2", 31);
        books2 = new Books("1", "2", 566);
        books3 = new Books("6", "5", 252);
        books4 = new Books("tt", "yy", 2342);
        books5 = new Books("66", "523", 743);
        books6 = new Books("2352", "234", 1241);
        books7 = new Books("2352", "423", 2425);
        libraryM1 = new LibraryMember("Bob", "fitzer", "@", 241);
        libraryM2 = new LibraryMember("Patrick", "Lapke", "@", 1231);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void TestConstructor()
    {
        assertEquals("boston stree", library1.getAddress());
        assertNotNull(library1.getCatalogue());
        assertNotNull(library1.getMembers());
        assertEquals("Boston", library1.getNameOfLib());
    }


    @Test
    public void TestIsInCatalogue()
    {
        Resource resource1 = new Resource("Dogs", "Bob Fitzer");
        assertEquals(false, library1.isInCatalogue(resource1));
        library1.addResource(resource1);
        assertEquals(true, library1.isInCatalogue(resource1));
    }

    @Test
    public void TestChangeTitle()
    {
        Books books1 = new Books("Cat", "Bob", 1);
        library1.addResource(books1);
        library1.changeTitle(books1, null);
        assertEquals("Cat", books1.getTitle());
        library1.changeTitle(books1, "Dog");
        assertEquals("Dog", books1.getTitle());
    }

    @Test
    public void TestSetNewNameOfLibrary()
    {
        library1.setNewNameOfLibrary("Patrick");
        assertEquals("Patrick", library1.getNameOfLib());
        library1.setNewNameOfLibrary(null);
        assertEquals("Patrick", library1.getNameOfLib());
    }

    @Test
    public void TestSetNewAddress()
    {
        library1.setNewAddress("Seattle");
        assertEquals("Seattle", library1.getAddress());
        library1.setNewAddress(null);
        assertEquals("Seattle", library1.getAddress());
    }

    @Test
    public void TestAddMembers()
    {
        LibraryMember libraryM1 = new LibraryMember("1", "1", "2", 3);
        library1.addMembers(libraryM1);
        assertEquals(1, library1.getMembers().size());
        library1.addMembers(libraryM1);
        assertEquals(1, library1.getMembers().size());
        LibraryMember libraryM2 = new LibraryMember("2", "3", "4", 3);
        library1.addMembers(libraryM2);
        assertEquals(2, library1.getMembers().size());
    }

    @Test
    public void TestRemoveItem()
    {
        library1.addResource(books1);
        library1.addResource(books2);
        assertEquals(2, library1.getCatalogue().size());
        library1.removeItem(books2);
        assertEquals(1, library1.getCatalogue().size());
        library1.removeItem(null);
        assertEquals(1, library1.getCatalogue().size());
        library1.removeItem(books1);
        assertEquals(0, library1.getCatalogue().size());
    }

    @Test
    public void RemoveSpecificItem()
    {
        library1.addResource(books1);
        library1.addResource(books2);
        assertEquals(2, library1.getCatalogue().size());
        library1.removeSpecificItem(-1);
        assertEquals(2, library1.getCatalogue().size());
        library1.removeSpecificItem(2);
        assertEquals(2, library1.getCatalogue().size());
        library1.removeSpecificItem(1);
        assertEquals(1, library1.getCatalogue().size());
        library1.removeSpecificItem(0);
        assertEquals(0, library1.getCatalogue().size());
    }

    @Test
    public void TestNumOfResources()
    {
        assertEquals(0, library1.numOfResources());
        library1.addResource(books1);
        assertEquals(1, library1.numOfResources());
        library1.addResource(books2);
        assertEquals(2, library1.numOfResources());
    }

    @Test
    public void TestAddResource()
    {
        library1.addResource(books1);
        assertEquals(1, library1.getCatalogue().size());
        library1.addResource(books1);
        assertEquals(1, library1.getCatalogue().size());
        library1.addResource(null);
        assertEquals(1, library1.getCatalogue().size());
        library1.addResource(books2);
        assertEquals(2, library1.getCatalogue().size());
    }

    @Test
    public void TestLendBooks()
    {
        Books books3 = new Books("1", "2", 3);
        Books books4 = new Books("3", "4", 5);
        Books books5 = new Books("7", "y", 77);
        Books books6 = new Books("9", "8", 66);
        Books books7 = new Books("5", "5", 44);
        LibraryMember libraryM1 = new LibraryMember("9", "9", "@", 5);
        library1.lendBook(books2, libraryM1);
    }

    
    

    @Test
    public void TestReturnBook()
    {
        library1.addResource(books1);
        library1.addResource(books2);
        library1.lendBook(books1, libraryM1);
        books1.getMember();
        assertNotNull(books1.getMember());
        library1.returnBook(books1, false, "");
        assertNull(books1.getMember());
        library1.lendBook(books1, libraryM1);
        library1.lendBook(null, libraryM2);
        library1.lendBook(books2, libraryM2);
        assertEquals(1, libraryM2.getBorrowedBooks().size());
        library1.returnBook(books2, true, "Water damage");
        assertEquals(1, books2.getDamages().size());
        assertEquals(null, books2.getMember());
    }

    @Test
    public void TestLendBook()
    {
        library1.addResource(books1);
        library1.addResource(books2);
        library1.addResource(books3);
        library1.addResource(books4);
        library1.addResource(books4);
        library1.addResource(books5);
        library1.addResource(books6);
        library1.addResource(books7);
        assertNull(books1.getMember());
        library1.lendBook(books1, libraryM1);
        assertNotNull(books1.getMember());
        assertEquals(1, libraryM1.getBorrowedBooks().size());
        library1.lendBook(books2, libraryM1);
        assertEquals(2, libraryM1.getBorrowedBooks().size());
        assertNotNull(books2.getMember());
        library1.lendBook(books1, libraryM1);
        assertEquals(2, libraryM1.getBorrowedBooks().size());
        library1.lendBook(null, libraryM1);
        assertEquals(2, libraryM1.getBorrowedBooks().size());
        library1.lendBook(books3, libraryM1);
        library1.lendBook(books4, libraryM1);
        library1.lendBook(books5, libraryM1);
        assertEquals(5, libraryM1.getBorrowedBooks().size());
        library1.lendBook(books7, libraryM1);
        assertEquals(5, libraryM1.getBorrowedBooks().size());
    }

    @Test
    public void TestSendMessage()
    {
        library1.addMembers(libraryM1);
        assertEquals(0, libraryM1.getMessages().size());
        library1.sendMessage("Hello");
        assertEquals(0, libraryM1.getMessages().size());
        libraryM1.addBook(books1);
        library1.sendMessage("Hello");
        assertEquals(0, libraryM1.getMessages().size());
        library1.addResource(books1);
        library1.sendMessage("Hello");
        assertEquals(1, libraryM1.getMessages().size());
        library1.sendMessage(null);
        assertEquals(1, libraryM1.getMessages().size());
        library1.addMembers(libraryM2);
        libraryM2.addBook(books2);
        library1.addResource(books2);
        library1.sendMessage("Goodbye");
        assertEquals(1, libraryM2.getMessages().size());
        assertEquals(2, libraryM1.getMessages().size());
    }
}

















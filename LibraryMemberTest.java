

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LibraryMemberTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LibraryMemberTest
{
    private LibraryMember libraryM1;
    private Books books1;

    

    /**
     * Default constructor for test class LibraryMemberTest
     */
    public LibraryMemberTest()
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
        libraryM1 = new LibraryMember("China", "Kanda", "@", 456);
        books1 = new Books("Dogs", "Bob Fitzer", 1);
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
    public void TestLibraryMemberConstructor()
    {
        assertNotNull(libraryM1.getBorrowedBooks());
        assertNotNull(libraryM1.getMessages());
        assertEquals(456, libraryM1.getIdNumber());
    }

    @Test
    public void TestAddBook()
    {
        libraryM1.addBook(null);
        assertEquals(0, libraryM1.getBorrowedBooks().size());
        libraryM1.addBook(books1);
        assertEquals(1, libraryM1.getBorrowedBooks().size());
        libraryM1.addBook(books1);
        assertEquals(1, libraryM1.getBorrowedBooks().size());
    }

    @Test
    public void TestIsBorrowedBooks()
    {
        assertEquals(false, libraryM1.isBorrowedBooks());
        libraryM1.addBook(books1);
        assertEquals(true, libraryM1.isBorrowedBooks());
    }

    @Test
    public void TestSetIdNumber()
    {
        libraryM1.setIdNumber(500);
        assertEquals(500, libraryM1.getIdNumber());
    }


    @Test
    public void TestSetBooksList()
    {
        libraryM1.setBooksList(books1);
        assertEquals(1, libraryM1.getBorrowedBooks().size());
    }

    @Test
    public void TestSetMessages()
    {
        libraryM1.setMessages("Hello");
        assertEquals(1, libraryM1.getMessages().size());
        libraryM1.setMessages(null);
        assertEquals(1, libraryM1.getMessages().size());
    }
}













import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class BooksTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BooksTest
{
    private Library library1;
    private LibraryMember libraryM1;
    private Books books1;

    

    /**
     * Default constructor for test class BooksTest
     */
    public BooksTest()
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
        library1 = new Library("Boston Library", "Boston Street");
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
    public void TestBooksConstructor()
    {
        assertEquals(1, books1.getIsbnNum());
        assertNull(books1.getMember());
        assertNotNull(books1.getDamages());
    }

    @Test
    public void TestIsAvailable()
    {
        assertEquals(true, books1.isAvailable());
        library1.addResource(books1);
        library1.lendBook(books1, libraryM1);
        assertEquals(false, books1.isAvailable());
    }


    @Test
    public void TestSetIsbnNum()
    {
        books1.setIsbnNum(11);
        assertEquals(11, books1.getIsbnNum());
    }

    @Test
    public void TestSetMember()
    {
        books1.setMember(libraryM1);
        assertEquals(libraryM1, books1.getMember());
    }

    @Test
    public void TestSetDamage()
    {
        books1.setDamage("Water Damage");
        assertEquals(1, books1.getDamages().size());
        books1.setDamage("Broken");
        assertEquals(2, books1.getDamages().size());
    }
}







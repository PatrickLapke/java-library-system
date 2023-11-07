

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LibraryGuestTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LibraryGuestTest
{
    private LibraryGuest libraryG1;

    /**
     * Default constructor for test class LibraryGuestTest
     */
    public LibraryGuestTest()
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
        libraryG1 = new LibraryGuest("China", "Kanda", "@", 3);
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
    public void TestSetDaysOfAccess()
    {
        libraryG1.setDaysOfAccess(10);
        assertEquals(3, libraryG1.getDaysOfAccess());
        libraryG1.setDaysOfAccess(1);
        assertEquals(1, libraryG1.getDaysOfAccess());
        LibraryGuest libraryG3 = new LibraryGuest("China", "Kanda", "@", -2);
        assertEquals(1, libraryG1.getDaysOfAccess());
    }

    @Test
    public void TestConstructor()
    {
        LibraryGuest libraryG2 = new LibraryGuest("China", "Kanda", "@", 10);
        LibraryGuest libraryG3 = new LibraryGuest("China", "Kanda", "@", -2);
        assertEquals(3, libraryG1.getDaysOfAccess());
        assertEquals(0, libraryG2.getDaysOfAccess());
        assertEquals(0, libraryG3.getDaysOfAccess());
    }
}




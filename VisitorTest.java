

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class VisitorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VisitorTest
{
    private Visitor visitor1;

    /**
     * Default constructor for test class VisitorTest
     */
    public VisitorTest()
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
        visitor1 = new Visitor("Chin", "Kanda", "@");
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
        assertEquals("Chin", visitor1.getFirstName());
        assertEquals("Kanda", visitor1.getLastName());
        assertEquals("@", visitor1.getEmail());
    }

    @Test
    public void TestSetFirstName()
    {
        visitor1.setFirstName("Korea");
        assertEquals("Korea", visitor1.getFirstName());
        visitor1.setFirstName(null);
        assertEquals("Korea", visitor1.getFirstName());
    }

    @Test
    public void TestSetLastName()
    {
        visitor1.setLastName("LastName");
        assertEquals("LastName", visitor1.getLastName());
        visitor1.setLastName(null);
        assertEquals("LastName", visitor1.getLastName());
    }

    @Test
    public void TestSetEmail()
    {
        visitor1.setEmail("@@@");
        assertEquals("@@@", visitor1.getEmail());
        visitor1.setEmail(null);
        assertEquals("@@@", visitor1.getEmail());
    }
}





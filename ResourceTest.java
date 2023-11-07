

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ResourceTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ResourceTest
{
    private Resource resource1;
    private Resource resource2;

    /**
     * Default constructor for test class ResourceTest
     */
    public ResourceTest()
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
        resource1 = new Resource("Dogs", "Bob Fitzer");
        
        resource2 = new Resource("Dogs", "Bob Fitzer");
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
    public void TestResourceConstructor()
    {
        assertEquals("Bob Fitzer", resource1.getAuthor());
        assertEquals("Dogs", resource1.getTitle());
    }

   

    @Test
    public void TestSetTitle()
    {
        resource1.setTitle("Apple");
        assertEquals("Apple", resource1.getTitle());
        resource1.setTitle(null);
        assertEquals("Apple", resource1.getTitle());
    }

    @Test
    public void TestSetAuthor()
    {
        resource1.setAuthor("Bob");
        assertEquals("Bob", resource1.getAuthor());
        resource1.setAuthor(null);
        assertEquals("Bob", resource1.getAuthor());
    }
}





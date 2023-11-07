

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ElectronicResourceTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ElectronicResourceTest
{
    private ElectronicResource electron1;

    /**
     * Default constructor for test class ElectronicResourceTest
     */
    public ElectronicResourceTest()
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
        electron1 = new ElectronicResource("Dogs", "Bob Fitzer", true);
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
        assertEquals(true, electron1.getDownloadable());
    }

    @Test
    public void TestIsDownloadable()
    {
        electron1.setDownloadable(false);
        assertEquals(false, electron1.getDownloadable());
    }
}



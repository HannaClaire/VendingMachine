import org.junit.Before;
import org.junit.Test;
import products.Sweets;

import static org.junit.Assert.assertEquals;

public class SweetsTest {
    Sweets sweets;

    @Before
    public void before(){
        sweets = new Sweets(65, "SWE");
    }
    @Test
    public void hasPrice(){
        assertEquals(65, sweets.getPrice());
    }
    @Test
    public void hasCode(){
        assertEquals("SWE", sweets.getCode());
    }
}


import org.junit.Before;
import org.junit.Test;
import products.Crisps;

import static org.junit.Assert.assertEquals;

public class CrispsTest {
    Crisps crisps;

    @Before
    public void before(){
        crisps = new Crisps(50, "CRP");
    }
    @Test
    public void hasPrice(){
        assertEquals(50, crisps.getPrice());
    }
    @Test
    public void hasCode(){
        assertEquals("CRP", crisps.getCode());
    }
}


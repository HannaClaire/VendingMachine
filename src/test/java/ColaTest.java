import org.junit.Before;
import org.junit.Test;
import products.Cola;

import static org.junit.Assert.assertEquals;

public class ColaTest {
//    int price;
//    String code;
//    int amount;
    Cola cola;

    @Before
    public void before(){
        cola = new Cola(100, "COL");
    }
    @Test
    public void hasPrice(){
        assertEquals(100, cola.getPrice());
    }
    @Test
    public void hasCode(){
        assertEquals("COL", cola.getCode());
    }



}

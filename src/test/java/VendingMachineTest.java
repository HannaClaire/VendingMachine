import org.junit.Before;
import org.junit.Test;
import products.Cola;
import products.Crisps;
import products.Product;
import products.Sweets;
import vendor.CoinType;
import vendor.VendingMachine;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    VendingMachine vendingMachine;
    HashMap<Product, Integer> products;
    HashMap<CoinType, Integer> coins;
    Cola cola;
    Cola cola2;
    Crisps crisps;
    Crisps crisps2;
    Sweets sweet;
    Sweets sweet2;
    int total;
    Product product;

    @Before
    public void before(){
        Product cola = new Cola(200, "COL");
        Product cola2 = new Cola(100, "COL");
        Product crisps = new Crisps(50, "CRP");
        Product crisps2 = new Crisps(50, "CRP");
        Product sweets = new Sweets(65, "SWE");
        Product sweets2 = new Sweets(65, "SWE");
        HashMap<Product, Integer> products = new HashMap<Product, Integer>();
        HashMap<CoinType, Integer> coins = new HashMap<>();
        vendingMachine = new VendingMachine(products, coins, total);
        vendingMachine.addProduct(cola, 1);
        vendingMachine.addProduct(cola2, 1);
        vendingMachine.addProduct(crisps, 1);
        vendingMachine.addProduct(crisps2, 1);
        vendingMachine.addProduct(sweets, 1);
        vendingMachine.addProduct(sweets2, 1);

    }
    @Test
    public void hasProducts(){
        assertEquals(6, vendingMachine.getProducts().size());
    }

    @Test
    public void acceptsValidCoins(){
        vendingMachine.insertCoin(CoinType.ONEPENCE, 1);
        vendingMachine.insertCoin(CoinType.TWOPENCE, 2);
        vendingMachine.insertCoin(CoinType.FIVEPENCE, 5);
        vendingMachine.insertCoin(CoinType.TENPENCE, 10);
        vendingMachine.insertCoin(CoinType.TWENTYPENCE, 20);
        vendingMachine.insertCoin(CoinType.FIFTYPENCE, 50);
        vendingMachine.insertCoin(CoinType.ONEPOUND, 100);
        assertEquals(5, vendingMachine.getCoins().size());
    }

    @Test
    public void canSumCoinsTotal(){
        vendingMachine.insertCoin(CoinType.TWENTYPENCE, 20);
        vendingMachine.insertCoin(CoinType.FIFTYPENCE, 50);
        vendingMachine.insertCoin(CoinType.ONEPOUND, 100);
        assertEquals(170, vendingMachine.getTotal());
    }
    @Test
    public void canVendItems(){
        vendingMachine.insertCoin(CoinType.ONEPOUND, 100);
        assertEquals(100, vendingMachine.getTotal());
        vendingMachine.dispenseProduct(cola, 1);
        assertEquals(1, vendingMachine.getCoins().size());
        assertEquals(5, vendingMachine.getProducts().size());
        assertEquals(0, vendingMachine.getTotal());

    }

}

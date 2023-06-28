package vendor;

import products.Product;

import java.util.HashMap;

public class VendingMachine {

    private HashMap<Product, Integer> products;
    private HashMap<CoinType, Integer> coins;
    private CoinType coinType;
    private int total;

    public VendingMachine(HashMap<Product, Integer> products, HashMap<CoinType, Integer> coins, int total){
        this.coins = coins;
        this.products = products;
        this.total = total;
    }
    public void setCoins(HashMap<CoinType, Integer> coins) {
        this.coins = coins;
    }
    public HashMap<CoinType, Integer> getCoins(){
        return coins;
    }
    public void setProducts(HashMap<Product, Integer> products) {
        this.products = products;
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public void addProduct(Product product, Integer amount){
        this.products.put(product, amount);
    }

    public void insertCoin(CoinType coin, Integer value) {
        if (coin == CoinType.ONEPENCE || coin == CoinType.TWOPENCE){
            System.out.println("Coins not accepted");
        } else {
            this.coins.put(coin, value);
            this.total += coin.getValue();
        }
    }
    public int getTotal(){
        return total;
    }
    public void dispenseProduct(Product product, Integer amount){
        this.products.remove(product, amount);

        this.total = 0;
    }
}

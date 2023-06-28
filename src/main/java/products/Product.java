package products;

public abstract class Product {

    private int price;
    private String code;

    public Product(int price, String code){
        this.price = price;
        this.code = code;
    }

    public int getPrice(){
        return price;
    }

    public String getCode() {
        return code;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

package Labs.O5;

public class ShoppingBasketItem {

    String productName;
    int quantity;
    double price;

    public ShoppingBasketItem(String productName, int quantity, double price){
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    String getDetails(){
        return "Name: " + productName + ", Amount: " + quantity + ", Price: " + price;
    }
}

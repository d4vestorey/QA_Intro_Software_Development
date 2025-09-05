package Labs.O5;

import java.util.ArrayList;

public class ShoppingBasket {

    ArrayList<ShoppingBasketItem> items;
    double basketTotalCost;

    //Need to initialise a shopping basket with an arraylist
    //otherwise, calling the 'add' method will throw exception
    public ShoppingBasket(){
        items = new ArrayList<>();
    }

    public void add(ShoppingBasketItem item){
        items.add(item);
    }

    public void viewBasketItems(){
        for(ShoppingBasketItem item : items){
            System.out.println(item.getDetails());
        }
    }

    public void basketTotal(){
        for(ShoppingBasketItem item : items){
            basketTotalCost += item.quantity * item.price;
        }
        System.out.println("Basket Total: " + basketTotalCost);
    }
}

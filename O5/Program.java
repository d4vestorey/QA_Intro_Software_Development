package Labs.O5;

import java.util.ArrayDeque;

public class Program {
    public static void main(String[] args) {
        
        ArrayDeque<ShoppingBasket> baskets = new ArrayDeque<>();
        
        ShoppingBasket basket1 = new ShoppingBasket();
        ShoppingBasket basket2 = new ShoppingBasket();
        ShoppingBasket basket3 = new ShoppingBasket();

        ShoppingBasketItem item1 = new ShoppingBasketItem("Carrot", 1,0.20);
        ShoppingBasketItem item2 = new ShoppingBasketItem("Potato", 1,0.25);
        ShoppingBasketItem item3 = new ShoppingBasketItem("Cheese", 1,2.50);
        ShoppingBasketItem item4 = new ShoppingBasketItem("Chicken", 1,4.50);
        ShoppingBasketItem item5 = new ShoppingBasketItem("Cake", 1,3.0);
        
        basket1.add(item5);
        basket1.add(item3);
        basket2.add(item1);
        basket2.add(item5);
        basket3.add(item2);

        baskets.offerLast(basket1);
        baskets.offerLast(basket2);
        baskets.offerLast(basket3);

        processBaskets(baskets);
    }


    static void processBaskets(ArrayDeque<ShoppingBasket> sb){
        int count = 1;
        for(ShoppingBasket s : sb){
            System.out.println("Basket number: " + count +"\n");
            count++;
            s.viewBasketItems();
            s.basketTotal();
        }
    }
    
    
}

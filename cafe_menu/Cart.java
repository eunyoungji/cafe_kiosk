package cafe_menu;

import java.util.ArrayList;

public class Cart {

    public static ArrayList<Cart> orderList = new ArrayList<>();

    public static void addOrder(Cart cartitem) {
        orderList.add(cartitem);
    }

    public static void clearOrder(Cart cartitem) {
        orderList.clear();
    }
    public static ArrayList<Cart> getOrderList() {
        return orderList;
    }



    public int getTotal() {
        int total = 0;
        for (Cart cart : orderList {
            total += orderList.getPrice();
        }

        return total;
    }
}


package cafe_menu;

import java.util.HashMap;
import java.util.Map;

public class hug extends Main_menu {
    static HashMap<Integer, Product> coffeeList = new HashMap();

    static {
        HashMap<Integer, Product> hugList = new HashMap();
        hugList.put(1, new Product("Warm Hug", 0, "따뜻한 온기를 전해주는 포옹"));
        hugList.put(2, new Product("Long Hug", 0, "긴 응원과 위로를 담은 포옹");
        hugList.put(3, new Product("Friend Hug", 0, "친구의 마음으로 전해주는 포옹"));
        hugList.put(4, new Product("Bisous", 0, "Bon Jour!"));
    }
}


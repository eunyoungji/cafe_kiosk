package cafe_menu;

import java.util.HashMap;
import java.util.Map;

public class juice extends Main_menu {
    static HashMap<Integer, Product> coffeeList = new HashMap();

    static {
        HashMap<Integer, Product> juiceList = new HashMap();
        juiceList.put(1, new Product("Mango", 4000, "달콤한 맛의 망고 쥬스");
        juiceList.put(2, new Product("Tomato", 4000, "건강한 맛의 토마토 쥬스"));
        juiceList.put(3, new Product("Strawberry", 4000, "상큼한 맛의 딸기 쥬스");
        juiceList.put(4, new Product("Watermelon", 4000, "시원한 맛의 수박 쥬스");\
    }
}

package cafe_menu;

import java.util.HashMap;
import java.util.Map;

public class coffee extends Main_menu {
    static HashMap<Integer, Product> coffeeList = new HashMap();

    static {
        coffeeList.put(1, new Product("Espresso", 2000, "진한 커피 본연의 향을 맛보세요"));
        coffeeList.put(2, new Product("Americano", 2500, "시럽이 들어가지 않은 블랙커피"));
        coffeeList.put(3, new Product("Caffe Latte", 3000, "우유가 들어간 신선한 라떼"));
        coffeeList.put(4, new Product("Cappuchino", 3000, "시나몬 파우더가 들어가요"));
    }
}

package cafe_menu;

import java.util.HashMap;
import java.util.Map;

public class tea extends Main_menu {
    static HashMap<Integer, Product> coffeeList = new HashMap();

    static {
        HashMap<Integer, Product> teaList = new HashMap();
        teaList.put(1, new Product("Earl Grey", 2500, "누구나 좋아하는 얼그레이 티");
        teaList.put(2, new Product("Hibiscus", 2500, "상큼한 맛의 히비스커스 티"));
        teaList.put(3, new Product("Rose Hip", 2500, "향긋한 장미 향의 로즈힙 티"));
        teaList.put(4, new Product("Green Tea", 2500, "은은한 맛의 녹차"));
    }
}

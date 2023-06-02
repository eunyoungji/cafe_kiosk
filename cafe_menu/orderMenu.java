package cafe_menu;

public class orderMenu {

    static void orderScreen() {
        System.out.println("아래와 같이 주문하시겠습니까?");
        System.out.println("");
        System.out.println("[" + " ORDERS " + "]");
        for (Cart cart : Cart.getOrderList()) {
            System.out.println(("MENU: " + cart.getName() + " ㅣ PRICE: " + cart.getPrice()));
        }
        System.out.println("");
        System.out.println("1. 이대로 주문할래요." + " 2. 더 주문할래요.");
    }

    static void finishScreen() {
        System.out.println("주문이 완료되었습니다!");
        System.out.println("");
        System.out.println("대기번호는 //번입니다"); // 대기번호
        System.out.println("3초 후 메뉴판으로 되돌아갑니다"); // 메인메뉴로 되돌아감
    }
}

package cafe_menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Main_menu extends Cart {
    public Main_menu() {
        super();
    }

    public static void main(String[] args) {
        new Main_menu();
    }
}
public class mainMenu {
    Map<Integer, Menu> menuList;

    public mainMenu() {
        menuList =  =new HashMap<Integer, Menu>();
        menuList.put(1, new Menu("Coffee", "신선한 원두로 내린 맛있는 커피예요."));
        menuList.put(2, new Menu("Tea", "건강하고 맛있는 차를 맛보세요."));
        menuList.put(3, new Menu("Juice", "유기농 재료로 직접 내린 쥬스예요."));
        menuList.put(4, new Menu("Hug", "따뜻한 포옹을 함께 드려요."));
        menuList.put(5, new Menu("ORDER", "장바구니를 확인 후 주문합니다."));
        menuList.put(6, new Menu("CANCEL", "진행중인 주문을 취소합니다."));
    }
}

    public void menuScreen(Menu menu) {
            System.out.println("\"내일배움카페에 오신 것을 환영합니다!\"");
            System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해 주세요.");
            System.out.println("");
            System.out.println("[" + " N.B. CAFE MENU " + "]");

            Set<Integer> keySet = menuList.keySet();

            for (Integer key : keySet) {
                System.out.println("Number. " + key +
                        " ㅣ " + menuList.get(key));
            }
        }
        Scanner sc = new Scanner(System.in);
        int menuInput = sc.nextInt();

        switch (menuInput) {
            case 1:
                System.out.println();

        }
    }






                System.out.println(String.format("키 : %s, 값 : %s", elem.getInteger(), elem.getObject()));
            }
        }




        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();


        }

    }

}


// List<Menu> menuList = new ArrayList<>();
//메뉴 리스트 불러오기 or채워주기

// for (Menu menu : menuList) {



        // 선택지 선택하고 -> scanner
// 세부 선택지 불러주고 -> Map<Integer, List<STring>> menuList = new HashMap<>();
//
//List<String> menuDetailList= menuMap.get(firstChoice)
// 세부 선택지 서택하고


// public static list<Menu> getMenuList() {} -> voide Menulist 대신 넣고 , coffeeList, teaList, juiceList 별로 ??


//Map 써서 Choice랑
//Map<Integer, List<Product>> menuListMap = new HasMap<>();
//menuListMap.put(1, Menulist.getCoffeeList());
//2번이면 티
//3번이면 쥬스

//menuListMap.get(firstChoice)

//menuListMap.put(1, MenuDetailList.getCoffeelist());
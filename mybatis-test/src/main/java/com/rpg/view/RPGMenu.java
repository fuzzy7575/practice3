package com.rpg.view;

import com.rpg.bag.controller.BagController;
import com.rpg.bag.dto.BagAndItemDTO;

import java.util.List;
import java.util.Scanner;

public class RPGMenu {

    public RPGMenu() {
    }

    private Scanner sc = new Scanner(System.in);
    private BagController bagController = new BagController();


    public void menu() {

        System.out.println("두근두근(?) 연애 시뮬레이션!");
//        insertUserName();


        while (true) {
            System.out.println("============ 메뉴 ============");
            System.out.println("1. 이름 변경하기");
            System.out.println("2. 내 상태 확인하기");
            System.out.println("3. 소지품 보기");
            System.out.println("4. 대화하기");
            System.out.println("5. 쇼핑하기");
            System.out.println("6. 아르바이트 하기");
            System.out.println("7. 호감도 확인하기");
            System.out.println("8. 종료");
            System.out.println("============================");
            System.out.print("번호를 선택하세요 : ");
            int selectNum = sc.nextInt();
            sc.nextLine();

            switch (selectNum) {
//                case 1 : insertUserName(); break;
//                case 2 : printUserStatus(); break;
//                case 3 : viewUserInventory(); break;
                case 3:
                    bagController.selectBagItemList();
                    break;
//                case 4 : talkToNPC(); break;
//                case 5 : goToItemShop(); break;
//                case 6 : goToWork(); break;
//                case 7 : printCharm(); break;
                case 8:
                    System.out.println("게임을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호입니다. 확인 후 다시 입력해 주세요.");
                    break;
            }
        }
    }

    /**
     * 유저의 이름을 Scanner로 입력받아 변경하는 메소드
     */
//    public void insertUserName() {
//        System.out.print("이름을 입력하세요 : ");
//        String name = sc.nextLine();
//        mainController.setUserName(name);
//    }
//
//    public void printUserStatus() {
//        System.out.println(mainController.getUserInfo());
//    }

    /**
     * 유저의 인벤토리를 보여주는 메소드
     * 착용중인 아이템을 상단에 먼저 보여준 후, 인벤토리에 있는 아이템을 보여준다.
     */
//    public void viewUserInventory() {
//        System.out.println("착용 중인 아이템 =============");
//        System.out.println((mainController.getEquippedItem() == null ? "없음" : mainController.getEquippedItem()));
//        System.out.println("소지품 ======================");
//
//        List<BagAndItemDTO> bagItemList = bagController.selectBagItemList();
//
//        for (BagAndItemDTO bagItem : bagItemList) {
//            System.out.println(bagItem);
//        }
//
//    }

//
//    /**
//     * 누구와 대화할지를 선택하여 대화하는 메소드
//     */
//    public void talkToNPC() {
//        printNPCList();
//        System.out.println("============================");
//        System.out.print("누구랑 대화할까? : ");
//        int npcType = sc.nextInt() - 1;
//        sc.nextLine();
//        NPCDTO selectedNPC = mainController.getNpcList()[npcType];
//        System.out.println(selectedNPC.getName() + "을/를 만났다!");
//        System.out.println("============================");
//        System.out.println("[1] 오늘 날씨 어때?");
//        System.out.println("[2] 우리 놀러갈래?");
//        System.out.println("[3] 어제 뭐 먹고 잤니..?");
//        System.out.println("[4] 선물을 준다..");
//        System.out.println("[5] 아무 것도 하지 않는다...");
//        System.out.println("============================");
//        System.out.print("무엇을 할까? :");
//        int talkType = sc.nextInt();
//        sc.nextLine();
//
//        switch (talkType) {
//            case 1 -> talkAboutWeather(selectedNPC);
//            case 2 -> talkAboutTrip(selectedNPC);
//            case 3 -> talkAboutFood(selectedNPC);
//            case 4 -> presentGift(selectedNPC);
//            case 5 -> nothingHappened();
//        }
//
//    }
//
//    public void talkAboutWeather(NPCDTO selectedNPC) {
//        System.out.println(mainController.getUserInfo().getName() + ": 오늘 날씨 어때?");
//        System.out.println(selectedNPC.getName() + ": 화창한걸!");
//        plusNPCLike(selectedNPC, 20);
//
//
//    }
//
//    public void talkAboutTrip(NPCDTO selectedNPC) {
//        System.out.println(mainController.getUserInfo().getName() + ": 우리 놀러갈래?!");
//        if (selectedNPC.getLike() > 50) {
//            System.out.println(selectedNPC.getName() + ": 좋아! 어디로 갈까?");
//            System.out.println("둘은 어디로 놀러갈지 대화하기 시작했다...");
//        } else {
//            System.out.println(selectedNPC.getName() + ": 우리가..?");
//            System.out.println(mainController.getUserInfo().getName() + " 은/는 버려졌다....");
//        }
//    }
//
//    public void talkAboutFood(NPCDTO selectedNPC) {
//        System.out.println(mainController.getUserInfo().getName() + ": 어제 뭐 먹고 잤니..?");
//        System.out.println(selectedNPC.getName() + ": 뭐?");
//        minusNPCLike(selectedNPC, 100);
//    }
//
//    public void presentGift(NPCDTO selectedNPC) {
//        UserDTO userInfo = mainController.getUserInfo();
//        System.out.println("가지고 있는 선물");
//        System.out.println("============================");
//        showGiftList();
//        System.out.print("무엇을 줄까? : ");
//        int selectedGift = sc.nextInt() - 1;
//        sc.nextLine();
//        GiftDTO givenGift = mainController.getUserBag().getGiftList().get(selectedGift);
//        mainController.presentGift(givenGift);
//        int changeLike = 30 + givenGift.getCharm() + userInfo.getCharm();
//
//        if (changeLike > 0){
//            plusNPCLike(selectedNPC, changeLike);
//        }
//        else if (changeLike < 0) {
//            minusNPCLike(selectedNPC, changeLike);
//        }
//        else {
//            nothingHappened();
//        }
//    }
//
//    public void showGiftList() {
//        List<GiftDTO> giftList = mainController.getUserBag().getGiftList();
//
//        for (GiftDTO gift : giftList) {
//            System.out.println("[" + (giftList.indexOf(gift) + 1)+ "]" + gift);
//        }
//
//    }
//
//    public void plusNPCLike(NPCDTO selectedNPC, int like) {
//        System.out.println(selectedNPC.getName() + "의 호감도가 " + like + "만큼 상승했다!");
//        mainController.plusNPCLike(selectedNPC, like);
//        System.out.println(selectedNPC.getName() + "의 호감도가 " + selectedNPC.getLike() + "가 되었다.");
//    }
//
//    public void minusNPCLike(NPCDTO selectedNPC, int like) {
//        System.out.println(selectedNPC.getName() + "의 호감도가 " + like + "만큼 하락했다....");
//        mainController.minusNPCLike(selectedNPC, like);
//        System.out.println(selectedNPC.getName() + "의 호감도가 " + selectedNPC.getLike() + "가 되었다.");
//    }
//
//    public void nothingHappened() {
//        System.out.println("아무 일도 일어나지 않았다.....");
//    }
//
//
//    public void goToItemShop() {
//        System.out.println("1. 옷 가게 / 2. 선물 가게");
//        System.out.println("============================");
//        System.out.print("어느 가게로 가시겠습니까? : ");
//        int shopType = sc.nextInt();
//        sc.nextLine();
//
//        switch (shopType) {
//            case 1 -> goToClothesShop();
//            case 2 -> goToGiftShop();
//        }
//
//        ItemDTO[] itemDTOList = mainController.getItemShopItemList(shopType);
//        showItemList(itemDTOList);
//        System.out.print("어느 물건을 달라 할까? : ");
//        int itemIndex = sc.nextInt() - 1;
//
//        ItemDTO buyItemDTO = switch (shopType) {
//            case 1 -> mainController.getBuyClothes(itemIndex);
//            case 2 -> mainController.getBuyGift(itemIndex);
//            default -> throw new InputMismatchException();
//        };
//
//        UserDTO userInfo = mainController.getUserInfo();
//        if (userInfo.getMoney() < buyItemDTO.getPrice()) {
//            System.out.println("돈이 없다. 아르바이트를 하러 가볼까?");
//            return;
//        }
//
//        mainController.buyItem(buyItemDTO);
//        System.out.println(buyItemDTO.getName() + "을/를 샀다!");
//        if (buyItemDTO instanceof ClothesDTO) {
//            mainController.equipItem((ClothesDTO) buyItemDTO);
//            System.out.println("아이템을 착용하여 매력도가 " + userInfo.getCharm() + "가 되었다!");
//        }
////        System.out.println(buyItemDTO.getPrice() + "원 사용했다.");
////        userInfo.minusMoney(buyItemDTO.getPrice());
////        System.out.println(userInfo.getMoney() + "원 남았다.");
//
//
//    }
//
//    public void goToClothesShop() {
//        System.out.println("옷 가게에 입장했다 !");
//        System.out.println("============================");
//        System.out.println("중년의 주인장이 나타났다 ...");
//        System.out.println("주인장 : 어떤 물건을 구입하시겠습니까?");
//        System.out.println("============================");
//
//
//    }
//
//    public void goToGiftShop() {
//        System.out.println("선물 가게에 입장했다 !");
//        System.out.println("============================");
//        System.out.println("야생의 산신령이 나타났다 ...");
//        System.out.println("야생의 산신령 : 어떤 물건이 네 물건이냐?");
//        System.out.println("============================");
//
//    }
//
//    public void showItemList(ItemDTO[] itemDTOList) {
//        for (int i = 0; i < itemDTOList.length; i++) {
//            System.out.println("[" + (i + 1) + "] " + itemDTOList[i]);
//        }
//
//    }
//
//    public void goToWork() {
//        System.out.println("어느 아르바이트를 하러 갈까?");
//        System.out.println("1. 편의점 / 2. 영화관 / 3. 식당");
//        System.out.println("============================");
//        System.out.print("번호를 선택하세요 : ");
//        int workType = sc.nextInt();
//        sc.nextLine();
//
//        switch (workType) {
//            case 1 -> goToWorkConvenienceStore();
//            case 2 -> goToWorkCinema();
//            case 3 -> goToWorkRestaurant();
//        }
//    }
//
//    public void goToWorkConvenienceStore() {
//        System.out.println("편의점 알바를 했다.");
//        System.out.println("진상이 너무 많다............");
//        takeMoney(50000);
//        loseCharm(3);
//    }
//
//    public void goToWorkCinema() {
//        System.out.println("영화관 알바를 했다.");
//        System.out.println("메뚜기족들 잡느라 너무 힘들다........");
//        takeMoney(70000);
//        loseCharm(1);
//    }
//
//    public void goToWorkRestaurant() {
//        System.out.println("식당 알바를 했다.");
//        System.out.println("손님이 팁을 만원 주셨다!");
//        takeMoney(100000);
//        loseCharm(2);
//    }
//
//    public void takeMoney(int money) {
//        System.out.println("총 " + money + "원을 벌었다.");
//        mainController.takeMoney(money);
//    }
//
//    public void loseCharm(int charm) {
//        System.out.println("나의 매력이" + charm + " 하락했다.");
//        mainController.loseCharm(charm);
//    }
//
//    public void printCharm() {
//        NPCDTO[] npcList = mainController.getNpcList();
//        for (NPCDTO npc : npcList) {
//            System.out.println(npc);
//        }
//    }
//
//    public void printNPCList() {
//        NPCDTO[] npcList = mainController.getNpcList();
//
//        for (int i = 0; i < npcList.length; i++) {
//            // NPC의 이름과 번호를 출력한다.
//            System.out.print((i + 1) + npcList[i].getName());
//            // 마지막에는 구분자 대신 개행 문자를 출력하고
//            if (i >= npcList.length - 1) {
//                System.out.println();
//            } else { // 그 전에는 '/'로 구분짓는다
//                System.out.print(" / ");
//            }
//        }
//
//    }

}

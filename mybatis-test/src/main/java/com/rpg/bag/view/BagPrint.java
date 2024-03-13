package com.rpg.bag.view;

import com.rpg.bag.dto.BagAndItemDTO;
import com.rpg.bag.dto.BagDTO;

import java.util.Arrays;
import java.util.List;

public class BagPrint {
    public void printBagItemList(List<BagAndItemDTO> bagItemList) {

        // 전체 조회한 목록 출력하는 메소드
//        for(BagAndItemDTO bagItem : bagItemList) {
//            System.out.println(bagItem);
//        }

//        for(int i = 0; i < bagItemList.size;i++){
//
//        }
//
//        int index = 0;
//        for (BagAndItemDTO bagItem : bagItemList) {
//            if(index == 0) {
//                System.out.println("착용 중인 아이템 =============");
//                System.out.println(bagItem);
//            } else {
//                System.out.println("소지품 ======================");
//                System.out.println(bagItem);
//            }
//            index++;
//        }

        System.out.println("List 값 확인 : " + bagItemList);
        System.out.println("List 인덱스 값 확인 : " + bagItemList.get(0));


        System.out.println("List 크기 확인 : " + bagItemList.size());

        System.out.println("List 안에 특정 값 들었는지 확인 : " + bagItemList.contains("셔츠와 청바지"));
        System.out.println("List 안에 특정 값 들었는지 확인 : " + bagItemList.contains(","));

        System.out.println("List 안에 아무것도 들지 않았는지 확인 : " + bagItemList.isEmpty());



        for (BagAndItemDTO bagItem : bagItemList) {
                System.out.println("착용 중인 아이템 =============");
                System.out.println(bagItem);
//                Arrays.toString(bagItem);

                System.out.println("소지품 ======================");
            System.out.println(bagItem.getItemCode());
//                System.out.println(bagItem);
        }

    }

    public void printErrorMessage(String errorCode) {

        // 에러메시지를 출력하는 메소드

        String errorMessage = "";
        switch (errorCode) {
            case "selectBagItemList":
                errorMessage = "소지품 보기를 실패하였습니다.";
                break;
        }
        System.out.println(errorMessage);
    }
}

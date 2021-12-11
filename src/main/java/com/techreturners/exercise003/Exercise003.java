package com.techreturners.exercise003;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise003 {

    Map<String, Integer> hashMap = new LinkedHashMap();

    void initIceCreamShop() {
        hashMap.put("Pistachio", 0);
        hashMap.put("Raspberry Ripple", 1);
        hashMap.put("Vanilla", 2);
        hashMap.put("Mint Chocolate Chip", 3);
        hashMap.put("Chocolate", 4);
        hashMap.put("Mango Sorbet", 5);
    }

    int getIceCreamCode(String iceCreamFlavour) {

        initIceCreamShop();
        return hashMap.get(iceCreamFlavour);
    }

    String[] iceCreamFlavours() {

        initIceCreamShop();
        return hashMap.keySet().toArray(new String[0]);
    }

}

package com.company;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<Car, CarDetails> map = new HashMap<>();

        map.put(new Car(1, "01KG183AFJ"),
                new CarDetails(2002, 5600, "White", "Honda"));
        map.put(new Car(2, "02KG345ABC"),
                new CarDetails(2010, 13000, "Black", "Subaru"));
        map.put(new Car(3, "03KG369QAZ"),
                new CarDetails(2016, 16000, "Black", "Lexus"));

        for(Map.Entry<Car, CarDetails> i : map.entrySet())
            System.out.println(i);
    }
}

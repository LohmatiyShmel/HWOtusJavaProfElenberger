package com.HW01;
import com.google.common.collect.Lists;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<String> fruitList = Lists.newArrayList("Apple", "Orange", "Banana");
        for(String fruit : fruitList) {
            System.out.println(fruit);
        }
    }
}

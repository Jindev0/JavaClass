package org.dimigo.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        //key, value
        Map<String, Integer> map = new HashMap<>();
        map.put("DJ", 115);
        map.put("MH", 152);
        map.put("JI", 127);
        map.put("JI", 123);
        printMap(map);
    }

    private static void printMap(Map<String, Integer> map) {
        for(String key : map.keySet()) {
            System.out.print(key + ":" + map.get(key) + "| ");
        }
        System.out.println();
    }
}

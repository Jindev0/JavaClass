package org.dimigo.collection;

import java.util.List;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // 1. List 계열 - ArrayList
        List list = new ArrayList();
        list.add("시공조아");
        list.add(123);

        List<String> list2 = new ArrayList<String>();
        list2.add("사과");
        list2.add("배");
        list2.add("감");
        list2.add("감");
        list2.add(1, "귤");
        printList(list2);

        System.out.println(list2.get(0));
        System.out.println(list2.get(list2.size()-1));

        list2.remove(0);
        printList(list2);
        list2.remove("감");
        printList(list2);
    }

    private static void printList(List<String> list2) {
        for(String s : list2) {
            System.out.print(s + "|");
        }
        System.out.println();
    }
}

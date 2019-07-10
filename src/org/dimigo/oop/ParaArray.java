package org.dimigo.oop;

public class ParaArray {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        add(intArr, 10);
        printArray(intArr);

        String[] names = {"홍길동", "홍길서", "홍길남","홍길북"};
        changeName(names);
        printArray(names);
    }

    private static void changeName(String[] names) {
        for (int i=0 ; i<names.length ; i++) {
            names[i] = "김" + names[i].substring(1);
            //names[i] = names[i].replaceFirst("홍", "김");
        }
    }

    private static void printArray(int[] intArr) {
        for (int value : intArr) {
            System.out.print(value + " ");
        }
    }

    private static void printArray(String[] Arr) {
        for (String value : Arr) {
            System.out.print(value + " ");
        }
    }

    private static void add(int[] intArr, int j) {
        for (int i=0 ; i<intArr.length ; i++) {
            intArr[i] += j;
        }
    }
}

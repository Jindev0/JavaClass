package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        // 기본형 타입 배열
        // int, double, long, float, byte, char, boolean, short
        int[] intArr = null;
        intArr = new int[5];

        printArray(intArr);

        double[] doubleArr = null;
        doubleArr = new double[5];

        printArray(doubleArr);

        String[] strArr = null;
        strArr = new String[3];

        printArray(strArr);

        strArr[0] = "이민상";
        strArr[1] = "이의상";
        strArr[2] = "김승억";

        printArray(strArr);

        String[] strArr2 = {"소녀시대", "애프터스쿨", "오렌지캬라멜"};
        printArray(strArr2);

        Book[] bookArr = {
                new Book("미생", "윤태호", 100), new Book("죽음을 넘어 시대의 어둠을 넘어", "황석영 외", 400)
        };
        printArray(bookArr);
    }

    private static void printArray(Book[] bookArr) {
        for(Book value : bookArr) {
            System.out.println(value);
        }
    }

    private static void printArray(int[] intArr) {
        for(int value : intArr) {
            System.out.print(value + " | ");
        }
        System.out.println("");
    }


    private static void printArray(double[] doubleArr) {
        for(double value : doubleArr) {
            System.out.print(value + " | ");
        }
        System.out.println("");
    }

    private static void printArray(String[] strArr) {
        for(String value : strArr) {
            System.out.print(value + " | ");
        }
        System.out.println("");
    }
}

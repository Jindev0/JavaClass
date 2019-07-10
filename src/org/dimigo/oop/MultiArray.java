package org.dimigo.oop;

public class MultiArray {
    public static void main(String[] args) {
        int[][] intArr = new int[2][3];
        intArr[0][2] = 1;
        intArr[1][1] = 2;
        printArray(intArr);

        String[][] strArr = new String[2][];
        strArr[0] = new String[3];
        strArr[1] = new String[2];

        strArr[0][0] = "C";
        strArr[0][1] = "Java";
        strArr[0][2] = "PHP";
        strArr[1][0] = "C#";
        strArr[1][1] = "Python";

        printArray(strArr);

        String[][] strArr2 = {
                new String[] {"C", "Java", "PHP"},
                new String[] {"C#", "Python"}
        };
    }

    private static void printArray(String[][] strArr) {
        for (String[] value : strArr) {
            for(String value2 : value) {
                System.out.print(value2 + "|");
            }
            System.out.println();
        }
    }

    private static void printArray(int[][] intArr) {
        /*for (int i=0 ; i< intArr.length ; i++) {
            for (int j=0 ; j<intArr[i].length ; j++) {
                System.out.print(intArr[i][j] + " ");
            }
            System.out.println();
        }*/
        for (int[] value : intArr) {
            for(int value2 : value) {
                System.out.print(value2 + " | ");
            }
            System.out.println();
        }
    }
}

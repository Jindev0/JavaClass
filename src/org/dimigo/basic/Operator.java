package org.dimigo.basic;

public class Operator {
    public static void main(String[] args) {
        //1. 산술연산자
        int a = 5, b = 2;

//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println((double)a / b);
//        System.out.println(a % b);1
//        System.out.println(a / 0);

        //2. 다른 타입간의 연산
        int i = 10;
        double d = 3.14;
        int r = (int) (i + d);
        int r2 = (int) d + i;
        double r3 = i + d;

        //int보다 작은 타입간의 연산
        short s1 = 1, s2 =2;
        short r4 = (short) (s1 + s2);
        int r5 = s1 + s2;

        //short - circuit test
        boolean flag = true;
        a = 10;
        b = 0;
        if (flag || (a / b == 0)) {
            System.out.println(a);
        }

        if(!flag && (a / b==0)) {
            System.out.println(a);
        }

        //4.문자열 연결 연산자
        String school = "디미고";
        int grade = 2;
        int ban = 4;
        String name = "박지효";
        System.out.println(grade + "" + ban + school + name);

    }
}

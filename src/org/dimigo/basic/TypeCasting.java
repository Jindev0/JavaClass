package org.dimigo.basic;

public class TypeCasting {
    public static void main(String[] args) {
        //자동 형 변환 : 작은 타입 -> 큰 타입 (promotion)
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        //System.out.printf("%d %d %d %d\n", b, s, i, l);

        //강제 형 변환 : 큰 타입 -> 작은 타입 (casting)
        i = (int)l;
        s = (short)i;
        b = (byte)s;
        //System.out.printf("%d %d %d %d\n", b, s, i, l);

        // 값의 범위를 고려하여 casting 해보기
        int i2 = 128;
        byte b2 = (byte)i2;
        long l2 = 10000000000L;
        int i3 = (int) l2;
        System.out.println(i3);
    }
}

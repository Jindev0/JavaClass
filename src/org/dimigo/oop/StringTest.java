package org.dimigo.oop;

public class StringTest {
    public static void main(String[] args) {
        String dog1 = "멍멍이";
        String dog2 = "멍멍이";
        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));

        String cat1 = new String("냥냥이");
        String cat2 = new String("냥냥이");
        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));

        System.out.println(dog1 == "멍멍이");
        System.out.println(cat1 == "냥냥이");

        String id = "admin";
        System.out.println("admin".equals(id) ? "관리자" : "관리자 아님");

        testString();
    }

    private static void testString() {
        String s = "abcdefgABCDEFG";
        System.out.println(s.length());
        System.out.println(s.substring(3));
        System.out.println(s.substring(3,6));
        System.out.println();
    }
}

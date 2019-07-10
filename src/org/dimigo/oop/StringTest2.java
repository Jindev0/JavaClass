package org.dimigo.oop;

public class StringTest2 {
    public static void main(String[] args) {
        String str = "디미고";
        str += "2학년";
        str += "4반";
        str += "11번";
        str += "박지효";

        StringBuilder sb = new StringBuilder("디미고 ");
        sb.append("2학년 ").append("4반 ").append("11번 ").append("박지억" );

        System.out.println(sb);

        compareSpeed();
    }

    private static void compareSpeed() {
        long start = System.currentTimeMillis();

        String str = "abc";
        StringBuffer sb = new StringBuffer(str);
        StringBuilder sb2 = new StringBuilder(str);

        for (int i=0 ; i< 100000 ; i++) {
            //str += "def";
            //sb.append("def");
            //sb2.append("def");
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

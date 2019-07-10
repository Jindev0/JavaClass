package org.dimigo.oop;

public class Contact {

    private String name;
    private String phonenum;
    private String email;
    private String homenum;
    private int birthday;

    public boolean call(String num) {
        System.out.println(num + "으로 전화합니다!");
        return true;
    }

    public boolean message(String ment, String num) {
        System.out.println(num + "으로 문자힙니다!");
        return true;
    }

    public void del(String name) {
        System.out.println(name+"의 연락처를 삭제합니다!");
    }

    public void create(String name) {
        System.out.println(name+"의 연락처를 추가합니다!");
    }

    public void edit() {
        System.out.println("연락처가 수정되었습니다!");
    }

}
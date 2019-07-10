package org.dimigo.inheritance;

public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + "이 먹습니다 냠냠");
    }

    public void sleep() {
        System.out.println(name + "이 잡니다쿨쿨");
    }

    public void bark() {
        System.out.println("멍멍");
    }

    public String toString() {
        return "제 이름은 " + name + "입니다";
    }

}

package org.dimigo.inheritance;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void wag() {
        System.out.println(name + "가 꼬리를 흔듭니다");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}

package org.dimigo.inheritance;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("냥냥");
    }

    public void scratch() {
        System.out.println(name + "이 할퀸다");
    }


}

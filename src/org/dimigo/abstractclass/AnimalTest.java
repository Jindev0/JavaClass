package org.dimigo.abstractclass;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] zoo = {
          new Duck(),
          new Pig(),
          new Cow(),
        };

        System.out.println("=== 평온한 동물농장 ===");
        for (Animal a : zoo) {
            a.eat();
        }
        System.out.println("=== 늑대가 나타났다 ===");
        for (Animal a : zoo) {
            a.bark();
        }
    }
}

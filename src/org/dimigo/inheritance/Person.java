package org.dimigo.inheritance;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void eat() {
        System.out.println(name + " 꺼억");
    }

    public void sleep() {
        System.out.println(name + "이 피곤하다 내일 이야기하자");
    }

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

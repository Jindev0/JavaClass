package org.dimigo.oop2;

public class Person {
    private static final String TYPE = "포유류";
    private final String brithDate;
    private String name;

    public Person(String brithDate, String name) {
        this.brithDate = brithDate;
        this.name = name;
    }

    public String toString() {
        return "Person{" +
                "type='" + TYPE + '\'' +
                ", brithDate='" + brithDate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("20030129", "이주원");
        Person p2 = new Person("20020129", "장예빈");

        System.out.println(Person.TYPE);
    }
}


package org.dimigo.inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("아이유", 25, 160, 45);
        System.out.println(p);
        p.eat();
        p.sleep();

        Student s = new Student("김수겸", 18, 180, 75, "172405");

        Teacher t = new Teacher("지은혜", 28, 158, 50, "컴네");
        t.sleep();

    }
}

package org.dimigo.inheritance;

public class Teacher extends Person{
    private String subject;

    public Teacher(String name, int age, int height, int weight, String subject) {
        super(name, age, height, weight);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", height=" + getHeight() +
                ", weight=" + getWeight() +
                '}';
    }

    public void teach() {
        System.out.println(getName() + "샘이 공부를 가르칩니다");
    }

    public void doTask() {
        System.out.println(getName() + "샘이 업무를 하십니다");
    }
}

package org.dimigo.oop;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.getNum1() + " + " + cal.getNum2() + " = " + cal.add());
        System.out.println(cal.getNum1() + " - " + cal.getNum2() + " = " + cal.sub());
        System.out.println(cal.getNum1() + " * " + cal.getNum2() + " = " + cal.mul());
        System.out.println(cal.getNum1() + " / " + cal.getNum2() + " = " + cal.div());
        cal.powerOff();
    }
}

package org.dimigo.oop;

public class Calculator {
    private int num1 = 10;
    private int num2 = 20;
    private boolean powerFlag = false;

    public Calculator() {

    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return this.num1;
    }

    public int getNum2() {
        return this.num2;
    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void powerOn() {
        if(!powerFlag) System.out.println("전원을 켭니다.");
        powerFlag = true;
    }

    public void powerOff() {
        if(powerFlag) System.out.println("전원을 끕니다.");
        powerFlag = false;
    }

    public int add() {
        powerOn();
        return this.num1 + this.num2;
    }

    public int sub() {
        powerOn();
        return this.num1 - this.num2;
    }

    public int mul() {
        powerOn();
        return this.num1 * this.num2;
    }

    public double div() {
        powerOn();
        return (double)this.num1 / (double)this.num2;
    }
}

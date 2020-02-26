package edu.wctc.property.demo;

public class Dog2 {

    private int age;

    public Dog2(int age){
       validateAge(age);
        this.age = age;

    }

    private void closeGapToMailCarrier() {
        System.out.println("closing gap");
    }
    private void startRunning() {
        System.out.println("Starting to run");
    }
    private void navigateToMailCarrier() {
        System.out.println("searching");
    }

    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    private void validateAge(int age){
        if(age<0) {
            throw new IllegalArgumentException("age can't be negative");
        }
    }

    public void chaseMailCarrier(){
        startRunning();
        navigateToMailCarrier();
        closeGapToMailCarrier();
    }
}

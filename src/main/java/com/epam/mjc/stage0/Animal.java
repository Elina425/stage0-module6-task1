package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    Animal(){
        super();
    }
    Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public void getDescription(){
        System.out.println("This animal is mostly"+ color);
        System.out.println("It has" + numberOfPaws+" paws");
        System.out.println(hasFur + "fur");
    }


}

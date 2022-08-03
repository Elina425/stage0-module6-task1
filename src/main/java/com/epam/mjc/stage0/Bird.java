package com.epam.mjc.stage0;

public class Bird extends Animal {
    Bird(String color, int numberOfPaws, boolean hasFur){
        super(color, numberOfPaws, hasFur);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.");
    }
}

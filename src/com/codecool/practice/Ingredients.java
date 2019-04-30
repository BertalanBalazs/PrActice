package com.codecool.practice;

import java.util.Random;

class Ingredients {
    private int carrot;
    private int potato;
    private int meat;

    int getCarrot() {
        return carrot;
    }

    int getPotato() {
        return potato;
    }

    int getMeat() {
        return meat;
    }

    void decreaseCarrot() {
        this.carrot--;
    }

    void decreasePotato() {
        this.potato--;
    }

    void decreaseMeat() {
        this.meat--;
    }

    Ingredients() {
        Random random = new Random();
        this.carrot = random.nextInt(4);
        this.potato = random.nextInt(4);
        this.meat = random.nextInt(4);
    }
}

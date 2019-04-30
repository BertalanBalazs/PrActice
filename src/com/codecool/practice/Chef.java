package com.codecool.practice;

import java.util.Date;
import java.util.Random;

public class Chef extends Employee implements Cookers {
    private static Chef instance = null;

    private Chef(final String name, final Date birthDate, final int salary) {
        super(name, birthDate, salary);
    }

    static Chef getInstance(final String name, final Date birthDate, final int salary) {
        if (instance == null) {
            instance = new Chef(name, birthDate, salary);
        }
        return instance;
    }

    private String askForIngredients(){
        Random rd = new Random();
        int choice = rd.nextInt(3)+1;
        switch (choice){
            case 1:
                return "carrot";
            case 2:
                return "potato";
            case 3:
                return "meat";
        }
        return null;
    }

    String yelling(){
        Random rd = new Random();
        if (rd.nextInt(100) <= 33){
            return askForIngredients();
        } else {
            System.out.println("FASTER GIGI!!!");
            return null;
        }
    }

    @Override
    public void toCook() {

    }

    @Override
    public boolean gotKnife() {
        return false;
    }
}

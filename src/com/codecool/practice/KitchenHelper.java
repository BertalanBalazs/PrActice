package com.codecool.practice;

import java.util.Date;

class KitchenHelper extends Employee {
    private Ingredients ingredients;

    KitchenHelper(final String name, final Date birthDate, final int salary) {
        super(name, birthDate, salary);
        this.ingredients = new Ingredients();
    }

    boolean hasIngredient(String ingredient) {
        switch (ingredient) {
            case "carrot":
                if(this.ingredients.getCarrot() > 0){
                    this.ingredients.decreaseCarrot();
                    System.out.println("Here you are, there's some "+ ingredient +" !");
                    return true;
                }
                break;
            case "potato":
                if(this.ingredients.getPotato() > 0){
                    this.ingredients.decreasePotato();
                    System.out.println("Here you are, there's some "+ ingredient +" !");
                    return true;
                }
                break;
            case "meat":
                if(this.ingredients.getMeat() > 0){
                    this.ingredients.decreaseMeat();
                    System.out.println("Here you are, there's some "+ ingredient +" !");
                    return true;
                }
                break;
        }
        System.out.println("Sorry we are out of this ingredient! So we dont call police if you fuck us!");
        return false;
    }
}

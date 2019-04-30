package com.codecool.practice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Kitchen {
    private static Chef chef;
    private static List<Cooks> cooks = new ArrayList<>();
    private static List<KitchenHelper> kitchenHelpers = new ArrayList<>();
    private static boolean isAllIngredientsRunningOut = false;

    public static void main(String[] args) {
        hireEmployees();
        work();
    }

    private static void hireEmployees(){
        chef = Chef.getInstance("Taki", new Date(1988, 11,7), 235000);

        Cooks gigi = new Cooks("Gigcsó", new Date(1992, 7, 15),  90000);
        Cooks kincsoe = new Cooks("Kincső", new Date(1999, 5, 1),  60000);
        cooks.add(gigi);
        cooks.add(kincsoe);

        KitchenHelper freeman = new KitchenHelper("Freeman", new Date(1991,8,21), 12000);
        KitchenHelper tejfi = new KitchenHelper("Tejföl 12%", new Date(1991,8,8), 13000);
        KitchenHelper mm = new KitchenHelper("Miklós Máté", new Date(1991,1,14), 15000);
        KitchenHelper borsosPeti = new KitchenHelper("Borsos Péter", new Date(1991,9,30), 230000);
        kitchenHelpers.add(freeman);
        kitchenHelpers.add(tejfi);
        kitchenHelpers.add(mm);
        kitchenHelpers.add(borsosPeti);
    }

    private static void work(){
        while (!isAllIngredientsRunningOut){
            try {
                checkIngredients(chef.yelling());
            } catch (Exception ignored) {}
        }
    }

    private static void checkIngredients(String ingredient){
        if(ingredient != null) {
            System.out.println("I need some " + ingredient + " Motherfuckers!!");
        }
        boolean kitchenHelperHasIngredient = false;
        for (KitchenHelper kitchenHelper : kitchenHelpers) {
            assert ingredient != null;
            if (kitchenHelper.hasIngredient(ingredient)) {
                kitchenHelperHasIngredient = true;
                break;
            }
        }
        if(!kitchenHelperHasIngredient) {
            isAllIngredientsRunningOut = true;
            System.out.println("We are running out!");
        }
    }
}

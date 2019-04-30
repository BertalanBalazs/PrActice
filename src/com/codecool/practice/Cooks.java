package com.codecool.practice;

import java.util.Date;

public class Cooks extends Employee implements Cookers {
    Cooks(final String name, final Date birthDate, final int salary) {
        super(name, birthDate, salary);
    }

    @Override
    public void toCook() {

    }

    @Override
    public boolean gotKnife() {
        return false;
    }
}

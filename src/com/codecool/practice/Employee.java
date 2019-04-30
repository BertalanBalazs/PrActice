package com.codecool.practice;

import java.util.Date;

public abstract class Employee {
    private static int id_counter = 0;

    private int id;
    private String name;
    private java.util.Date birthDate;
    private int salary;

    Employee(final String name, final Date birthDate, final int salary) {
        this.id = id_counter++;
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(final Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(final int salary) {
        this.salary = salary;
    }

    public int getTax() {
        return (int) (salary*0.99);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", salary=" + salary +
                '}';
    }
}

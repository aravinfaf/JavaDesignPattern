package model;

import factory.Profession;

public class Engineer implements Profession {
    @Override
    public void print() {
        System.out.println("Engineer");
    }
}

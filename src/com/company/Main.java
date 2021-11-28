package com.company;

public class Main {

    public static void main(String[] args) {
        Medic sakura = new Medic();
        Magic doctorStrange = new Magic();
        Warrior kirito = new Warrior();
        Hero[] heroes = { sakura , doctorStrange , kirito};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility( " Ability");

        }

    }
}

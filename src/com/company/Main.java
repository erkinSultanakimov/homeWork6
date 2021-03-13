package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        System.out.println(boss.printName());
        boss.setHealth(100);
        boss.setDamage(20);
        Weapon bossWeapon = new Weapon("Автомат", "Ak47");
        boss.setWeapon(bossWeapon);
        System.out.println(boss.printInfo());


        Sceletons sceleton1 = new Sceletons(2);
        System.out.println(sceleton1.printName());
        Weapon sceletonWeapon = new Weapon("Холодное оружие,", "стрелы");
        sceleton1.setWeapon(sceletonWeapon);
        sceleton1.setDamage(10);
        sceleton1.setHealth(100);
        System.out.println(sceleton1.printInfo());

        Sceletons sceleton2 = new Sceletons(10);
        System.out.println(sceleton2.printName());
        Weapon sceleton2Weapon = new Weapon("Холодное оружие,", "стрелы");
        sceleton2.setWeapon(sceleton2Weapon);
        sceleton2.setHealth(100);
        sceleton2.setDamage(8);
        System.out.println(sceleton2.printInfo());


    }
}

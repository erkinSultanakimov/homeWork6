package com.company;

public class Boss extends GameEntity {
    private Weapon Weapon;

    public String printName() {
        return "Boss";
    }

    public com.company.Weapon getWeapon() {
        return Weapon;
    }

    public void setWeapon(com.company.Weapon weapon) {
        Weapon = weapon;
    }

    public String printInfo() {
        return getHealth() + " здоровье \n" + getDamage() + "  урон \n" + getWeapon().getWeaponType() + " " + getWeapon().getWeaponName();
    }

}

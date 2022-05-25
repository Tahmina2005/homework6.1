package kg.geektech.homework6;

import kg.geektech.homework6.Boss;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(new Weapon("firearms", 10));
        boss.setHealth(500);
        boss.setDamage(500.9);

        System.out.println("kg.geektech.homework6.Boss health " + boss.getHealth() + " "
                + "kg.geektech.homework6.Boss damage " + boss.getDamage() + " " + boss.getWeapon().getFirearms() +
                " " + boss.getWeapon().getRifle());






    }
}

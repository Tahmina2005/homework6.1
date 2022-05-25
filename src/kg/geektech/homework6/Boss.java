package kg.geektech.homework6;

import kg.geektech.homework6.GameEntity;

public class Boss extends GameEntity {
     private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Boss(Weapon weapon) {
        this.weapon = weapon;
    }




    public Boss(){

    }
}
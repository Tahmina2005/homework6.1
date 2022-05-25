package kg.geektech.homework6;

public class Weapon {
    private String firearms;
    private int  rifle;

    public String getFirearms() {
        return firearms;
    }

    public void setFirearms(String firearms) {
        this.firearms = firearms;
    }

    public int getRifle() {
        return rifle;
    }

    public void setRifle(int rifle) {
        this.rifle = rifle;
    }

    public Weapon(String firearms, int rifle) {
        this.firearms = firearms;
        this.rifle = rifle;
    }
}

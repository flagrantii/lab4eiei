package item.consumption;

import item.base.BaseConsumption;

public class Pill extends BaseConsumption {
    private final int RECOVER_PT;

    public Pill(){
        super("Pill");
        RECOVER_PT = 2;
    }

    public String toString(){
        return getName() + " (+" + getRecoverPoint() + " HP)";
    }
    public int getRecoverPoint(){
        return RECOVER_PT;
    }
}

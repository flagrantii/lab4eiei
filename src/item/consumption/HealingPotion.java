package item.consumption;

import item.base.BaseConsumption;

public class HealingPotion extends BaseConsumption {
    private int level;
    private final int MAX_LEVEL;
    private final int[] RECOVER_PT;

    public HealingPotion(){
        super("HealingPotion");
        level = 0;
        MAX_LEVEL = 3;
        RECOVER_PT = new int[]{3,5,7,10};
    }
    public int getRecoverPoint(){
        return RECOVER_PT[level];
    }
    public void setLevel(int levl){
        if(levl < 0 || levl > MAX_LEVEL){
            level = 0;
        }else level = levl;
    }
    public String toString(){
        return getName() + " (+" + getRecoverPoint() + " HP, Level: " + getLevel()+ ")";
    }
    public int getLevel(){
        return level;
    }
    public int getMaxLevel(){
        return MAX_LEVEL;
    }
}

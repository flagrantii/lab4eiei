package item.weapon;

import item.base.BaseWeapon;

public class Sword extends BaseWeapon {
    private int level;
    private final int MAX_LEVEL;
    private int[] ATT;

    public Sword(){
        super("Sword",15,1);
        level = 0;
        MAX_LEVEL = 3;
        ATT = new int[]{3,5,8,12};
    }
    public int getAtt(){
        return ATT[level];
    }
    public void setLevel(int levl){
        if(levl < 0 || levl > MAX_LEVEL){
            level = 0;
        }else level = levl;
    }
    public String toString(){
        return getName() + " (Att: "+getAtt() +", Range: "+getRange()+", Level: "+getLevel()+", "+getDurability()+" uses left"+")";
    }
    public int getLevel(){
        return level;
    }
    public int getMaxLevel(){
        return MAX_LEVEL;
    }
}

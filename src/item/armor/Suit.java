package item.armor;

import item.base.BaseArmor;

public class Suit extends BaseArmor {
    private int level;
    private final int MAX_LEVEL;
    private int[] DEF;

    public Suit(){
        super("Suit",10);
        level = 0;
        MAX_LEVEL = 3;
        DEF = new int[]{1, 2, 3, 5};
    }

    public int getDef(){
        return DEF[level];
    }
    public int getLevel(){
        return level;
    }
    public void setLevel(int levl){
        if(levl< 0 || levl > MAX_LEVEL){
           level = 0;
        }else level = levl;
    }
    public int getMaxLevel(){
        return MAX_LEVEL;
    }
    public String toString(){
        return getName() + " (Def: "+ DEF[level] +", Level: " + level +")";
    }
}

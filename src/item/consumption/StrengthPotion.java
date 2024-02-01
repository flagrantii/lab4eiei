package item.consumption;

import item.base.BaseConsumption;

public class StrengthPotion extends BaseConsumption {
    private int level;
    private final int MAX_LEVEL;
    private final int[] ATT_BUFF;
    private final int BUFF_TURN;

    public StrengthPotion(){
        super("StrengthPotion");
        level = 0;
        MAX_LEVEL = 3;
        BUFF_TURN = 3;
        ATT_BUFF = new int[]{3,5,7,10};
    }
    public int getAttBuff(){
        return ATT_BUFF[level];
    }
    public int getBuffTurn(){
        return BUFF_TURN;
    }
    public void setLevel(int levl){
        if(levl < 0 || levl > MAX_LEVEL){
            level = 0;
        }else level = levl;
    }

    public String toString(){
        return getName() + " (+" + getAttBuff() + " Att for next " + getBuffTurn() + " turns, Level: "+getLevel()+")";
    }
    public int getLevel(){
        return level;
    }
    public int getMaxLevel(){
        return MAX_LEVEL;
    }
}

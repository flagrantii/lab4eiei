package item.consumption;

import item.base.BaseConsumption;
import item.usage.CookState;

import java.util.HashMap;

public class Pork extends BaseConsumption {
    private CookState cookState;
    private final HashMap<CookState,Integer> RECOVER_PT;

    public Pork(){
        super("Pork");
        cookState = CookState.RAW;
        RECOVER_PT = new HashMap<>();
        RECOVER_PT.put(CookState.RAW,1);
        RECOVER_PT.put(CookState.BURNT,0);
        RECOVER_PT.put(CookState.COOKED,2);
    }
    public int getRecoverPoint(){
        return RECOVER_PT.get(cookState);
    }
    public String toString(){
        if(getCookState() == CookState.RAW){
            return "Raw" + " " + getName() + " (+" + getRecoverPoint() +" HP)";
        }else if(getCookState() == CookState.COOKED){
            return "Cooked" + " " + getName() + " (+" + getRecoverPoint() +" HP)";
        }else return "Burnt" + " " + getName() + " (+" + getRecoverPoint() +" HP)";

    }

    public CookState getCookState() {
        return cookState;
    }

    public void setCookState(CookState cookState) {
        this.cookState = cookState;
    }
}

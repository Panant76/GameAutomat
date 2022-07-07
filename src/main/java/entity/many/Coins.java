package entity.many;

import exeption.ManyProblemException;

public class Coins {
    private int nominal;
    public Coins(int nominal) {
        this.nominal=nominal;
    }
    public int checkCoinsNominal() throws ManyProblemException{
        if(nominal%50!=0 || nominal>200){
            throw new ManyProblemException();
        }
        return nominal;
    }
}

package com.company;

public class LaFinta extends Pizza {

    boolean mush; //с грибами или без

    public LaFinta(double price, double weight, boolean mush) {
        super(price, weight);
        this.mush = mush;
    }

    @Override
    public String toString() {
        String res;
        if (mush) {
            res = "Ла Финта с грибами";
        } else {
            res = "Ла Финта без грибов";
        }
        res += "; Вес = " + getWeight() + " грамм; Цена = " + getPrice() + " рублей;";
        return res;
    }
}

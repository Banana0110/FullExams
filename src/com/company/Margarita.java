package com.company;

public class Margarita extends Pizza {

    boolean meat; //с мясом или без

    public Margarita(double price, double weight, boolean meat) {
        super(price, weight);
        this.meat = meat;
    }

    @Override
    public String toString() {
        String res;
        if (meat) {
            res = "Маргарита с мясом";
        } else {
            res = "Маргарита без мяса";
        }
        res += "; Вес = " + getWeight() + " грамм; Цена = " + getPrice() + " рублей;";
        return res;
    }
}

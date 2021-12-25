package com.company;

public class Pepperoni extends Pizza {

    private final boolean spicy; //острая или нет

    protected Pepperoni(double price, double weight, boolean spicy) {
        super(price, weight);
        this.spicy = spicy;
    }

    @Override
    public String toString() {
        String res;
        if (spicy) {
            res = "Острая Пепперони";
        } else {
            res = "Не острая Пепперони";
        }
        res += "; Вес = " + getWeight() + " грамм; Цена = " + getPrice() + " рублей;";
        return res;
    }

}

package com.company;

public class Main {


    public static void main(String[] args) {
        //массив из разных пицц
        Pizza[] somePizza = new Pizza[5];
        somePizza[0] = new Pepperoni(950, 650, true);
        somePizza[1] = new Margarita(700, 600, false);
        somePizza[2] = new LaFinta(980, 750, true);
        somePizza[3] = new Pepperoni(900, 700, false);
        somePizza[4] = new LaFinta(780, 680, false);
        for (int i = 0; i < 5; i++) {
            somePizza[i].to_cook();
            somePizza[i].deliver();
        }
    }

}

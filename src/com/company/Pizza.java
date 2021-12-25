package com.company;

//абстрактный класс пиццы
public abstract class Pizza {

    private double price;
    private double weight;
    static int number; //порядковый номер пиццы

    //конструктор
    Pizza(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    //готовка
    public void to_cook() {
        Pizza.number++;
        System.out.println("Готовится пицца №" + Pizza.number);
    }

    //доставка
    public void deliver() {
        System.out.println(this);
    }

    //этикетка
    @Override
    public abstract String toString();


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

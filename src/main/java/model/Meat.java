package model;

public class Meat extends Food{

    public Meat(double price, int amount) {
        this.isVegeterian = false;
        this.amount = amount;
        this.price = price;
    }
}

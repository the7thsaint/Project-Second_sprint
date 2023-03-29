package model;



public abstract class Food implements Discountable{
    protected boolean isVegeterian;
   protected int amount;
   protected double price;

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public double getPriceDiscount(){
        return price;
    }

    public boolean isVegeterian() {
        return isVegeterian;
    }
}

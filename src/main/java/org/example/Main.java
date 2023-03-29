package org.example;
import model.Apple;
import model.Food;
import model.Meat;
import model.constans.Colour;
import model.service.ShoppingCart;
public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(100.0, 5);
        Apple redApples = new Apple(50.0, 10, Colour.COLOUR_RED);
        Apple greenApples = new Apple(60.0, 8, Colour.COLOUR_GREEN);

        ShoppingCart food = new ShoppingCart(new Food[]{meat,redApples,greenApples});
        double totalPriceWithoutDiscount = food.getTotalPriceWithoutDiscount();
        double totalPriceWithDiscount = food.getTotalPriceWithDiscount();
        double totalPriceIsnVegeterian = food.getTotalPriceIsVegeterian();

        System.out.println(totalPriceWithoutDiscount);
        System.out.println(totalPriceWithDiscount);
        System.out.println(totalPriceIsnVegeterian);

    }
}
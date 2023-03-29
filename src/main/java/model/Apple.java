package model;
import model.constans.Colour;
import model.constans.Discount;


public class Apple extends Food{
    private String colour;

    public Apple(double price, int amount, String colour) {
        this.isVegeterian = true;
        this.amount = amount;
        this.price = price;
        this.colour = colour;
    }
    @Override
    public double getDiscount() {
        if (colour.equals(Colour.COLOUR_RED)) {
            return Discount.DISCOUNT;
        }
        else { return Discount.DEFAULT_DISCOUNT;}
    }
//Я ИСКРЕННЕ ВЕРЮ В ТО ЧТО ПОСЛЕДНИЙ)))))))

    @Override
    public double getPriceDiscount() {
        return super.getPrice() - (super.getPrice() * (getDiscount()/100));
    }
}


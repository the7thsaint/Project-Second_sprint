package model;
import model.constans.Discount;



public interface Discountable {
      default double getDiscount(){
          return Discount.DEFAULT_DISCOUNT;
      }
}

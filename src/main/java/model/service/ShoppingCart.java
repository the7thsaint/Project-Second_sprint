package model.service;
import model.Food;



public class ShoppingCart  {
 private Food[] food;
 public ShoppingCart(Food[] food){
  this.food = food;
 }



 public double getTotalPriceWithoutDiscount(){
  double sum = 0;
  for (int i = 0; i < food.length; i++) {
   sum += food[i].getAmount() * food[i].getPrice();
  }
  return sum;
 }

 public double getTotalPriceWithDiscount(){
  double sum = 0;
  for (int i = 0; i < food.length; i++){
   sum += food[i].getAmount() * food[i].getPriceDiscount();
  }
  return sum;
 }

 public double getTotalPriceIsVegeterian(){
  double sum = 0;
  for (int i = 0; i < food.length; i++){
   if (food[i].isVegeterian()){
    sum += food[i].getAmount() * food[i].getPrice();
   }
  }
  return sum;

 }








}

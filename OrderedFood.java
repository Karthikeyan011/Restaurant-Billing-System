package com.kce.bean;

public class OrderedFood {
 private String foodname;
private int quantity;
public OrderedFood(String foodname, int quantity) {
	this.foodname = foodname;
	this.quantity = quantity;
}
public String getFoodname() {
	return foodname;
}
public int getQuantity() {
	return quantity;
}


}

package com.example.demo;

public abstract class DishSelect implements OrderHelp {
    protected double dishPrice;
    private int dishCount;

    public DishSelect(int dishCount) {
        this.setDishCount(dishCount);
    }

    public double getDishPrice() {
        return dishPrice;
    }

    public void setDishCount(int dishCount) {
        this.dishCount = dishCount;
    }

    public int getDishCount() {
        return dishCount;
    }

    @Override
    public double priceCalculation() {
        double totalPrice = (getDishPrice() * getDishCount() *(1 + TAXRATE));
        return totalPrice;
    }

}

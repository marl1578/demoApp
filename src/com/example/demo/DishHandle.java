package com.example.demo;

public abstract class DishHandle implements OrderHelp {
	protected double dishPrice;
	private int dishCount;
	public DishHandle(int dishCount) {
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
		double totalPrice = (getDishPrice() * getDishCount() * (1 + TAXRATE));
		return totalPrice;
	}

	@Override
	public void totalPriceOutput() {
		double taxIncluded = priceCalculation(); //税込み価格//
		double taxExcluded = taxIncluded / (1 + TAXRATE); //税抜き価格//
		System.out.println("合計金額: " + taxIncluded + "円" + "(税込み)");
		System.out.println("税率: " + (TAXRATE * 100.0) + "%");
		System.out.println("税抜き: " + taxExcluded + "円");
	}

}

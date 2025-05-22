package com.example.demo;

public enum DishSize {
	LARGE("大盛", 100.0), MEDIUM("並", 0.0), SMALL("小盛", -50);

	private final String size; //サイズ//
	private final double changePrice; //変更価格//

	private DishSize(String size, double changePrice) {
		this.size = size;
		this.changePrice = changePrice;
	}

	public String getSize() {
		return size;
	}

	public double getChangePrice() {
		return changePrice;
	}

}

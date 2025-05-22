package com.example.demo;

public enum SpicyLevel {
	HOT("辛口", 50.0), MEDIUM("中辛", 0.0), MILD("甘口", 0.0); //辛さ・追加料金//

	private final String label;
	private final double addPrice;

	private SpicyLevel(String label, double addPrice) {
		this.label = label;
		this.addPrice = addPrice;
	}

	public String getLabel() {
		return label;
	}

	public double getAddPrice() {
		return addPrice;
	}
}

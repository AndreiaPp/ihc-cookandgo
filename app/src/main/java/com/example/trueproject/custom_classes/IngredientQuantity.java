package com.example.trueproject.custom_classes; //

public class IngredientQuantity {
	private Ingredient ingredient;
	private double quantity;
	// private Unit unit;

	public IngredientQuantity(Ingredient ingredient, double quantity) {
		this.ingredient = ingredient;
		this.quantity = quantity;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double q) {
		quantity = q;
	}

//	public Unit getUnit() {
//		return unit;
//	}

	public IngredientQuantity getForNMeals (int nMeals) {
		return new IngredientQuantity(ingredient, quantity * nMeals);
	}

	@Override
	public String toString() {
		return String.format("%s: %f%s", ingredient, quantity, ingredient.getUnit());
	}
}
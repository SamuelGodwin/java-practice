/**
 * 
 */
public class Meal {
	
	public int calculateCalories(int starterCalories, int mainCalories, int dessertCalories){
		
		Dish starterDish = new Dish();
		starterDish.setCaloriesOfDish(starterCalories);
		Dish mainDish = new Dish();
		mainDish.setCaloriesOfDish(mainCalories);
		Dish dessertDish = new Dish();
		dessertDish.setCaloriesOfDish(dessertCalories);
	
		int totalCalories = starterCalories + mainCalories + dessertCalories;
		
		return totalCalories;

	}

}
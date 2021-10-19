/**
 *
 */
public class Person {
	
	/* Private field which stores the number of calories consumed by a person.
	 * Note: The default value for 'integer' primitive data type is zero.
	 * This only needs to be set once to its default value zero.
	 */
	private int caloriesConsumed;	
	

	public void eatMeal(int starterCalories, int mainCalories, int dessertCalories){
		
		Meal foodToEat = new Meal();
		caloriesConsumed = caloriesConsumed + foodToEat.calculateCalories(starterCalories, mainCalories, dessertCalories); 

	}
	

	public int goForWalk(int minutesWalked){
		
		caloriesConsumed = caloriesConsumed - minutesWalked; 
		
		return caloriesConsumed;
		
	}	
	
	public int returnCaloriesConsumed(){
		
		return caloriesConsumed;
		
	}
	
}
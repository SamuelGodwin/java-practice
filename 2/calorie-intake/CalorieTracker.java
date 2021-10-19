/**
 *
 */
public class CalorieTracker {

	public static void main(String[] args){
		
		Person mrPerson = new Person();
		System.out.println("Mr. Person's TOTAL no. of calories:\t\t\t" + mrPerson.returnCaloriesConsumed() + ".\n");
		
		Meal pizzaDinner = new Meal();		//670 calories
		mrPerson.eatMeal(100,350,220);
		System.out.println("Meal with the lowest calories - Pizza Dinner:\t\t" + pizzaDinner.calculateCalories(100,350,220) + "  calories.");
		System.out.println("Mr. Person's TOTAL no. of calories after this meal:\t" + mrPerson.returnCaloriesConsumed() + "  calories.\n");
		
		Meal halloumiLunch = new Meal();	//1000 calories
		mrPerson.eatMeal(120,510,370);
		System.out.println("Meal with 1000 calories - Halloumi Lunch:\t\t" + halloumiLunch.calculateCalories(120,510,370) + " calories.");
		System.out.println("Mr. Person's TOTAL no. of calories after this meal:\t" + mrPerson.returnCaloriesConsumed() + " calories.\n");
		
		Meal omeletteBreakfast = new Meal(); //1190 calories
		mrPerson.eatMeal(350,715,125);
		System.out.println("Meal with the highest calories - Omelette Breakfast:\t" + omeletteBreakfast.calculateCalories(350,715,125) + " calories");
		System.out.println("Mr. Person's TOTAL no. of calories after this meal:\t" + mrPerson.returnCaloriesConsumed() + " calories.\n");

		int noteCaloriesBefore = mrPerson.returnCaloriesConsumed(); //note the calories before the walk
		
		mrPerson.goForWalk(860);
		
		System.out.println("Number of minutes Mr. Person has walked (for 2000 cal):\t" + (noteCaloriesBefore - mrPerson.returnCaloriesConsumed()) + " minutes.");	//Calories before walk - total calories after = number of minutes as walk burns 1 calorie per minute.
	}
	
}
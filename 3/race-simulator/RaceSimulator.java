/**
 *
 */
 public class RaceSimulator {

	public static void main(String[] args){

		RaceTrack silverstone = new RaceTrack(83, false); //set av lap time to 83sec. 
						//make sure it is not raining to begin with
		
		/* Note: if the second parameter is set to above 100 here my program handles it by setting fuel to its maximum value of 100. */
		Car car1 = new Car(1, 80, 7, 3, 35, 21, 10);						
		
		Car car2 = new Car(2, 49, 3, 4, 20, 15, 11);
		
		Car car3 = new Car(3, 67, 8, 4, 29, 16, 11);
		
		System.out.println("Rain on silverstone is " + silverstone.getIsRaining() + ".");
		
		// Each car completes a lap of silverstone by calling the 'completeLap' method with silverstone as a parameter 
		car1.completeLap(silverstone);
		car2.completeLap(silverstone);
		car3.completeLap(silverstone);
		System.out.println("car 1 totalTime: " + car1.getTotalTime() + ".");
		System.out.println("car 2 totalTime: " + car2.getTotalTime() + ".");
		System.out.println("car 3 totalTime: " + car3.getTotalTime() + ".");
		System.out.println("The car in the lead after lap 1 is car " + silverstone.determineRaceLeader(car1, car2, car3, silverstone) + ".");
		
		car1.completeLap(silverstone);
		car2.completeLap(silverstone);
		car3.completeLap(silverstone);
		System.out.println("car 1 totalTime: " + car1.getTotalTime() + ".");
		System.out.println("car 2 totalTime: " + car2.getTotalTime() + ".");
		System.out.println("car 3 totalTime: " + car3.getTotalTime() + ".");
		System.out.println("The car in the lead after lap 2 is car " + silverstone.determineRaceLeader(car1, car2, car3, silverstone) + ".");
		
		silverstone.setIsRaining(true);
		System.out.println("Rain on silverstone now set to " + silverstone.getIsRaining() + ".");

		car1.completeLap(silverstone);
		car2.completeLap(silverstone);
		car3.completeLap(silverstone);
		System.out.println("car 1 totalTime: " + car1.getTotalTime() + ".");
		System.out.println("car 2 totalTime: " + car2.getTotalTime() + ".");
		System.out.println("car 3 totalTime: " + car3.getTotalTime() + ".");
	
		// Prints the leader in the race after lap 3 and so the overall winner of the race.
		System.out.println("The car in the lead after lap 3 is car " + silverstone.determineRaceLeader(car1, car2, car3, silverstone) + ". WINNER!!");

	}
}

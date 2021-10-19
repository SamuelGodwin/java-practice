/**
 *
 */
 public class Car {

	private int id;
	private int fuel;	
	private int lowFuelBoost;
	private int highFuelSlowdown;
	private int fuelConsumptionPerLap;
	private int pitStopTime;
	private int rainSlowdown;
	private int totalTime;


	public Car(int id, int fuel, int lowFuelBoost, int highFuelSlowdown, int fuelConsumptionPerLap, int pitStopTime, int rainSlowdown){
	

		this.id = id;	
		

		if (fuel <= 100) {

			this.fuel = fuel;
		}
		else {
			System.out.println("Max fuel allowed is 100. Fuel set to max 100.");	
			fuel = 100;
			System.out.println("Fuel of car " + id + " is now " + fuel);	
		}
		

		this.lowFuelBoost = lowFuelBoost;
		this.highFuelSlowdown = highFuelSlowdown;
		this.fuelConsumptionPerLap = fuelConsumptionPerLap;
		this.pitStopTime = pitStopTime;
		this.rainSlowdown = rainSlowdown;
		// Note: 'totalTime', as an integer type, already has a default value of 0 so does not have to be assigned a value.
		
	}
	

	public int getCarID(Car Car){
		return id;
	}
	
	

	public int completeLap(RaceTrack RaceTrack) {
		
		if (fuel > 50) {
			totalTime += (RaceTrack.getAverageLapTime() + highFuelSlowdown); 
		} 
		
		else {
			totalTime += (RaceTrack.getAverageLapTime() - lowFuelBoost);
		}
		if (RaceTrack.getIsRaining() == true){
			totalTime += rainSlowdown;
		}
		
		fuel -= fuelConsumptionPerLap;
		
		/* If a car's fuel is less than that required to complete a lap, it takes a pit stop thereby increasing the car's fuel back to its maximum
		 * value of 100.	*/
		if (fuel < fuelConsumptionPerLap){ 
			totalTime += pitStopTime;		
			fuel = 100;
		}
		
		return totalTime;
	}


	public int getTotalTime(){
		return totalTime; 
		
	}

}
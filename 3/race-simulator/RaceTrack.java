/**
 *
 */
 public class RaceTrack {

	private int averageLapTime;
	private boolean isRaining;
	

	public RaceTrack(int averageLapTime, boolean isRaining){
		
		this.averageLapTime = averageLapTime;
		this.isRaining = isRaining;
		
	}
	

	public void setIsRaining(boolean isRaining){
		this.isRaining = isRaining;
		
	}
	

	public boolean getIsRaining(){ // Note: this method is only used for extra presentation and information when my program is executed.
		return isRaining;
	}


	public int getAverageLapTime(){ 
		return averageLapTime;
	}

	

	public int determineRaceLeader(Car car1, Car car2, Car car3, RaceTrack RaceTrack){ 
	
		if (car1.getTotalTime() < car2.getTotalTime() && car1.getTotalTime() < car3.getTotalTime()){

				return car1.getCarID(car1);

		}
		else if (car2.getTotalTime() < car3.getTotalTime() && car2.getTotalTime() < car1.getTotalTime()){
				return car2.getCarID(car2);	
		}
		else {
				return car3.getCarID(car3);
		
		}
		
	}

}
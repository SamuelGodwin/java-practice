/**
 *
 */
public class Aeroplane {

	private String name;
	private Coordinates coordinates;
	private int speed;
	private int totalDistance;
	private int singleJourneyDistance;
	//	Stores a total distance at which an aeroplane requires 7 days of repairs.
	private int repairDistance;
	//	To demonstrate that each pass of my while loop is an hour.
	private int hour;
	//	Private field of type 'int' which stores the total number of repairs for an object of 'Aeroplane'.
	private int numberOfRepairs;
	//	Acts as index variable in my for loop in my driver class.
	private int day;

	public Aeroplane(String name, Coordinates coordinates, int speed, int totalDistance, int repairDistance){
		this.name = name;
		this.coordinates = coordinates;
		this.speed = speed;
		this.totalDistance = totalDistance;
		this.repairDistance = repairDistance;
	}
	
	public int singleFlight(Destination startDestination, Aeroplane aeroplane, Destination endDestination){
	
		//	Resets the variable containing the distance of the previous flight to zero.
		singleJourneyDistance = 0;
		
		/*	The aeroplane keeps moving towards the destination, changing its position every hour (every loop), until its x coordinate matches the x coordinate 
		of that of the destination, and its y coordinate matches y coordinate of the destination.	*/
		while (aeroplane.getCoordinates().getValueX() != endDestination.getCoordinates().getValueX() || aeroplane.getCoordinates().getValueY() != endDestination.getCoordinates().getValueY()) {		
			//	The coordinates of 'aeroplane' will increase or decrease, depending on whether it is lower or higher (respectively) than the x coordinate of the destination. 
			
			/*	'x' coordinate:
			 *	if x coordinate of aeroplane is less than x coordinate of destination...	*/
			if(aeroplane.getCoordinates().getValueX() < endDestination.getCoordinates().getValueX()){
				//	Code for ADDITION:
				int distanceRemainingX = endDestination.getCoordinates().getValueX() - aeroplane.getCoordinates().getValueX();
				//	When the distance left to travel is less than the aeroplane's speed, the x coordinate is increased by only the distance left to travel.
				if (distanceRemainingX < speed){
				//	Adds what is left to get the aeroplane to the destination coordinates.
				aeroplane.getCoordinates().setValueX(aeroplane.getCoordinates().getValueX() + distanceRemainingX);
				//	Increases 'singleJourneyDistance' by the distance covered in the above move.
				singleJourneyDistance += distanceRemainingX;
				}
				else{
					aeroplane.getCoordinates().setValueX(aeroplane.getCoordinates().getValueX() + speed);
					singleJourneyDistance += speed;
				}
			}
			//	Otherwise, if x coordinate of aeroplane is more than x coordinate of destination...
			else if(aeroplane.getCoordinates().getValueX() > endDestination.getCoordinates().getValueX()){
				//	Code for SUBTRACTION:
				int distanceRemainingX = aeroplane.getCoordinates().getValueX() - endDestination.getCoordinates().getValueX();
				//	When the distance left to travel is less than the aeroplane's speed, the x coordinate is decreased by only the distance left to travel.
				if (distanceRemainingX < speed){
				//	Subtracts what is left to get the aeroplane to the destination coordinates.
				aeroplane.getCoordinates().setValueX(aeroplane.getCoordinates().getValueX() - distanceRemainingX);
				//	Increases 'singleJourneyDistance' by the distance covered in the above move.
				singleJourneyDistance += distanceRemainingX;
				}
				//	Otherwise, the x coordinate is decreased by the 'speed' of the aeroplane.
				else{
					aeroplane.getCoordinates().setValueX(aeroplane.getCoordinates().getValueX() - speed);
					singleJourneyDistance += speed;
				}
			}
			
			/*	'y' coordinate:
			 *	if y coordinate of aeroplane is less than y coordinate of destination...	*/
			if(aeroplane.getCoordinates().getValueY() < endDestination.getCoordinates().getValueY()){
				//	Code for ADDITION:
				int distanceRemainingY = endDestination.getCoordinates().getValueY() - aeroplane.getCoordinates().getValueY(); 
				if (distanceRemainingY < speed){
				//	Adds what is left to get the aeroplane to the destination coordinates.
				aeroplane.getCoordinates().setValueY(aeroplane.getCoordinates().getValueY() + distanceRemainingY);
				//	Increases 'singleJourneyDistance' by the distance covered in the above move.
				singleJourneyDistance += distanceRemainingY;
				}
				else{
					aeroplane.getCoordinates().setValueY(aeroplane.getCoordinates().getValueY() + speed);
					singleJourneyDistance += speed;
				}
			}
			//	Otherwise, if y coordinate of aeroplane is more than x coordinate of destination...
			else if(aeroplane.getCoordinates().getValueY() > endDestination.getCoordinates().getValueY()){
				//	Code for SUBTRACTION:
				int distanceRemainingY = aeroplane.getCoordinates().getValueY() - endDestination.getCoordinates().getValueY();
				//	When the distance left to travel is less than the aeroplane's speed, the y coordinate is decreased by only the distance left to travel.
				if (distanceRemainingY < speed){
				aeroplane.getCoordinates().setValueY(aeroplane.getCoordinates().getValueY() - distanceRemainingY);
				singleJourneyDistance += distanceRemainingY;
				}
				else{
					aeroplane.getCoordinates().setValueY(aeroplane.getCoordinates().getValueY() - speed);
					singleJourneyDistance += speed;
				}
			}
		}
		
		totalDistance += singleJourneyDistance;

		return singleJourneyDistance;
	}


	public int getTotalDistance(){
		return totalDistance;
	}
	

	public Coordinates getCoordinates(){
		return coordinates;
	}
	

	public String getName(){
		return name;
	}
	

	public int getRepairDistance(){
		return repairDistance;
	}
	

	public int getNumberOfRepairs(){
		return numberOfRepairs;
	}
	

	public int getDay(){
		return day;
	}
	
	public void setDay(int day){
		this.day = day;
	}
	
	public void setTotalDistance(int totalDistance){
		this.totalDistance = totalDistance;
	}
	
	// Use of 'this' keyword avoids naming conflicts.
	public void setNumberOfRepairs(int numberOfRepairs){
		this.numberOfRepairs = numberOfRepairs;
	}
}
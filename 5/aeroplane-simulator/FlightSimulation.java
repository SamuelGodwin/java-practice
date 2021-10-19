/**
 *
 *	Creates 'FlightSimulation' class. This is the driver class for my solution. It contains the definition for my 'main' method.
 *	This  class is the only class that is to be compiled and run directly, as the compiler will automatically compile my other referenced classes.
 *	This class and its method are public, so are accessible anywhere.	
 *
 */
 public class FlightSimulation {
		
	public static void main(String[] args){		


		Coordinates coordinatesPlane = new Coordinates(50, 20);

		Coordinates coordinates1 = new Coordinates(50,20);

		Coordinates coordinates2 = new Coordinates(60,25);

		Coordinates coordinates3 = new Coordinates(135,115);
		
		Aeroplane aeroplane = new Aeroplane("Boeing 707", coordinatesPlane, 8, 0, 4000);

		Destination destination1 = new Destination("Madrid", coordinates1);

		Destination destination2 = new Destination("Manchester", coordinates2);

		Destination destination3 = new Destination("Brasalia", coordinates3);

		//	Starts 'for' loop, incrementing it by exactly 1 for each iteration through the loop, for 120 days.
		for(aeroplane.setDay(1); aeroplane.getDay() <=120; aeroplane.setDay(aeroplane.getDay() + 1)){
			//	If aeroplane has not travelled a far enough distance to require 7 days of repairs...
			if (aeroplane.getTotalDistance() < aeroplane.getRepairDistance()){
				System.out.println("\n\t*+----------------------------------------------------------------------------------------------+*");
				System.out.println("\t\t\t\t\t\t\tDAY " + aeroplane.getDay() + ".\t\t\t\t\t\t");
				System.out.println("\t*+----------------------------------------------------------------------------------------------+*\n");
				//	Prints the TOTAL DISTANCE travelled by the aeroplane up until the start of the day's schedule.
				System.out.println("AEROPLANE'S TOTAL DISTANCE : \t" + aeroplane.getTotalDistance());
				/*	Within this IF statement below is my aeroplane's schedule for a single day.	
				 *	Prints the name of my aeroplane and the journey start destination (which is destination1) and the journey end destination, destination2.	*/
				System.out.println("+---------------------------------------------------------------------------------------------------------------+");	
				System.out.println("|\tAEROPLANE - " + aeroplane.getName() + "\t|\tSTART DESTINATION - " + destination1.getName() + ".\t|\tEND DESTINATION - " + destination2.getName() + ".\t|");
				System.out.println("+---------------------------------------------------------------------------------------------------------------+");	
				//	Prints this single journey's distance. 
				System.out.println("SINGLE JOURNEY DISTANCE    : \t" + aeroplane.singleFlight(destination1, aeroplane, destination2));
				//	Prints the TOTAL DISTANCE travelled by aeroplane object. 
				System.out.println("AEROPLANE'S TOTAL DISTANCE : \t" + aeroplane.getTotalDistance());
				//	Prints my aeroplane's current location coordinates. 
				System.out.println("AEROPLANE'S COORDINATES    : \t(" + aeroplane.getCoordinates().getValueX() + ", " + aeroplane.getCoordinates().getValueY() + ")");
				
				//	Prints the name of my aeroplane and the journey start destination (which is destination2) and the journey end destination, destination3.
				System.out.println("+---------------------------------------------------------------------------------------------------------------+");	
				System.out.println("|\tAEROPLANE - " + aeroplane.getName() + "\t|\tSTART DESTINATION - " + destination2.getName() + ".\t|\tEND DESTINATION - " + destination3.getName() + ".\t|");	
				System.out.println("+---------------------------------------------------------------------------------------------------------------+");	
				//	Prints this single journey's distance. 
				System.out.println("SINGLE JOURNEY DISTANCE    : \t" + aeroplane.singleFlight(destination2, aeroplane, destination3));
				//	Prints the TOTAL DISTANCE travelled by aeroplane object. 
				System.out.println("AEROPLANE'S TOTAL DISTANCE : \t" + aeroplane.getTotalDistance());
				//	Prints my aeroplane's current location coordinates. 
				System.out.println("AEROPLANE'S COORDINATES    : \t(" + aeroplane.getCoordinates().getValueX() + ", " + aeroplane.getCoordinates().getValueY() + ")");
				
				//	Prints the name of my aeroplane and the journey start destination (which is destination3) and the journey end destination, destination2.
				System.out.println("+---------------------------------------------------------------------------------------------------------------+");	
				System.out.println("|\tAEROPLANE - " + aeroplane.getName() + "\t|\tSTART DESTINATION - " + destination3.getName() + ".\t|\tEND DESTINATION - " + destination2.getName() + ".\t|");	
				System.out.println("+---------------------------------------------------------------------------------------------------------------+");					
				//	Prints this single journey's distance. 
				System.out.println("SINGLE JOURNEY DISTANCE    : \t" + aeroplane.singleFlight(destination3, aeroplane, destination2));
				//	Prints the TOTAL DISTANCE travelled by aeroplane object. 
				System.out.println("AEROPLANE'S TOTAL DISTANCE : \t" + aeroplane.getTotalDistance());
				//	Prints my aeroplane's current location coordinates. 
				System.out.println("AEROPLANE'S COORDINATES    : \t(" + aeroplane.getCoordinates().getValueX() + ", " + aeroplane.getCoordinates().getValueY() + ")");
				
				//	Prints the name of my aeroplane and the journey start destination (which is destination2) and the journey end destination, destination1.
				System.out.println("+---------------------------------------------------------------------------------------------------------------+");	
				System.out.println("|\tAEROPLANE - " + aeroplane.getName() + ".\t|\tSTART DESTINATION - " + destination2.getName() + ".\t|\tEND DESTINATION - " + destination1.getName() + ".\t|");	
				System.out.println("+---------------------------------------------------------------------------------------------------------------+");	
				//	Prints this single journey's distance. 
				System.out.println("SINGLE JOURNEY DISTANCE    : \t" + aeroplane.singleFlight(destination2, aeroplane, destination1));
				//	Prints the TOTAL DISTANCE travelled by aeroplane object. 
				System.out.println("AEROPLANE'S TOTAL DISTANCE : \t" + aeroplane.getTotalDistance());
				//	Prints my aeroplane's current location coordinates. 
				System.out.println("AEROPLANE'S COORDINATES    : \t(" + aeroplane.getCoordinates().getValueX() + ", " + aeroplane.getCoordinates().getValueY() + ")");
			}
				
			// Otherwise, do not take ANY flights for 7 days, reset 'setTotalDistance', increase 'numberOfRepairs'.
			else {
				//	Prints some informative info.
				System.out.println("*UNDERGOING REPAIR! (TOTAL DISTANCE: " + aeroplane.getTotalDistance() + " AS OF END OF DAY " + (aeroplane.getDay() - 1) + ")*");
				//	Sets 'day' field to 'day' + 6; not 7 as it already adds a day automatically, for each loop.
				aeroplane.setDay(aeroplane.getDay() + 6); //
				//	Resets totalDistance of aeroplane to 0.
				aeroplane.setTotalDistance(0);
				//	Increases number of repairs of an aeroplane by 1.
				aeroplane.setNumberOfRepairs(aeroplane.getNumberOfRepairs() + 1);
				//	Prints some informative info.
				System.out.println("NUMBER OF DAYS UPON END OF THIS REPAIR: " + aeroplane.getDay() + ".");
			}
		}
			
		//	Prints the number of repairs of an aeroplane object.
		System.out.println("AEROPLANE'S NO. OF REPAIRS : \t" + aeroplane.getNumberOfRepairs());
	}
}
	
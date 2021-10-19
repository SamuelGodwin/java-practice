/**
 *
 *	Creates 'Destination' class. This class contains definitions for a constructor method, 'Destination' as well as methods 
 *	'getCoordinates' and 'getName'.
 *	This class also contains initialisations of the fields 'name' and 'coordinates', which are private and of data type 'String' and 'Coordinates', respectively.
 *	'getName' and 'getCoordinates' are accessor methods for the 'name' and 'coordinates' fields respectively.
 *	This class and its methods are public, so are accessible anywhere.
 *
 */
 public class Destination {

	private String name;
	private Coordinates coordinates;


	public Destination(String name, Coordinates coordinates){
		this.name = name;
		this.coordinates = coordinates;
	}
	

	public Coordinates getCoordinates(){
		return coordinates;
	}
	

	public String getName(){
		return name;
	}
}
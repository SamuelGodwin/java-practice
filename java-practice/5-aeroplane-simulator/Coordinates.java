/**
 *
 *	Creates 'Coordinates' class. This class contains definitions for a constructor method, 'Coordinates' as well as methods 
 *	'setValueX', 'setValueY', 'getValueX' and 'getValueY.
 *	This class also contains initialisations of the fields 'x' and 'y', which are private and of data type 'int'.
 *	'getValueX' and 'getValueY' are accessor methods for the 'x' and 'y' fields respectively.
 *	'setValueX' and 'setValueY' are mutator methods for the 'x' and 'y' fields respectively.
 *	This class and its methods are public, so are accessible anywhere.
 *
 */
 public class Coordinates {

	private int x;
	private int y;
	

	public Coordinates(int x, int y){
		this.x = x;
		this.y = y;
	}
	

	public void setValueX(int x){

		this.x = x;
	}
	

	public void setValueY(int y){
		this.y = y;
	}
	

	public int getValueX(){
		return x;
	}
	

	public int getValueY(){
		return y;
	}
}
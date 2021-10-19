/*	Keyword 'static' is not necessary for any of these method definitions as all methods in this class are being called through an object. 
	These classes and methods are public, so are accessible anywhere. Each method is 'void' since they do not return anything.	*/
public class Messages {	

	public void namePrinter() { 
	
		System.out.println("Samuel Godwin");
	
	}

	public void wordPrinter() {
	
		System.out.println("Lima");
	
	}
	

	public void incrementPrinter(int num) {	
	
		System.out.println(num + 1);		
	
	}
	
}
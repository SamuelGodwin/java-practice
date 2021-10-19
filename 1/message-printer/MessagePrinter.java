/*	Creates 'MessagePrinter' class. This is the driver class for my solution. It contains the 'main' method.
	This  class is the only class that is to be compiled and run directly, as the compiler will automatically compile my other referenced class.
	This class and its method are public, so are accessible anywhere.	*/
public class MessagePrinter {	

	public static void main(String[] args){

		Messages copyOfMessages = new Messages();
		
		copyOfMessages.namePrinter();
		copyOfMessages.wordPrinter();
		copyOfMessages.incrementPrinter(6);
	
	}

}
package GroupLambda.ResurrectionLambda;

public class FunctionalInterface {
	
	
	public interface  demo {
		
		public void  print (String name); //Single Abstract Method
		default void  defaultDemo (String name) {		
			System.out.println("Printing name "+name);	
		}
	}
	
	
	public static void main(String[] args) {
		
		
		
	}
	
	
	
	
	
	

}

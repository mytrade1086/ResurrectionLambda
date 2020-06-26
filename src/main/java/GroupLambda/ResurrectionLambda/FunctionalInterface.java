package GroupLambda.ResurrectionLambda;

public class FunctionalInterface {

	public interface demo {

		public void print(String name); // Single Abstract Method
		default void defaultDemo(String name) {
			System.out.println("Printing name " + name);
		}
	}

	public interface newInterface {
		public void newMethod(String name); // Single Abstract Method
	}

	public static void main(String[] args) {
		
		//1.Using Labmbda
		demo dm = (string) -> System.out.println("Implemented Functional Interface " + string);
		dm.print("Running");
		
		
		//2. Anonymous inner type
		newInterface nm = new newInterface() {
			@Override
			public void newMethod(String name) {
				System.out.println("new methid overridden " + name);
			}
		};		nm.newMethod("sumit");

	}

}

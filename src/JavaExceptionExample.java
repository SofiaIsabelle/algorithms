
public class JavaExceptionExample {

	public static void main(String[] args) {
		try {
			int data = 100/0; //infinite
			
		}
		catch(ArithmeticException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("rest of the code ...");
		System.out.println(30+50);
	}
	

}

import java.util.Random;
// kolla om det blir någon förändring nu
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int value = random.nextInt(21);
			if (value % 2 == 0) {
				System.out.println ("This Number is even " + value);
			}else {
				
			
				System.out.println("This number is odd " + value);
			}
			System.out.println("nu är jag klar");
	}
		
}

package digits.com;

public class DIGITS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "2461839532"; 
		boolean result = str.matches("[0-9]+"); 
		System.out.println("Original String : " + str); 
		System.out.println("Does string contain only Digits? : " + result); 

	}

}

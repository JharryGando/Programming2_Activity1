package firstnonrepeated.java;

public class FIRSTNONREAPETEDCHARACTER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				  String str1 = "Jhaarryyy";//My chosen words with duplicate characters
				  System.out.println("The given string is: " + str1);//using the System.out.println, The words inside the
				  													 //parenthesis will be printed on the console added by the str1
				  													//which is the "Jhaarryyy"
				  for (int i = 0; i < str1.length(); i++)
				  {
				   boolean word = true;
				   for (int j = 0; j < str1.length(); j++)
				   {
				    if (i != j && str1.charAt(i) == str1.charAt(j)) {
				     word = false;
				     break;
				    }
				   }
				   if (word) {
				    System.out.println("The first non repeated character in String is: " + str1.charAt(i));
				    break;
				    
				   }
				 }
			}
		


	}



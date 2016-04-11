package Lab6;
import java.util.*;
public class Lab6Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choice = "y";
System.out.println("Welcome to the Pig Latin Translator!");
Scanner userInput = new Scanner (System.in);
while (choice.equalsIgnoreCase("y"))
{
	System.out.println("Enter a line to be translated:");
	String translateThis = userInput.nextLine();
//translate  the user input to lower case
	translateThis= translateThis.toLowerCase();
			  System.out.println("");
		      System.out.println("Lower case translation: " +translateThis );
//define where the variable first letter is located (which is position 0 of the string)
	char firstLetter = translateThis.charAt(0);
		      pigTranslator(translateThis, firstLetter);
		      System.out.println("Translate another line? ('y'):"); 
		      choice = userInput.nextLine();
		   }

System.out.println("Bye!");
}

	/**
	 * @param translateThis
	 * @param firstLetter
	 */
	public static void pigTranslator(String translateThis, char firstLetter) {
		String pigLatin;
//if the first letter is a vowel just add way to the end of the word
		if (firstLetter == 'a' ||  firstLetter == 'e' || firstLetter == 'i' || 
		     firstLetter == 'o' || firstLetter == 'u')  
		     pigLatin = translateThis + "way";   
/* if the first letter is not a vowel then put the first letter of the 
* word at the end the word and add ay
*/
		  else
		     pigLatin = translateThis.substring(1) + translateThis.charAt(0) + "ay";
		  
		  System.out.println("Pig Latin translation: " + pigLatin);
	}

	}
	



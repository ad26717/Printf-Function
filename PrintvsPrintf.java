/**
* purpose : Using printf method
* author : Ali Demir
* email address : gsalidemir@gmail.com
*/
import java.util.Scanner;


public class PrintvsPrintf 
{
	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner(System.in);// creating a object to use Scanner class
		
		System.out.println("Now you have two options \n 1-Using Println \n 2-Using Printf");
		String option = "2";
		option = keyboard.next();// assigning next input to the object option

		if (option.equals("1"))// using if else function
			{
				System.out.println("You can see anything in println command");
			}
		else 
			{
				/*
				 Codes after this comment uses
				 printf function to display formatted outputs
				 */
				
				
				System.out.printf("Printf method has formatted outputs");
				
				char character = 'f';
				System.out.printf("\n now you will see a character \"%c\"", character);
				
				String stringapple = "apple";
				System.out.printf("\n now you will see a string \"%s\"", stringapple);
				
				int intnumber = 10;
				System.out.printf("\n now you will see an integer \"%d\"", intnumber);
				
				double floatnumber = 15.5;
				System.out.printf("\n now you will see a floating-point number \"%.2f\"", floatnumber);
				
				double exponentialnumber = 156.256;
				System.out.printf("\n now you will see an exponential floating numbber \"%e\"", exponentialnumber);
			}
	}
}

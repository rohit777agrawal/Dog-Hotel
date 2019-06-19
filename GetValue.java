import java.util.Scanner;

/*
Program for GetValue.
Author: Rohit Agrawal
E-mail Address: ra2381@email.vccs.edu
Programming Assignment HW13.
Last Changed: April 21, 2018.
*/

public class GetValue {
	
	private int minimum, maximum;
	private String prompt;

	   // default constructor
	   public GetValue()
	   {
	      minimum = 0;
	      maximum = 100;
	      prompt = "no prompt yet";
	   }
	   
	   // Constructor to set all instance variables
	   public GetValue(int max, int min, String message)
	   {
	      minimum = min;
	      maximum = max;
	      prompt = message;
	   }

	   // Mutator to set all instance variables  
	   public void setGetValue(int max, int min, String message)
	   {
	      minimum = min;
	      maximum = max;
	      prompt = message;
	   }
	   
	   public String getPrompt()
	   {
		   return prompt;
	   }
	
	/* 
	    * Precondition: all three instance variables are valid
	    * Postcondition:  
	    */ 
	@SuppressWarnings("resource")
	public int getInt()
	   {
	      int value=0;
	      boolean retry = true;
	      Scanner keyboard = new Scanner(System.in);
	      do 
	      {
	         System.out.println(prompt);
	         value = keyboard.nextInt();
	         if ((value < minimum) || (value > maximum))
	         {
	            System.out.println(value + " is out of range, reenter.");
	         }
	         else
	         {
	            retry = false;
	         }
	      } while (retry);
	      return value;   
	    }
}

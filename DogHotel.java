import java.util.Scanner;

/*
Program for DogHotel.
Author: Rohit Agrawal
E-mail Address: ra2381@email.vccs.edu
Programming Assignment HW13.
Last Changed: April 21, 2018.
*/

public class DogHotel {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		// array used and 3 spaces reserved for each guest.
		Dog guest[] = new Dog[3];
				
		// initialized the GetValue variables. 
		GetValue hello = new GetValue(20, 1, "Enter dog Age");
		
		Scanner keyboard = new Scanner(System.in);
		
		for (int index = 0; index<3; index++)
		{
			String name, breed;
			int age;
			System.out.println("Enter dog name");
			name = keyboard.nextLine();
			System.out.println("Enter dog breed");
			breed = keyboard.nextLine();
			
			age = hello.getInt();
			// add data to each index. 
			guest[index] = new Dog(name, breed, age);
			
		}
		
		// print out like a table in console. 
		System.out.println("Guest\t\tbreed\t\tAge");
		System.out.println("------------------------------------");
		
		for(int index = 0; index<3; index++)
		{
			System.out.print(guest[index].getName() + "\t\t");
			System.out.print(guest[index].getBreed() + "\t\t");
			System.out.println(guest[index].getAge());
		}
		
		
		
	}
}

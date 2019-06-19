
/*
Program for Dog.
Author: Rohit Agrawal
E-mail Address: ra2381@email.vccs.edu
Programming Assignment HW13.
Last Changed: April 21, 2018.
*/ 

public class Dog
{
	private String name;
	private String breed;
	private int age;
	
	// default constructor
	public Dog()
	{
		name = "no name yet";
		breed = "no breed yet";
		age = 0;
	}
	
	// Constructor to set all instance variables
	public Dog(String newName, String newBreed, int newAge)
	   {
		name= newName;
		breed = newBreed;
		age = newAge;
	   }
	
	// Mutator to set all instance variables  
	public void setDog (String newName, String newBreed, int newAge)
	{
		name= newName;
		breed = newBreed;
		age = newAge;
	}
	
	public String getName()								
	{
		return name;
	}
	
	public String getBreed()
	{
		return breed;
		
	}
	
	public int getAge()
	{
		return age;
	}
	
	
	/*public boolean equals(Dog otherDog)
	{
		return (this.name.equalsIgnoreCase(otherDog.name)) && 
				(this.breed.equalsIgnoreCase(otherDog.breed)) &&
				(this.age == otherDog.age);
	}*/
	
	
	
	
	/*public int getAgeInHumanYears()
	{
		int humanYears = 0;
		if (age <= 2)
		{
			humanYears = age * 11;
		}
		else
		{
			humanYears = 22 + ((age-2) * 5);
		}
		return humanYears;
	}*/
	
	
}
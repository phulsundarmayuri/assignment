package Assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment4 {
   //Assignment4 (Arrays & Collections)
	 
	public static void main(String[] args) {
		
    //1. Create Lists with area of top 5 largest cities.Print the total area of the 3rd and 4th cities combined.
    	List<Float> areaofcities = new ArrayList<Float>(); 
    	
		areaofcities.add(1484.0f);
		areaofcities.add(872.81f);
		areaofcities.add(681.96f);
		areaofcities.add(650.0f);
		areaofcities.add(631.0f);
		
		System.out.println("Total area of the 3rd and 4th cities : " + (areaofcities.get(2) + areaofcities.get(3)) );
		
	//2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
		Set<String> touristattractions = new HashSet<String>(); 
		
		touristattractions.add("ForbiddenCity,Beijing,China");
		touristattractions.add("Great Mosque of Mecca, Saudi Arabia");
		touristattractions.add("Giza Necropolis, Egypt");
		touristattractions.add("Colosseum, Rome, Italy");
		touristattractions.add("Notre-Dame de Paris, France");
		touristattractions.add("St. Peter’s Basilica, Vatican City");
		touristattractions.add("Palace of Versailles, France");
		touristattractions.add("Eiffel Tower, Paris, France");
		touristattractions.add("Sistine Chapel, Vatican City");
		touristattractions.add("Taj Mahal, Agra, India");
		
		System.out.println("The top 10 most visited tourist attractions in the world : " + touristattractions);
		System.out.println("The size of the most visited tourist attractions in the world : " + touristattractions.size());
		
	//3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.
		int number[] = {10,20,30,40,50,60,70,80,90,100};
	    int AverageofNum = (number[4]+ number[5])/2;
	    
		System.out.println("the Average of 5th and 6th Value : " + AverageofNum);
		
	//4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		List<String> MoviesofArraylist = new ArrayList<String>(); 
		MoviesofArraylist.add("Avatar");
		MoviesofArraylist.add("Avengers:Endgame");
		MoviesofArraylist.add("Avatar:The Way of Water");
		MoviesofArraylist.add("Titanic");
		MoviesofArraylist.add("Ne Zha 2");
		
		System.out.println("The third movie on the list = " + MoviesofArraylist.get(2));
		
	}

}

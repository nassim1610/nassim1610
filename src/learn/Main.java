package learn;

public class Main {

	public static void main(String[] args) {

//		Shirt s = new Shirt();     //Shirt object who called s equal to new Shirt , new Shirt make new Shirt and constructor make new object so "new Shirt" should be the constructor, and it the constructor and Shirt() is the default constructor  
//                                // constructor bicycle is the methods who make your object
//		               //object is a instance of a class
//		s.setColor("reed");  
//		s.setSize('M');
//		
//		s.putOn();  //we use this syntax if u print the statement before

		//=================================
		//other method 
		Shirt s = new Shirt("white", 'M');
		 		
		//=================================
		System.out.println(s.color); //use this syntax if u did not print the statement before in shirt class 
		System.out.println(s.size);
		
		
		//method is block of code   contain a logic 
	}

}

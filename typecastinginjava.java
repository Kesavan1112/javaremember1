// Java Program to demonstrate Explicit downcasting 
import java.io.*; 
class Animal { 
	public void eat() 
	{ 
		System.out.println("The animal is eating."); 
	}
    
    public void meow() 
	{ 
		System.out.println("The animal is meowing."); 
	} 
} 

class Cat extends Animal { 
	public void meow() 
	{ 
		System.out.println("The cat is meowing."); 
	} 

    public void eat() 
	{ 
		System.out.println("The cat is eating."); 
	} 
} 

class typecastinginjava{ 
	public static void main(String[] args) 
	{ 
		/*Animal animal = new Cat(); 
		animal.eat(); 

		// Explicit downcasting 
		Cat cat = (Cat)animal; 
		cat.meow(); */

        
        
        
	} 
}

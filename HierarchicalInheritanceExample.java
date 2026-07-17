package day8;

class Parent2
{
	String familyCar = "Toyota";
	
	void greet()
	{
		System.out.println("Hello from Parent2");
	}
}

class Child2 extends Parent2
{
	String hobby = "Painting";
	
	void child2Method()
	{
		System.out.println("This is Child2");
	}
}

class Child3 extends Parent2
{
	String favouriteSport ="Soccer";
	
	void child3Method()
	{
		System.out.println("This is Child3");
	}
}

public class HierarchicalInheritanceExample 
{

	public static void main(String[] args) 
	{
		Child2 obj2 = new Child2(); // creates an object of class Child2
		System.out.println(obj2.hobby); // Child2 variable
		obj2.child2Method(); //Child2 method
		
		System.out.println(obj2.familyCar); // child2 inherited variable
		obj2.greet();// child2 inherited method
		
		Child3 obj3 = new Child3();
		
		System.out.println(obj3.familyCar); // Child3 inherited variable
		obj3.greet(); //Child3 inherited method
		
		

	}

}
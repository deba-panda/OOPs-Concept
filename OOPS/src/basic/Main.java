package basic;



public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		//object
		//Person P1 = new Person();
		
		//Accessing properties
		//P1.age = 25;
		//P1.name = "Deb";
		
		//Another object
		//Person P2 = new Person();
		//P2.age = 30;
		//P2.name = "Tom";
		
		Person P3 = new Person(35,"John");
		
		//System.out.println(P1.age+" "+P1.name );
		//System.out.println(P2.age+" "+P2.name );
		System.out.println(P3.age+" "+P3.name );
		
		//Accessing behavior
		//P1.eat();
		//P2.walk();
		//P2.walk(5);
		
		System.out.println(Person.count);
		
		QA q1=new QA(20,"Jerry");
		q1.walk();
		q1.walk(20);
		
	
		

	}
	
	
}
//Class
class Person {
	//properties
	int age;
	protected String name;//only available to children class
	
	//static keyword(access through class name)
	static int count;
	
	//Constructor
	//public Person(){
		//count++;
		//System.out.println("creating an object");
	//}
	
	//Constructor overloading
	public Person(int age,String name) {
		//this keyword
		//this();
		this.name = name;
		this.age=age;
	}
	
	//Behavior
	
	void walk() {
		System.out.println(name+" is walking");
	}
	 
	void  eat() {
		System.out.println(name+" is eating");
	}
	
	//Method overloading (compile time polymorphism)
	void walk(int steps) {
		System.out.println(name+" is walking "+steps+ " steps ");
	}
	 
}
//Inheritance
class QA extends Person{

	public QA(int age, String name) {
		//super keyword
		super(age, name);
		
	}
	//Run-time Polymorphism
	void walk() {
		System.out.println("QA "+ name +" walking");
	}
	
}


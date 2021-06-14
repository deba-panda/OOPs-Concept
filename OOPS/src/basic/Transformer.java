package basic;

public class Transformer implements Vehicle,human {

	public static void main(String[] args) {
		
		Transformer t = new Transformer();
		t.start();
		t.walk();

	}

	@Override
	public void start() {
		
		System.out.println("Transformer is starting");
	}

	@Override
	public void walk() {
		
		System.out.println("Transformer is walking");
		
		
	}

}

interface Vehicle{
	void start();
}


interface human{
	void walk();
}
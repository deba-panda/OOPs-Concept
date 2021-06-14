package encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		
		Laptop l1=new Laptop();
		l1.setPrice(30000);
		
		System.out.println(l1.getPrice());
		
		}
	
}

class Laptop{
	int ram;
	private int price;
	
	public void setPrice(int price) {
		
		boolean isAdmin = false;
		if(!isAdmin) {
			System.out.println("You are not admin");
		}else {
		this.price = price;
	}
	}

	
	public int getPrice() {
		return price;
	}
}

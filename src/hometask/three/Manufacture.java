package hometask.three;

public class Manufacture {
	
	protected String name; 
	
	public Manufacture( String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void brandName() {
		System.out.println("Vehicle brand is" + this.name);
	}
}

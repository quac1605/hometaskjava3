package hometask.three;

public abstract class Vehicle {
	
	enum Color{
		RED,
		BLUE,
		GREEN,
		YELLOW,
		ORANGE,
		BLACK,
		WHITE,
		GRAY,
		PURPLE,
		ROSE,
		BROWN
	}
	
	//Attribute
	protected int id;
	protected Manufacture brand;
	protected String model;
	protected int yearManufacture;
	protected Color color;
	protected int price;
	protected int registrationNumber;
	protected Engine engineType;

	//Constructor
	public Vehicle(int id, Manufacture brand, String model,int yearManufacture, Color color,int price,int registrationNumber, Engine engineType) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.yearManufacture = yearManufacture;
		this.color = color;
		this.price = price;
		this.registrationNumber = registrationNumber;
		this.engineType = engineType;
	}	
	//Setter
	public void setId(int id) {
		this.id = id;
	}
	public void setMake(Manufacture brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYearManufacture(int yearManufacture) {
		this.yearManufacture = yearManufacture;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public void setEngineType(Engine engineType) {
		this.engineType = engineType;
	}
		
	//Getter	
	public int getId() {
		return this.id;
	}
	public Manufacture getBrand() {
		return this.brand;
	}
	public String getModel() {
		return this.model;
	}
	public int getYearManufacture() {
		return this.yearManufacture;
	}
	public Color getColor() {
		return this.color;
	}
	public int getPrice() {
		return this.price;
	}
	public int getRegistrationNumber() {
		return this.registrationNumber;
	}
	public Engine getEngineType() {
		return this.engineType;
	}
	

		
	@Override
	public String toString() {
		return ("The Car Id is: "+ this.getId());
	}
	
	//Abstract Method
	public abstract void ShowCharacteristics();
}

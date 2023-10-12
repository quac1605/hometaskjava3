package hometask.three;

public class BEV extends Vehicle{

	public BEV(int id, Manufacture brand, String model, int yearManufacture, Color color, int price,
			int registrationNumber, ElectricEngine engineType) {
		super(id, brand, model, yearManufacture, color, price, registrationNumber, engineType);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void ShowCharacteristics() {
		System.out.println("Vehicle id " + this.id +" is Battery Electric Vehicle!!");
	}
}

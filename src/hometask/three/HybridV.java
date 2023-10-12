package hometask.three;

public class HybridV extends Vehicle{

	public HybridV(int id, Manufacture brand, String model, int yearManufacture, Color color, int price,
			int registrationNumber, HybridEngine engineType) {
		super(id, brand, model, yearManufacture, color, price, registrationNumber, engineType);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void ShowCharacteristics() {
		System.out.println("Vehicle id " + this.id +" is Hybrid Vehicle!!");
	}
}
